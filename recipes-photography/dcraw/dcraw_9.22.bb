SUMMARY = "Decoding raw digital photos"
HOMEPAGE = "http://cybercom.net/~dcoffin/dcraw/"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://dcraw.c;beginline=5;endline=20;md5=96ff411a9c70011821d28543a6c64216"

DEPENDS = "jpeg jasper lcms"

SRC_URI = "file://dcraw.c"

do_configure_prepend() {
    install -d ${S}
    cp ${WORKDIR}/dcraw.c ${S}
}

do_compile() {
    ${CC} -o dcraw dcraw.c -lm -ljasper -ljpeg -llcms2 ${CFLAGS} ${LDFLAGS}
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 dcraw ${D}${bindir}
}
