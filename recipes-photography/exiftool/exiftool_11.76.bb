SUMMARY = "Read, Write and Edit Meta Information!"
HOMEPAGE = "http://www.sno.phy.queensu.ca/~phil/exiftool/"

LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://perl-Image-ExifTool.spec;beginline=5;endline=5;md5=ffefffc98dab025cb49489bd4d88ee10"

SRC_URI = "git://github.com/exiftool/exiftool.git;protocol=https"
SRCREV = "e5b0ae81cac5907bd99fbc82e1938e2bc1308db2"

S = "${WORKDIR}/git"

inherit cpan
