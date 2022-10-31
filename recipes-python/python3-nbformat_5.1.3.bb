inherit pypi setuptools3

SUMMARY = "The Jupyter Notebook format"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=d235895c780fa844e875697e16e5787b"

SRC_URI[sha256sum] = "b516788ad70771c6250977c1374fcca6edebe6126fd2adb5a69aa5c2356fd1c8"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-jsonschema \
        ${PYTHON_PN}-ipython-genutils \
        ${PYTHON_PN}-jupyter-core \
        "
BBCLASSEXTEND = "native"
