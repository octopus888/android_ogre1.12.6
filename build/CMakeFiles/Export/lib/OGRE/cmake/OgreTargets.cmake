# Generated by CMake

if("${CMAKE_MAJOR_VERSION}.${CMAKE_MINOR_VERSION}" LESS 2.5)
   message(FATAL_ERROR "CMake >= 2.6.0 required")
endif()
cmake_policy(PUSH)
cmake_policy(VERSION 2.6)
#----------------------------------------------------------------
# Generated CMake target import file.
#----------------------------------------------------------------

# Commands may need to know the format version.
set(CMAKE_IMPORT_FILE_VERSION 1)

# Protect against multiple inclusion, which would fail when already imported targets are added once more.
set(_targetsDefined)
set(_targetsNotDefined)
set(_expectedTargets)
foreach(_expectedTarget OgreMain OgreGLSupport RenderSystem_GLES2 Plugin_OctreeSceneManager Plugin_BSPSceneManager Codec_STBI Codec_FreeImage Plugin_ParticleFX Plugin_DotScene OgreBites OgrePaging OgreMeshLodGenerator OgreProperty OgreTerrain OgreRTShaderSystem OgreVolume OgreOverlay)
  list(APPEND _expectedTargets ${_expectedTarget})
  if(NOT TARGET ${_expectedTarget})
    list(APPEND _targetsNotDefined ${_expectedTarget})
  endif()
  if(TARGET ${_expectedTarget})
    list(APPEND _targetsDefined ${_expectedTarget})
  endif()
endforeach()
if("${_targetsDefined}" STREQUAL "${_expectedTargets}")
  unset(_targetsDefined)
  unset(_targetsNotDefined)
  unset(_expectedTargets)
  set(CMAKE_IMPORT_FILE_VERSION)
  cmake_policy(POP)
  return()
endif()
if(NOT "${_targetsDefined}" STREQUAL "")
  message(FATAL_ERROR "Some (but not all) targets in this export set were already defined.\nTargets Defined: ${_targetsDefined}\nTargets not yet defined: ${_targetsNotDefined}\n")
endif()
unset(_targetsDefined)
unset(_targetsNotDefined)
unset(_expectedTargets)


# Compute the installation prefix relative to this file.
get_filename_component(_IMPORT_PREFIX "${CMAKE_CURRENT_LIST_FILE}" PATH)
get_filename_component(_IMPORT_PREFIX "${_IMPORT_PREFIX}" PATH)
get_filename_component(_IMPORT_PREFIX "${_IMPORT_PREFIX}" PATH)
get_filename_component(_IMPORT_PREFIX "${_IMPORT_PREFIX}" PATH)
if(_IMPORT_PREFIX STREQUAL "/")
  set(_IMPORT_PREFIX "")
endif()

# Create imported target OgreMain
add_library(OgreMain STATIC IMPORTED)

set_target_properties(OgreMain PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE"
  INTERFACE_LINK_LIBRARIES "E:/work/ogre_1.12.5/AndroidDependencies/lib/libzziplib.a;\$<LINK_ONLY:ZLIB::ZLIB>;\$<LINK_ONLY:dl>"
)

# Create imported target OgreGLSupport
add_library(OgreGLSupport STATIC IMPORTED)

set_target_properties(OgreGLSupport PROPERTIES
  INTERFACE_LINK_LIBRARIES "OgreMain"
)

# Create imported target RenderSystem_GLES2
add_library(RenderSystem_GLES2 STATIC IMPORTED)

set_target_properties(RenderSystem_GLES2 PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/RenderSystems/GLES2"
  INTERFACE_LINK_LIBRARIES "OgreMain;OgreGLSupport;C:/Users/lrt/AppData/Local/Android/Sdk/ndk-bundle/platforms/android-18/arch-arm/usr/lib/libGLESv2.so;dl"
)

# Create imported target Plugin_OctreeSceneManager
add_library(Plugin_OctreeSceneManager STATIC IMPORTED)

set_target_properties(Plugin_OctreeSceneManager PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Plugins/OctreeSceneManager"
  INTERFACE_LINK_LIBRARIES "OgreMain"
)

# Create imported target Plugin_BSPSceneManager
add_library(Plugin_BSPSceneManager STATIC IMPORTED)

set_target_properties(Plugin_BSPSceneManager PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Plugins/BSPSceneManager"
  INTERFACE_LINK_LIBRARIES "OgreMain"
)

# Create imported target Codec_STBI
add_library(Codec_STBI STATIC IMPORTED)

set_target_properties(Codec_STBI PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Plugins/STBICodec"
  INTERFACE_LINK_LIBRARIES "OgreMain;\$<LINK_ONLY:ZLIB::ZLIB>"
)

# Create imported target Codec_FreeImage
add_library(Codec_FreeImage STATIC IMPORTED)

