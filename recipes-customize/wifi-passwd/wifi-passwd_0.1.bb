DESCRIPTION = "Customize /etc/wpa_supplicant.conf"
LICENSE = "GPLv2"
SRC_URI = "file://wpa_supplicant.conf"
FILES_${PN} += "${sysconfdir}/wpa_supplicant.conf"

do_install() {
	 install -m 0644 wpa_supplicant.conf ${D}${sysconfdir}
}

