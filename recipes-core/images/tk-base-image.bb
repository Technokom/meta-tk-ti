# tk base image
# gives you a small image with package manager

require tk-image.inc

IMAGE_INSTALL += " packagegroup-tk-base"

export IMAGE_BASENAME = "tk-base-image"
