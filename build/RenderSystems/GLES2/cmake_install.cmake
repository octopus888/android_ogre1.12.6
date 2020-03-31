# Install script for directory: E:/work/ogre_1.12.5/RenderSystems/GLES2

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
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libRenderSystem_GLES2Static.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ee][Aa][Ss][Ee]|[Nn][Oo][Nn][Ee]|)$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libRenderSystem_GLES2Static.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libRenderSystem_GLES2Static.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib/OGRE" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libRenderSystem_GLES2Static.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/OGRE/RenderSystems/GLES2" TYPE FILE FILES
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2DepthBuffer.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2FBOMultiRenderTarget.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2FBORenderTexture.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2FrameBufferObject.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2HardwareBuffer.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2HardwareBufferManager.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2HardwareIndexBuffer.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2HardwareOcclusionQuery.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2HardwarePixelBuffer.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2HardwareUniformBuffer.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2HardwareVertexBuffer.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2ManagedResource.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2ManagedResourceManager.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2PixelFormat.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2Plugin.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2Prerequisites.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2RenderSystem.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2RenderToVertexBuffer.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2StateCacheManager.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2Texture.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/OgreGLES2TextureManager.h"
    "E:/work/ogre_1.12.5/build/include/OgreGLES2Exports.h"
    "E:/work/ogre_1.12.5/build/include/OgreGLES2Config.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLContext.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLDepthBufferCommon.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLHardwarePixelBufferCommon.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLNativeSupport.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLPBuffer.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLRenderSystemCommon.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLRenderTarget.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLRenderTexture.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLStateCacheManagerCommon.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLTextureCommon.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLUniformCache.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLUtil.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLVertexArrayObject.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLSupport/include/OgreGLWindow.h"
    "E:/work/ogre_1.12.5/build/include/OgreGLSupportPrerequisites.h"
    )
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/OGRE/RenderSystems/GLES2/GLES2" TYPE FILE FILES "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/GLES2/gl2ext.h")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/OGRE/RenderSystems/GLES2/GLES3" TYPE FILE FILES
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/GLES3/gl3.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/GLES3/gl3platform.h"
    "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/GLES3/glesw.h"
    )
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/OGRE/RenderSystems/GLES2/KHR" TYPE FILE FILES "E:/work/ogre_1.12.5/RenderSystems/GLES2/include/KHR/khrplatform.h")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/OGRE/RenderSystems/GLES2/GLSLES" TYPE DIRECTORY FILES "E:/work/ogre_1.12.5/RenderSystems/GLES2/src/GLSLES/include/")
endif()

