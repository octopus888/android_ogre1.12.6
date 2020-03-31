# Install script for directory: E:/work/ogre_1.12.5/Components/RTShaderSystem

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
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libOgreRTShaderSystemStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ee][Aa][Ss][Ee]|[Nn][Oo][Nn][Ee]|)$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libOgreRTShaderSystemStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libOgreRTShaderSystemStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libOgreRTShaderSystemStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/OGRE/RTShaderSystem" TYPE FILE FILES
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreRTShaderSystem.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderCGProgramProcessor.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderCGProgramWriter.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExDualQuaternionSkinning.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExGBuffer.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExHardwareSkinning.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExHardwareSkinningTechnique.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExIntegratedPSSM3.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExLayeredBlending.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExLinearSkinning.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExNormalMapLighting.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExPerPixelLighting.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExTextureAtlasSampler.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderExTriplanarTexturing.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFFPAlphaTest.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFFPColour.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFFPFog.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFFPLighting.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFFPRenderState.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFFPRenderStateBuilder.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFFPTexturing.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFFPTransform.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFunction.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderFunctionAtom.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderGLSLESProgramProcessor.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderGLSLESProgramWriter.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderGLSLProgramProcessor.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderGLSLProgramWriter.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderGenerator.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderHLSLProgramProcessor.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderHLSLProgramWriter.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderParameter.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderPrerequisites.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderProgram.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderProgramManager.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderProgramProcessor.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderProgramSet.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderProgramWriter.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderProgramWriterManager.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderRenderState.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderScriptTranslator.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreShaderSubRenderState.h"
    "E:/work/ogre_1.12.5/build/include/OgreRTShaderExports.h"
    "E:/work/ogre_1.12.5/build/include/OgreRTShaderConfig.h"
    "E:/work/ogre_1.12.5/Components/RTShaderSystem/include/OgreRTShader.i"
    )
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/share/OGRE/Media/" TYPE DIRECTORY FILES "E:/work/ogre_1.12.5/Media/RTShaderLib")
endif()

