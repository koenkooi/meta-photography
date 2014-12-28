SUMMARY = "a generic C++ library for image analysis"
HOMEPAGE = "http://hci.iwr.uni-heidelberg.de/vigra/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3c8d5650f165c9d2bf413c64aa33dc15"

DEPENDS = "tiff zlib libpng fftw boost"

inherit cmake binconfig

SRCREV = "3fe3057b94f53ccb5d2881b9880ddaab1f243845"
SRC_URI = "git://github.com/ukoethe/vigra.git"

S = "${WORKDIR}/git"

# Clean up stray .css file
do_install_append() {
    rm -rf ${D}${prefix}/doc
}

FILES_${PN}-dev += "${libdir}/vigra"
