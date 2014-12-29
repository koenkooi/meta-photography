SUMMARY = "Read, Write and Edit Meta Information!"
HOMEPAGE = "http://www.sno.phy.queensu.ca/~phil/exiftool/"

LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://perl-Image-ExifTool.spec;beginline=5;endline=5;md5=ffefffc98dab025cb49489bd4d88ee10"

SRC_URI = "http://www.sno.phy.queensu.ca/~phil/exiftool/Image-ExifTool-${PV}.tar.gz"
SRC_URI[md5sum] = "a0ca36792209f3ab2459ecd365a6e16a"
SRC_URI[sha256sum] = "b85c66bc8f6a3b151b3258954969b8fa77c25f0f28be1ba45c6fc1877e12455f"

S = "${WORKDIR}/Image-ExifTool-${PV}"

inherit cpan
