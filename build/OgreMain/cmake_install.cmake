# Install script for directory: E:/work/ogre_1.12.5/OgreMain

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
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libOgreMainStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ee][Aa][Ss][Ee]|[Nn][Oo][Nn][Ee]|)$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libOgreMainStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Rr][Ee][Ll][Ww][Ii][Tt][Hh][Dd][Ee][Bb][Ii][Nn][Ff][Oo])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libOgreMainStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Mm][Ii][Nn][Ss][Ii][Zz][Ee][Rr][Ee][Ll])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  if("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
    file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/lib" TYPE STATIC_LIBRARY FILES "E:/work/ogre_1.12.5/build/lib/libOgreMainStatic.a")
  endif("${CMAKE_INSTALL_CONFIG_NAME}" MATCHES "^([Dd][Ee][Bb][Uu][Gg])$")
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/OGRE" TYPE FILE FILES
    "E:/work/ogre_1.12.5/OgreMain/include/Ogre.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreASTCCodec.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreAlignedAllocator.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreAnimable.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreAnimation.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreAnimationState.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreAnimationTrack.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreAny.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreArchive.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreArchiveFactory.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreArchiveManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreAtomicScalar.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreAutoParamDataSource.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreAxisAlignedBox.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreBillboard.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreBillboardChain.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreBillboardParticleRenderer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreBillboardSet.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreBitwise.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreBlendMode.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreBone.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCamera.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCodec.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreColourValue.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCommon.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCompositionPass.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCompositionTargetPass.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCompositionTechnique.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCompositor.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCompositorChain.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCompositorInstance.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCompositorLogic.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCompositorManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreConfig.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreConfigDialog.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreConfigFile.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreConfigOptionMap.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreController.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreControllerManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreConvexBody.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreCustomCompositionPass.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreDataStream.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreDefaultHardwareBufferManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreDeflate.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreDepthBuffer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreDistanceLodStrategy.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreDualQuaternion.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreDynLib.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreDynLibManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreEdgeListBuilder.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreEntity.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreException.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreExternalTextureSource.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreExternalTextureSourceManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreFactoryObj.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreFileSystem.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreFileSystemLayer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreFrameListener.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreFrustum.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreGpuProgram.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreGpuProgramManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreGpuProgramParams.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreGpuProgramUsage.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHardwareBuffer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHardwareBufferManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHardwareCounterBuffer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHardwareIndexBuffer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHardwareOcclusionQuery.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHardwarePixelBuffer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHardwareUniformBuffer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHardwareVertexBuffer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHeaderPrefix.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHeaderSuffix.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHighLevelGpuProgram.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreHighLevelGpuProgramManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreImage.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreImageCodec.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreInstanceBatch.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreInstanceBatchHW.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreInstanceBatchHW_VTF.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreInstanceBatchShader.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreInstanceBatchVTF.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreInstanceManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreInstancedEntity.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreIteratorWrapper.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreIteratorWrappers.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreKeyFrame.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreLight.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreLodListener.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreLodStrategy.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreLodStrategyManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreLog.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreLogManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreManualObject.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMaterial.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMaterialManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMaterialSerializer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMath.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMatrix3.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMatrix4.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMemoryAllocatorConfig.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMesh.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMeshFileFormat.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMeshManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMeshSerializer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMovableObject.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMovablePlane.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreMurmurHash3.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreNameGenerator.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreNode.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreNumerics.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreOptimisedUtil.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreParticle.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreParticleAffector.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreParticleAffectorFactory.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreParticleEmitter.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreParticleEmitterFactory.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreParticleIterator.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreParticleSystem.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreParticleSystemManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreParticleSystemRenderer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePass.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePatchMesh.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePatchSurface.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePixelCountLodStrategy.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePixelFormat.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePlane.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePlaneBoundedVolume.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePlatform.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePlatformInformation.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePlugin.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePolygon.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePose.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePredefinedControllers.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePrerequisites.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreProfiler.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreQuaternion.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRadixSort.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRay.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRectangle2D.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderObjectListener.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderOperation.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderQueue.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderQueueInvocation.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderQueueListener.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderQueueSortingGrouping.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderSystem.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderSystemCapabilities.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderSystemCapabilitiesManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderSystemCapabilitiesSerializer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderTarget.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderTargetListener.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderTexture.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderToVertexBuffer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderWindow.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRenderable.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreResource.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreResourceBackgroundQueue.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreResourceGroupManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreResourceManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRibbonTrail.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRoot.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreRotationalSpline.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSceneLoader.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSceneLoaderManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSceneManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSceneManagerEnumerator.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSceneNode.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSceneQuery.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreScriptCompiler.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreScriptLoader.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreScriptTranslator.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSearchOps.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSerializer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreShadowCameraSetup.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreShadowCameraSetupFocused.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreShadowCameraSetupLiSPSM.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreShadowCameraSetupPSSM.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreShadowCameraSetupPlaneOptimal.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreShadowCaster.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSharedPtr.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSimpleRenderable.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSimpleSpline.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSingleton.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSkeleton.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSkeletonFileFormat.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSkeletonInstance.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSkeletonManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSkeletonSerializer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSphere.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreStaticFaceGroup.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreStaticGeometry.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreStdHeaders.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreStreamSerialiser.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreString.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreStringConverter.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreStringInterface.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreStringVector.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSubEntity.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreSubMesh.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreTagPoint.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreTangentSpaceCalc.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreTechnique.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreTexture.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreTextureManager.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreTextureUnitState.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreTimer.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreUnifiedHighLevelGpuProgram.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreUserObjectBindings.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreVector.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreVector2.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreVector3.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreVector4.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreVertexBoneAssignment.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreVertexIndexData.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreViewport.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreWireBoundingBox.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreWorkQueue.h"
    "E:/work/ogre_1.12.5/build/include/OgreBuildSettings.h"
    "E:/work/ogre_1.12.5/build/include/OgreComponents.h"
    "E:/work/ogre_1.12.5/build/include/OgreExports.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Ogre.i"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreDefaultWorkQueue.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreDefaultWorkQueueStandard.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreDefaultWorkQueueTBB.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefines.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesBoost.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesNone.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesPoco.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesSTD.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesTBB.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeaders.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersBoost.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersPoco.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersSTD.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersTBB.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesSTD.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersSTD.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreDefaultWorkQueueStandard.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreDDSCodec.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgrePVRTCCodec.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreETCCodec.h"
    "E:/work/ogre_1.12.5/OgreMain/include/OgreZip.h"
    )
endif()

if("x${CMAKE_INSTALL_COMPONENT}x" STREQUAL "xUnspecifiedx" OR NOT CMAKE_INSTALL_COMPONENT)
  file(INSTALL DESTINATION "${CMAKE_INSTALL_PREFIX}/include/OGRE/Threading" TYPE FILE FILES
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreDefaultWorkQueue.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreDefaultWorkQueueStandard.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreDefaultWorkQueueTBB.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefines.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesBoost.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesNone.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesPoco.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesSTD.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesTBB.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeaders.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersBoost.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersPoco.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersSTD.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersTBB.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadDefinesSTD.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreThreadHeadersSTD.h"
    "E:/work/ogre_1.12.5/OgreMain/include/Threading/OgreDefaultWorkQueueStandard.h"
    )
endif()

