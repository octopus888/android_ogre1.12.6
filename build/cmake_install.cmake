# Install script for directory: E:/work/ogre_1.12.5

# Set the install prefix
if(NOT DEFINED CMAKE_INSTALL_PREFIX)
  set(CMAKE_INSTALL_PREFIX "C:/Program Files (x86)/OGRE")
endif()
string(REGEX REPLACE "/$" "" CMAKE_INSTALL_PREFIX "${CMAKE_INSTALL_PREFIX}")

# Set the install configuration name.
if(NOT DEFINED CMAKE_INSTALL_CONFIG_NAME)
  if(BUILD_TYPE)
    string(REGEX REPLACE "^[^A-Za-z0-9_]+" ""
           CMAKE_INSTALL_CONFIG_NAME "${BUILD_TYPE}")
  else()
    set(CMAKE_INSTALL_CONFIG_NAME "RelWithDebInfo")
  endif()
  message(STATUS "Install configuration: \"${CMAKE_INSTALL_CONFIG_NAME}\"")
endif()

# Set the component getting installed.
if(NOT CMAKE_INSTALL_COMPONENT)
  if(COMPONENT)
    message(STATUS "Install component: \"${COMPONENT}\"")
    set(CMAKE_INSTALL_COMPONENT "${COMPONENT}")
  else()
    set(CMAKE_INSTALL_COMPONENT)
  endif()
endif()

# Install shared libraries without execute permission?
if(NOT DEFINED CMAKE_INSTALL_SO_NO_EXE)
  set(CMAKE_INSTALL_SO_NO_EXE "0")
endif()

