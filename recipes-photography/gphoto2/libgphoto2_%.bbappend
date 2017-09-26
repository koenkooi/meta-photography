FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://20-gphoto.conf \
"
do_install_append() {
    install -d ${D}/lib/udev/hwdb/
    install -m 0644 ${WORKDIR}/20-gphoto.conf ${D}/lib/udev/hwdb/
}

FILES_${PN} += "/lib/udev/*"

