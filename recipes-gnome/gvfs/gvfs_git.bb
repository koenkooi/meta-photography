require gvfs.inc

DEPENDS = "libsoup-2.4 gnome-keyring glib-2.0 avahi gconf libgphoto2 intltool-native"
# optional: obexftp libcdio libimobiledevice 

# in case of gnome-disk-utility was alresdy built: avoid double files
# afc is enabled when it detects libimobiledevice
EXTRA_OECONF += "--disable-gdu --disable-afc --disable-documentation "

PACKAGES =+ "gvfsd-ftp gvfsd-sftp gvfsd-trash"

FILES_${PN} += "${datadir}/glib-2.0 ${datadir}/GConf ${libdir}/gio/modules/*.so"
FILES_${PN}-dbg += "${libdir}/gio/modules/.debug/*"
FILES_${PN}-dev += "${libdir}/gio/modules/*.la"

FILES_gvfsd-ftp = "${libexecdir}/gvfsd-ftp ${datadir}/gvfs/mounts/ftp.mount"
FILES_gvfsd-sftp = "${libexecdir}/gvfsd-sftp ${datadir}/gvfs/mounts/sftp.mount"
FILES_gvfsd-trash = "${libexecdir}/gvfsd-trash ${datadir}/gvfs/mounts/trash.mount"

RDEPENDS_${PN} = "gvfs-gdu-volume-monitor"
RRECOMMENDS_gvfsd-ftp += "openssh-sftp openssh-ssh"

PACKAGECONFIG ?= "fuse archive cdda obexftp \
                  ${@bb.utils.contains('INCOMPATIBLE_LICENSE', 'GPLv3', '', 'samba', d)} \
                  ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'systemd', '', d)} \
                 "

PACKAGECONFIG[samba] = "--enable-samba --with-samba-includes=${STAGING_INCDIR} \
                        --with-samba-libs=${STAGING_LIBDIR}, --disable-samba, samba"
# needs meta-filesystems
PACKAGECONFIG[fuse] = "--enable-fuse, --disable-fuse, fuse"
PACKAGECONFIG[archive] = "--enable-archive, --disable-archive, libarchive"
PACKAGECONFIG[obexftp] = "--enable-obexftp, --disable-obexftp, bluez5 expat"
PACKAGECONFIG[cdda] = "--enable-cdda, --disable-cdda, libcdio"
PACKAGECONFIG[systemd] = "--enable-libsystemd-login, --disable-libsystemd-login, systemd"

