SUMMARY = "libgphoto2 allows you to access digital cameras"
SECTION = "libs"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0448d3676bc0de00406af227d341a4d1"

DEPENDS = "libtool jpeg virtual/libusb0 libexif"

# The .conf and .rules files were generated with:
#  libgphoto2-2.4.7/packaging/generic$ qemu-arm -L /OE/angstrom-dev/sysroots/qemuarm/ .libs/print-camera-list
# They are release specific, so please regen when adding new releases

SRC_URI = "${SOURCEFORGE_MIRROR}/gphoto/libgphoto/${PV}/libgphoto2-${PV}.tar.bz2;name=libgphoto2 \
           file://0001-configure.ac-remove-AM_PO_SUBDIRS.patch \
           file://20-gphoto.conf \
           file://40-libgphoto2.rules \
"
SRC_URI[libgphoto2.md5sum] = "8b0cd5e382544202759fc0e1f1bfbd04"
SRC_URI[libgphoto2.sha256sum] = "fc3154a86f559de46ad2ac571f951f21c2d2db3cc782794d7567e4e8ab6986f3"

inherit autotools pkgconfig gettext lib_package binconfig

EXTRA_OECONF = " --with-drivers=all \
                 --with-libxml-2.0=no \
                 udevscriptdir=/lib/udev \
                 ac_cv_lib_ltdl_lt_dlcaller_register=yes \
                "

PACKAGECONFIG ??= ""
PACKAGECONFIG[gd] = "--enable-gd,--disable-gd,gd"
PACKAGECONFIG[serial] = "--enable-serial,--disable-serial,lockdev"

CFLAGS += "-D_DEFAULT_SOURCE "

do_configure_append() {
    cp ${STAGING_DATADIR}/gettext/po/Makefile.in.in ${S}/libgphoto2_port/po/
    cd ${S}/libgphoto2_port/
    autoreconf -Wcross --verbose --install --force ${EXTRA_AUTORECONF} $acpaths
}

do_install_append() {
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0755 ${WORKDIR}/*.rules ${D}${sysconfdir}/udev/rules.d/

    install -d ${D}/lib/udev/hwdb/
    install -m 0644 ${WORKDIR}/20-gphoto.conf ${D}/lib/udev/hwdb/
}

PACKAGES =+ "libgphotoport libgphoto2-camlibs"
FILES_libgphoto2-camlibs = "${libdir}/libgphoto2*/*/*.so*"
RRECOMMENDS_${PN} = "libgphoto2-camlibs"
RDEPENDS_${PN} = "bash"

FILES_libgphotoport = "${libdir}/libgphoto2_port.so.*"

FILES_${PN} += "/lib/udev/*"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
FILES_${PN}-dev += "${libdir}/*/*/*.la"



