SUMMARY = "Read, Write and Edit Meta Information!"
HOMEPAGE = "http://www.sno.phy.queensu.ca/~phil/exiftool/"

LICENSE = "GPLv1"
LIC_FILES_CHKSUM = "file://perl-Image-ExifTool.spec;beginline=5;endline=5;md5=ffefffc98dab025cb49489bd4d88ee10"

SRC_URI = "git://github.com/exiftool/exiftool.git;protocol=https"
SRCREV = "7e2737c0ea4e812ff81f189db3693cd55dc0485b"

PV = "12.05"

S = "${WORKDIR}/git"

inherit cpan