set_target_properties(Codec_FreeImage PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Plugins/FreeImageCodec"
  INTERFACE_LINK_LIBRARIES "OgreMain;E:/work/ogre_1.12.5/AndroidDependencies/lib/libFreeImage.a"
)

# Create imported target Plugin_ParticleFX
add_library(Plugin_ParticleFX STATIC IMPORTED)

set_target_properties(Plugin_ParticleFX PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Plugins/ParticleFX"
  INTERFACE_LINK_LIBRARIES "OgreMain"
)

# Create imported target Plugin_DotScene
add_library(Plugin_DotScene STATIC IMPORTED)

set_target_properties(Plugin_DotScene PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Plugins/DotScene"
  INTERFACE_LINK_LIBRARIES "OgreMain;E:/work/ogre_1.12.5/PlugIns/DotScene/../../AndroidDependencies/lib/libpugixml.a;OgreTerrain"
)

# Create imported target OgreBites
add_library(OgreBites STATIC IMPORTED)

set_target_properties(OgreBites PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Bites"
  INTERFACE_LINK_LIBRARIES "OgreMain;OgreOverlay;\$<LINK_ONLY:Plugin_OctreeSceneManager>;\$<LINK_ONLY:Plugin_BSPSceneManager>;\$<LINK_ONLY:Plugin_ParticleFX>;\$<LINK_ONLY:Plugin_DotScene>;\$<LINK_ONLY:Codec_STBI>;\$<LINK_ONLY:Codec_FreeImage>;\$<LINK_ONLY:RenderSystem_GLES2>;OgreRTShaderSystem"
)

# Create imported target OgrePaging
add_library(OgrePaging STATIC IMPORTED)

set_target_properties(OgrePaging PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Paging"
  INTERFACE_LINK_LIBRARIES "OgreMain"
)

# Create imported target OgreMeshLodGenerator
add_library(OgreMeshLodGenerator STATIC IMPORTED)

set_target_properties(OgreMeshLodGenerator PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/MeshLodGenerator"
  INTERFACE_LINK_LIBRARIES "OgreMain"
)

# Create imported target OgreProperty
add_library(OgreProperty STATIC IMPORTED)

set_target_properties(OgreProperty PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Property"
  INTERFACE_LINK_LIBRARIES "OgreMain"
)

# Create imported target OgreTerrain
add_library(OgreTerrain STATIC IMPORTED)

set_target_properties(OgreTerrain PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Terrain"
  INTERFACE_LINK_LIBRARIES "OgreMain;OgrePaging"
)

# Create imported target OgreRTShaderSystem
add_library(OgreRTShaderSystem STATIC IMPORTED)

set_target_properties(OgreRTShaderSystem PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/RTShaderSystem"
  INTERFACE_LINK_LIBRARIES "OgreMain"
)

# Create imported target OgreVolume
add_library(OgreVolume STATIC IMPORTED)

set_target_properties(OgreVolume PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Volume"
  INTERFACE_LINK_LIBRARIES "OgreMain"
)

# Create imported target OgreOverlay
add_library(OgreOverlay STATIC IMPORTED)

set_target_properties(OgreOverlay PROPERTIES
  INTERFACE_INCLUDE_DIRECTORIES "${_IMPORT_PREFIX}/include/OGRE/Overlay"
  INTERFACE_LINK_LIBRARIES "OgreMain;E:/work/ogre_1.12.5/AndroidDependencies/lib/libfreetype.a;\$<LINK_ONLY:ZLIB::ZLIB>"
)

if(CMAKE_VERSION VERSION_LESS 2.8.12)
  message(FATAL_ERROR "This file relies on consumers using CMake 2.8.12 or greater.")
endif()

# Load information for each installed configuration.
get_filename_component(_DIR "${CMAKE_CURRENT_LIST_FILE}" PATH)
file(GLOB CONFIG_FILES "${_DIR}/OgreTargets-*.cmake")
foreach(f ${CONFIG_FILES})
  include(${f})
endforeach()

# Cleanup temporary variables.
set(_IMPORT_PREFIX)

# Loop over all imported files and verify that they actually exist
foreach(target ${_IMPORT_CHECK_TARGETS} )
  foreach(file ${_IMPORT_CHECK_FILES_FOR_${target}} )
    if(NOT EXISTS "${file}" )
      message(FATAL_ERROR "The imported target \"${target}\" references the file
   \"${file}\"
but this file does not exist.  Possible reasons include:
* The file was deleted, renamed, or moved to another location.
* An install or uninstall procedure did not complete successfully.
* The installation package was faulty and contained
   \"${CMAKE_CURRENT_LIST_FILE}\"
but not all the files it references.
")
    endif()
  endforeach()
  unset(_IMPORT_CHECK_FILES_FOR_${target})
endforeach()
unset(_IMPORT_CHECK_TARGETS)

# This file does not depend on other imported targets which have
# been exported from the same project but in a separate export set.

# Commands beyond this point should not need to know the version.
set(CMAKE_IMPORT_FILE_VERSION)
cmake_policy(POP)
