require conf/machine/include/ti-soc.inc
SOC_FAMILY_append = ":ti43x"

DEFAULTTUNE ?= "armv7athf-neon"
require conf/machine/include/tune-cortexa9.inc

PREFERRED_PROVIDER_virtual/xserver = "xserver-xorg"

# For built-in LCD, add xf86-input-tslib
XSERVER = "xserver-xorg \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-video-fbdev \
           xf86-input-keyboard"

# Default to external video, change to smallscreen for built-in LCD
MACHINE_GUI_CLASS = "bigscreen"

# Increase this everytime you change something in the kernel
MACHINE_KERNEL_PR = "r3"

# Default providers, may need to override for specific machines
PREFERRED_PROVIDER_virtual/kernel_skit-am437x = "linux-ti-technokom"
PREFERRED_PROVIDER_virtual/bootloader = "u-boot-tk-staging"
PREFERRED_PROVIDER_u-boot = "u-boot-tk-staging"

KERNEL_IMAGETYPE = "zImage"

KERNEL_DEVICETREE = "tk-am437x-sk.dtb"


UBOOT_MACHINE = "tk-som-am43xx_config"

UBOOT_ARCH = "arm"
UBOOT_MACHINE = "tk-som-am43xx_config"

UBOOT_ENTRYPOINT = "0x80008000"
UBOOT_LOADADDRESS = "0x80008000"

EXTRA_IMAGEDEPENDS += "u-boot"

# List common SoC features, may need to add touchscreen for specific machines
MACHINE_FEATURES = "kernel26 apm usbgadget usbhost vfat ext2 screen alsa ethernet sgx"
