require connman.inc

SRC_URI  = "${KERNELORG_MIRROR}/linux/network/${BPN}/${BP}.tar.xz \
            file://0001-plugin.h-Change-visibility-to-default-for-debug-symb.patch \
            file://0001-connman.service-stop-systemd-resolved-when-we-use-co.patch \
            file://0001-gweb-fix-segfault-with-musl-v1.1.21.patch \
            file://connman \
            file://no-version-scripts.patch \
            file://CVE-2021-26675.patch \
            file://CVE-2021-26676-0001.patch \
            file://CVE-2021-26676-0002.patch \
            file://CVE-2021-33833.patch \
            file://CVE-2022-23096-7.patch \
            file://CVE-2022-23098.patch \
            file://CVE-2022-32292.patch \
	     file://CVE-2022-32293.patch \
            file://CVE-2023-28488.patch \
"

SRC_URI_append_libc-musl = " file://0002-resolve-musl-does-not-implement-res_ninit.patch"

SRC_URI[md5sum] = "75012084f14fb63a84b116e66c6e94fb"
SRC_URI[sha256sum] = "6ce29b3eb0bb16a7387bc609c39455fd13064bdcde5a4d185fab3a0c71946e16"

RRECOMMENDS_${PN} = "connman-conf"
RCONFLICTS_${PN} = "networkmanager"
