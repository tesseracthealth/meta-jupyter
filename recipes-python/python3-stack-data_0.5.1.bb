# The is automatic generated Code by "makePipRecipes.py"
# (build by Robin Sebastian (https://github.com/robseb) (git@robseb.de) Vers.: 1.2) 

SUMMARY = "Recipe to embedded the Python PiP Package stack_data"
HOMEPAGE ="https://pypi.org/project/stack_data"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a3d6c15f7859ae235a78f2758e5a48cf"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-executing \
    ${PYTHON_PN}-asttokens \
    ${PYTHON_PN}-pure-eval \
"

PYPI_PACKAGE = "stack_data"
SRC_URI[md5sum] = "80a758cf84b583615957e886fd77608c"
SRC_URI[sha256sum] = "95eb784942e861a3d80efd549ff9af6cf847d88343a12eb681d7157cfcb6e32b"

BBCLASSEXTEND = "native"
