SUMMARY = "Read, Write and Edit Meta Information!"
HOMEPAGE = "http://www.sno.phy.queensu.ca/~phil/exiftool/"

LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://perl-Image-ExifTool.spec;beginline=5;endline=5;md5=ffefffc98dab025cb49489bd4d88ee10"

SRC_URI = "git://github.com/exiftool/exiftool.git;protocol=https"
SRCREV = "66da18b6f5c4e40b1d37a1d6c16e95b25a5ab46e"

PV = "12.07"

S = "${WORKDIR}/git"

inherit cpan
