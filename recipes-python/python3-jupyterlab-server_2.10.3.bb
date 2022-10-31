SUMMARY = "JupyterLab Server"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=16b24abb4aef09551533365c88c785cf"

PYPI_PACKAGE = "jupyterlab_server"

inherit pypi python_setuptools_build_meta

DEPENDS += " \
       ${PYTHON_PN}-jupyter-server-native \
       ${PYTHON_PN}-anyio-native \
       ${PYTHON_PN}-sniffio-native \
       ${PYTHON_PN}-websocket-client-native \
       ${PYTHON_PN}-jupyter-packaging-native \
"

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-notebook \
        ${PYTHON_PN}-jsonschema \
        ${PYTHON_PN}-json5 \
        "

SRC_URI[sha256sum] = "3fb84a5813d6d836ceda773fb2d4e9ef3c7944dbc1b45a8d59d98641a80de80a"