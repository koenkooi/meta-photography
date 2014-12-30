SUMMARY = "gPhoto is a program and library framework that lets users download pictures from their digital cameras."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

DEPENDS = "libgphoto2 jpeg readline libexif popt"

SRC_URI = "${SOURCEFORGE_MIRROR}/gphoto/gphoto/${PV}/gphoto2-${PV}.tar.bz2 \
           file://0001-configure.ac-remove-AM_PO_SUBDIRS.patch \
          "
SRC_URI[md5sum] = "b03ab805cf8676d1520d0cfc02afdb5f"
SRC_URI[sha256sum] = "55e5ec8b2bba4ed358f15eda466f61c79d6f75c220237f821ac687a3ceb336e8"

inherit autotools pkgconfig gettext

CFLAGS += "-D_DEFAULT_SOURCE "

export POPT_CFLAGS = "-I${STAGING_INCDIR}"
export POPT_LIBS = "-lpopt"


