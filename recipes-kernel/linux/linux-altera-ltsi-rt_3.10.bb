LINUX_VERSION = "3.10"
LINUX_VERSION_SUFFIX = "-ltsi-rt"

SRCREV = "ef8b7fee9f81be67c97e461aa138a1b066f5e0a4"

KERNEL_DEVICETREE_cyclone5 ?= "socfpga_cyclone5.dtb"
KERNEL_DEVICETREE_arria5 ?= "socfpga_arria5.dtb"

include linux-altera.inc