# Is this installation the result of a crosscompile?
if(NOT DEFINED CMAKE_CROSSCOMPILING)
  set(CMAKE_CROSSCOMPILING "TRUE")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/pkgconfig" TYPE FILE FILES "E:/work/ogre_1.12.5/build/pkgconfig/OGRE.pc")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/pkgconfig" TYPE FILE FILES "E:/work/ogre_1.12.5/build/pkgconfig/OGRE-Paging.pc")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/pkgconfig" TYPE FILE FILES "E:/work/ogre_1.12.5/build/pkgconfig/OGRE-MeshLodGenerator.pc")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/pkgconfig" TYPE FILE FILES "E:/work/ogre_1.12.5/build/pkgconfig/OGRE-Terrain.pc")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/pkgconfig" TYPE FILE FILES "E:/work/ogre_1.12.5/build/pkgconfig/OGRE-RTShaderSystem.pc")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/pkgconfig" TYPE FILE FILES "E:/work/ogre_1.12.5/build/pkgconfig/OGRE-Property.pc")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/pkgconfig" TYPE FILE FILES "E:/work/ogre_1.12.5/build/pkgconfig/OGRE-Overlay.pc")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/pkgconfig" TYPE FILE FILES "E:/work/ogre_1.12.5/build/pkgconfig/OGRE-Volume.pc")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/pkgconfig" TYPE FILE FILES "E:/work/ogre_1.12.5/build/pkgconfig/OGRE-Bites.pc")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/share/OGRE" TYPE FILE FILES
    "E:/work/ogre_1.12.5/build/inst/bin/resources.cfg"
    "E:/work/ogre_1.12.5/build/inst/bin/plugins.cfg"
    "E:/work/ogre_1.12.5/build/inst/bin/samples.cfg"
    "E:/work/ogre_1.12.5/build/inst/bin/tests.cfg"
    )
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake" TYPE FILE FILES
    "E:/work/ogre_1.12.5/build/cmake/OGREConfig.cmake"
    "E:/work/ogre_1.12.5/build/cmake/OGREConfigVersion.cmake"
    )
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ee][Aa][Ss][Ee]|[Nn][Oo][Nn][Ee]|)$")
    if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake")
      file(DIFFERENT EXPORT_FILE_CHANGED FILES
           "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake"
           "E:/work/ogre_1.12.5/build/CMakeFiles/Export/lib/OGRE/cmake/OgreTargets.cmake")
      if(EXPORT_FILE_CHANGED)
        file(GLOB OLD_CONFIG_FILES "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets-*.cmake")
        if(OLD_CONFIG_FILES)
          message(STATUS "Old export file \"$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake\" will be replaced.  Removing files [${OLD_CONFIG_FILES}].")
          file(REMOVE ${OLD_CONFIG_FILES})
        endif()
      endif()
    endif()
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake" TYPE FILE FILES "E:/work/ogre_1.12.5/build/CMakeFiles/Export/lib/OGRE/cmake/OgreTargets.cmake")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ee][Aa][Ss][Ee]|[Nn][Oo][Nn][Ee]|)$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
    if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake")
      file(DIFFERENT EXPORT_FILE_CHANGED FILES
           "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake"
           "E:/work/ogre_1.12.5/build/CMakeFiles/Export/lib/OGRE/cmake/OgreTargets.cmake")
      if(EXPORT_FILE_CHANGED)
        file(GLOB OLD_CONFIG_FILES "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets-*.cmake")
        if(OLD_CONFIG_FILES)
          message(STATUS "Old export file \"$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake\" will be replaced.  Removing files [${OLD_CONFIG_FILES}].")
          file(REMOVE ${OLD_CONFIG_FILES})
        endif()
      endif()
    endif()
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake" TYPE FILE FILES "E:/work/ogre_1.12.5/build/CMakeFiles/Export/lib/OGRE/cmake/OgreTargets.cmake")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake" TYPE FILE FILES "E:/work/ogre_1.12.5/build/CMakeFiles/Export/lib/OGRE/cmake/OgreTargets-relwithdebinfo.cmake")
  endif()
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
    if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake")
      file(DIFFERENT EXPORT_FILE_CHANGED FILES
           "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake"
           "E:/work/ogre_1.12.5/build/CMakeFiles/Export/lib/OGRE/cmake/OgreTargets.cmake")
      if(EXPORT_FILE_CHANGED)
        file(GLOB OLD_CONFIG_FILES "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets-*.cmake")
        if(OLD_CONFIG_FILES)
          message(STATUS "Old export file \"$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake\" will be replaced.  Removing files [${OLD_CONFIG_FILES}].")
          file(REMOVE ${OLD_CONFIG_FILES})
        endif()
      endif()
    endif()
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake" TYPE FILE FILES "E:/work/ogre_1.12.5/build/CMakeFiles/Export/lib/OGRE/cmake/OgreTargets.cmake")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
    if(EXISTS "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake")
      file(DIFFERENT EXPORT_FILE_CHANGED FILES
           "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake"
           "E:/work/ogre_1.12.5/build/CMakeFiles/Export/lib/OGRE/cmake/OgreTargets.cmake")
      if(EXPORT_FILE_CHANGED)
        file(GLOB OLD_CONFIG_FILES "$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets-*.cmake")
        if(OLD_CONFIG_FILES)
          message(STATUS "Old export file \"$ENV{DESTDIR}${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake/OgreTargets.cmake\" will be replaced.  Removing files [${OLD_CONFIG_FILES}].")
          file(REMOVE ${OLD_CONFIG_FILES})
        endif()
      endif()
    endif()
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE/cmake" TYPE FILE FILES "E:/work/ogre_1.12.5/build/CMakeFiles/Export/lib/OGRE/cmake/OgreTargets.cmake")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/share/OGRE/Media/" TYPE DIRECTORY FILES "E:/work/ogre_1.12.5/Media/ShadowVolume")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/share/OGRE/Media" TYPE DIRECTORY FILES "E:/work/ogre_1.12.5/Samples/Media/")
endif()

if(NOT CMAKE_INSTALL_LOCAL_ONLY)
  # Include the install script for each subdirectory.
  include("E:/work/ogre_1.12.5/build/OgreMain/cmake_install.cmake")
  include("E:/work/ogre_1.12.5/build/RenderSystems/cmake_install.cmake")
  include("E:/work/ogre_1.12.5/build/PlugIns/cmake_install.cmake")
  include("E:/work/ogre_1.12.5/build/Components/cmake_install.cmake")
  include("E:/work/ogre_1.12.5/build/Samples/cmake_install.cmake")
  include("E:/work/ogre_1.12.5/build/Docs/cmake_install.cmake")
  include("E:/work/ogre_1.12.5/build/cmake/cmake_install.cmake")

endif()

if(CMAKE_INSTALL_COMPONENT)
  set(CMAKE_INSTALL_MANIFEST "install_manifest_${CMAKE_INSTALL_COMPONENT}.txt")
else()
  set(CMAKE_INSTALL_MANIFEST "install_manifest.txt")
endif()

string(REPLACE ";" "\n" CMAKE_INSTALL_MANIFEST_CONTENT
       "${CMAKE_INSTALL_MANIFEST_FILES}")
file(WRITE "E:/work/ogre_1.12.5/build/${CMAKE_INSTALL_MANIFEST}"
     "${CMAKE_INSTALL_MANIFEST_CONTENT}")
