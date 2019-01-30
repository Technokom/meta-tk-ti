# tk base image
# gives you a small image with package manager

require tk-image.inc

IMAGE_INSTALL += " packagegroup-tk-base \
                   packagegroup-tk-debug \
"

export IMAGE_BASENAME = "tk-base-image"
