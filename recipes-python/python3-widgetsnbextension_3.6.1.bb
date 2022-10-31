inherit pypi setuptools3

SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"

SRC_URI[sha256sum] = "9c84ae64c2893c7cbe2eaafc7505221a795c27d68938454034ac487319a75b10"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-notebook \
        "

FILES:${PN} += " /usr/share/jupyter/nbextensions/* \
    /usr/etc/jupyter/* \ "

