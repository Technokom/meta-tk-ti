DESCRIPTION = "Service utils"
LICENSE = "MIT"
PR = "r9"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup


ARAGO_DEBUG = "\
    htop \
    socat \
    util-linux \
    openssh-sftp-server \
    gdbserver \
    openssh \
    valgrind \
    e2fsprogs \
    nano \
    "


# minimal set of packages - needed to boot
RDEPENDS_${PN} = "\
    ${ARAGO_DEBUG} \
    "

