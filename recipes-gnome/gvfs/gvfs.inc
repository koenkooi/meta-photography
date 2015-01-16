DESCRIPTION = "gvfs is a userspace virtual filesystem"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=05df38dd77c35ec8431f212410a3329e"

inherit gnome

SRCREV = "c05f4bcbbe911becba8710dc3e6bdafdc586a36a"
PV = "1.14.2"
SRC_URI = "git://git.gnome.org/gvfs;branch=gnome-3-6 \
           file://0001-Revert-Respect-UDISKS_AUTOMOUNT_HINT-available-in-re.patch \
           file://0005-client-gdaemonfile.c-replace-g_memmove-by-memmove.patch \
"

S = "${WORKDIR}/git"

EXTRA_OECONF = "--with-archive-includes=${STAGING_INCDIR} \
                --with-archive-libs=${STAGING_LIBDIR} \
"

FILES_${PN} += "${datadir}/dbus-1/services/*"

