inherit pypi python_flit_core

SUMMARY = "Test utilities for code working with files and commands"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feaa34f99e130d0bc2e278b523a99cac"

PYPI_PACKAGE = "testpath"

S="${WORKDIR}/testpath-${PV}"

SRC_URI[sha256sum] = "2f1b97e6442c02681ebe01bd84f531028a7caea1af3825000f52345c30285e0f"

BBCLASSEXTEND = "native"
