DESCRIPTION = "Basic task to get a device booting"
LICENSE = "MIT"
PR = "r9"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

ARAGO_ALSA_EXTRA = "\
    alsa-conf \
    alsa-conf-base \
    alsa-server \
    alsa-utils \
    alsa-utils-aconnect \
    alsa-utils-scripts \
    alsa-utils-alsactl \
    alsa-utils-alsamixer \
    alsa-utils-amixer \
    alsa-utils-iecset \
    alsa-utils-midi \
    alsa-utils-speakertest \
    alsa-state \
    "

ARAGO_ALSA_BASE = "\
    libasound \
    alsa-utils-aplay \
    "

ARAGO_BASE = "\
    module-init-tools \
    curl \
    initscript-telnetd \
    kernel-modules \
    ethtool \
    thermal-init \
    bash \
    udev-extraconf \
    "

# these require meta-openembedded/meta-oe layer
ARAGO_EXTRA = "\
    "

# minimal set of packages - needed to boot
RDEPENDS_${PN} = "\
    ${@bb.utils.contains('MACHINE_FEATURES', 'alsa', '${ARAGO_ALSA_BASE}', '',d)} \
    ${@bb.utils.contains('MACHINE_FEATURES', 'alsa', '${ARAGO_ALSA_EXTRA}', '',d)} \
    ${ARAGO_BASE} \
    ${ARAGO_EXTRA} \
    "
