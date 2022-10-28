inherit pypi python_setuptools_build_meta

SUMMARY = "Jupyter Widgets JupyterLab Extension"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f4ed468cfaf9b7607da1aa5b55d242c"

PYPI_PACKAGE="jupyterlab_widgets"
# PN="python3-jupyterlab_widgets"

S="${WORKDIR}/jupyterlab_widgets-${PV}"
DEPENDS+= " \
	${PYTHON_PN}-jupyter-packaging-native \
"

# PYPI_SRC_URI="https://files.pythonhosted.org/packages/18/73/038e0264244f6cbc9c86748cc9390a98d6e1a174adc2a63f24c52367b32b/jupyterlab-widgets-1.1.1.tar.gz"
SRC_URI[md5sum] = "dfe63dfb8e8c4053152f3dbb76712c57"
SRC_URI[sha256sum] = "67d0ef1e407e0c42c8ab60b9d901cd7a4c68923650763f75bf17fb06c1943b79"

FILES:${PN} += "/usr/share/jupyter/labextensions"
