# tk base image
# gives you a small image with package manager

require tk-image.inc

IMAGE_INSTALL += " packagegroup-tk-base \
                   ${@bb.utils.contains('MACHINE_FEATURES','sgx','packagegroup-tksdk-graphics','',d)} \
                   packagegroup-tksdk-qte \
                   packagegroup-tk-debug \
"

export IMAGE_BASENAME = "tk-base-image"
