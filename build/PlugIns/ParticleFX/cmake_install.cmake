# Install script for directory: E:/work/ogre_1.12.5/PlugIns/ParticleFX

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
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ee][Aa][Ss][Ee]|[Nn][Oo][Nn][Ee]|)$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libPlugin_ParticleFXStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ee][Aa][Ss][Ee]|[Nn][Oo][Nn][Ee]|)$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libPlugin_ParticleFXStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libPlugin_ParticleFXStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libPlugin_ParticleFXStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/OGRE/Plugins/ParticleFX" TYPE FILE FILES
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreAreaEmitter.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreBoxEmitter.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreBoxEmitterFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreColourFaderAffector.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreColourFaderAffector2.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreColourFaderAffectorFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreColourFaderAffectorFactory2.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreColourImageAffector.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreColourImageAffectorFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreColourInterpolatorAffector.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreColourInterpolatorAffectorFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreCylinderEmitter.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreCylinderEmitterFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreDeflectorPlaneAffector.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreDeflectorPlaneAffectorFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreDirectionRandomiserAffector.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreDirectionRandomiserAffectorFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreEllipsoidEmitter.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreEllipsoidEmitterFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreHollowEllipsoidEmitter.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreHollowEllipsoidEmitterFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreLinearForceAffector.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreLinearForceAffectorFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreParticleFXPlugin.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgrePointEmitter.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgrePointEmitterFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreRingEmitter.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreRingEmitterFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreRotationAffector.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreRotationAffectorFactory.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreScaleAffector.h"
    "E:/work/ogre_1.12.5/PlugIns/ParticleFX/include/OgreScaleAffectorFactory.h"
    "E:/work/ogre_1.12.5/build/include/OgreParticleFXPrerequisites.h"
    )
endif()

