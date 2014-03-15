DESCRIPTION = "Customize /etc/issue"
LICENSE = "Mine"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a581319d5ee737aed106df9020946c7f"
SRC_URI = "file://issue file://LICENSE"
FILES_${PN} += "${sysconfdir}/issue"

do_install() {
	 install -m 0644 ${WORKDIR}/issue ${D}${sysconfdir}
}

