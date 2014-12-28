SUMMARY = "Enblend combines images that overlap like this into a single large image with no seams."

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "tiff lcms vigra gsl boost"

SRC_URI = "http://netcologne.dl.sourceforge.net/project/enblend/enblend-enfuse/enblend-enfuse-4.1/enblend-enfuse-${PV}.tar.gz"
SRC_URI[md5sum] = "a025137ba53fc8a355347fe721c6267c"
SRC_URI[sha256sum] = "1c00ae95cd05502759d7d47f99e6ba1150f8807f8f4f46c800cd46c5ad0df9ac"

inherit autotools pkgconfig

