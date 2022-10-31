inherit pypi setuptools3

SRC_URI[sha256sum] = "449ab8e7872d0f388ee5c5b3666b9d6af5e5618a5749fd62652680be37dff2af"

SUMMARY = "IPython HTML widgets for Jupyter"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20a40995a0b2f0ae1f2a70d2dc995bbf"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ipython \
        ${PYTHON_PN}-ipykernel \
        ${PYTHON_PN}-widgetsnbextension \
        ${PYTHON_PN}-traitlets \
        "
