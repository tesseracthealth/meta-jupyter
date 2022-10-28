inherit pypi python_setuptools_build_meta

DEPENDS += " \
	${PYTHON_PN}-prompt-toolkit-native \
	"

SUMMARY = "Jupyter notebook"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=86d7909bba8bb8a03637ab8020bf6071"

DEPENDS += " \
        ${PYTHON_PN}-ipython-native \
        ${PYTHON_PN}-traitlets-native \
        ${PYTHON_PN}-six-native \
        ${PYTHON_PN}-ipython-genutils-native \
        ${PYTHON_PN}-decorator-native \
        ${PYTHON_PN}-pygments-native \
        ${PYTHON_PN}-pexpect-native \
        ${PYTHON_PN}-ptyprocess-native \
        ${PYTHON_PN}-pickleshare-native \
        ${PYTHON_PN}-backcall-native \
        ${PYTHON_PN}-wcwidth-native \
        ${PYTHON_PN}-jupyter-client-native \
        ${PYTHON_PN}-pyzmq-native \
        ${PYTHON_PN}-jupyter-core-native \
        ${PYTHON_PN}-simplegeneric-native \
        ${PYTHON_PN}-stack-data-native \
        "

RDEPENDS:${PN} += " \
        ${PYTHON_PN}-ipython \
        ${PYTHON_PN}-traitlets \
        ${PYTHON_PN}-tornado \
        ${PYTHON_PN}-debugpy \
        ${PYTHON_PN}-jupyter-client \
        ${PYTHON_PN}-simplegeneric \
        ${PYTHON_PN}-matplotlib-inline \
        ${PYTHON_PN}-stack-data \
        "

FILES:${PN} += "/usr/share/jupyter"

SRC_URI[sha256sum] = "91ff0058b45660aad4a68088041059c0d378cd53fc8aff60e5abc91bcc049353"

SRC_URI:append = " \
	file://0001-Modify-setup.py-to-set-exectuable-python3-when-build.patch \
"

