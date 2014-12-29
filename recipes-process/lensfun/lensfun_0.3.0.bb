SUMMARY = "Library to correct optical lens defects and lens database"
HOMEPAGE = "http://lensfun.sourceforge.net/"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://README;beginline=24;endline=52;md5=65967b69e879c50caf8497cec77ec6d1"

DEPENDS = "glib-2.0 libpng"

SRC_URI = "${SOURCEFORGE_MIRROR}/lensfun/${PV}/lensfun-${PV}.tar.bz2 \
           file://0001-CMakeLists.txt-don-t-automatically-add-SSE-flags.patch \
          "
SRC_URI[md5sum] = "c553cb37f1b781d1af05787beacf0193"
SRC_URI[sha256sum] = "c2c3c03873cb549d49d42f118fcb0ffa95d1e45b9ff395e19facb63bf699bec1"

inherit cmake pkgconfig

# the findGLIB module needs to be in CMAKE_MODULE_PATH
do_configure_prepend() {
    echo 'set(CMAKE_MODULE_PATH ${CMAKE_MODULE_PATH} "${S}/build/CMakeModules")' >>  ${WORKDIR}/toolchain.cmake
}

EXTRA_OECMAKE = " -DS=${S}"
