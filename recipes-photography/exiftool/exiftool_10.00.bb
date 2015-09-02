SUMMARY = "Read, Write and Edit Meta Information!"
HOMEPAGE = "http://www.sno.phy.queensu.ca/~phil/exiftool/"

LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://perl-Image-ExifTool.spec;beginline=5;endline=5;md5=ffefffc98dab025cb49489bd4d88ee10"

SRC_URI = "http://www.sno.phy.queensu.ca/~phil/exiftool/Image-ExifTool-${PV}.tar.gz"
SRC_URI[md5sum] = "0093bf26c07c3c38a32f85cab32102cd"
SRC_URI[sha256sum] = "7b573331eba3921b56339018e95dd5e6f5a1e4634e4fc7bad91e5778da3571f4"

S = "${WORKDIR}/Image-ExifTool-${PV}"

inherit cpan
