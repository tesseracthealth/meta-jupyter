SUMMARY = "JupyterLab Server"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=23f9ad5cad3d8cc0336e2a5d8a87e1fa"

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