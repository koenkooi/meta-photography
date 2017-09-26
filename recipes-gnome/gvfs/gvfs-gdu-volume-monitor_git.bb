require recipes-gnome/gvfs/gvfs_1.32.1.bb

BPN = "gvfs"

DEPENDS = "gtk+ gvfs gnome-disk-utility libgnome-keyring intltool-native"

# we need gdu files only: reduce files to delete in libexecdir
EXTRA_OECONF += "--disable-gphoto2 \
                 --disable-afc \
                 --disable-samba \
                 --disable-documentation \
                "

do_install_append() {
    rm -rf ${D}${sysconfdir}
    rm -rf ${D}${bindir}
    rm -rf ${D}${includedir}
    rm -rf ${D}${libdir}/gio
    rm -rf ${D}${libdir}/lib*
    rmdir --ignore-fail-on-non-empty ${D}${libdir}
    rm -rf ${D}${datadir}/gvfs/mounts
    rm -rf ${D}${datadir}/glib-2.0
    rm -rf ${D}${datadir}/GConf
    rm -rf ${D}${datadir}/bash-completion
    rm -f ${D}${datadir}/dbus-1/services/gvfs-*
    rm -rf ${D}${datadir}/locale
    rm -f ${D}${libexecdir}/gvfsd*
    rm -f ${D}${libexecdir}/gvfs-fuse-daemon
    rm -f ${D}${libexecdir}/gvfs-gphoto2-volume-monitor
}
