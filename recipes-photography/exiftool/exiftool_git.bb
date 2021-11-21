SUMMARY = "Read, Write and Edit Meta Information!"
HOMEPAGE = "http://www.sno.phy.queensu.ca/~phil/exiftool/"

LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://perl-Image-ExifTool.spec;beginline=5;endline=5;md5=ffefffc98dab025cb49489bd4d88ee10"

SRC_URI = "git://github.com/exiftool/exiftool.git;protocol=https"
SRCREV = "9ceb6432cb71f892bdd1073599f8dfb7f373537d"

PV = "12.36"

S = "${WORKDIR}/git"

inherit cpan
