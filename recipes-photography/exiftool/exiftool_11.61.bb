SUMMARY = "Read, Write and Edit Meta Information!"
HOMEPAGE = "http://www.sno.phy.queensu.ca/~phil/exiftool/"

LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://perl-Image-ExifTool.spec;beginline=5;endline=5;md5=ffefffc98dab025cb49489bd4d88ee10"

SRC_URI = "http://www.sno.phy.queensu.ca/~phil/exiftool/Image-ExifTool-${PV}.tar.gz"
SRC_URI[md5sum] = "8c8a42d71a2cf2d5c151ce74da98ab8f"
SRC_URI[sha256sum] = "f959f3436fb4e42f7561ad56771454670f95110b0bcd099c1bc72eefb4de23e1"

S = "${WORKDIR}/Image-ExifTool-${PV}"

inherit cpan
