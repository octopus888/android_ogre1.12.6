/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Mesh extends Resource {
  private transient long swigCPtr;

  protected Mesh(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.Mesh_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Mesh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Mesh(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Mesh(ResourceManager creator, String name, java.math.BigInteger handle, String group, boolean isManual, ManualResourceLoader loader) {
    this(OgreJNI.new_Mesh__SWIG_0(ResourceManager.getCPtr(creator), creator, name, handle, group, isManual, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public Mesh(ResourceManager creator, String name, java.math.BigInteger handle, String group, boolean isManual) {
    this(OgreJNI.new_Mesh__SWIG_1(ResourceManager.getCPtr(creator), creator, name, handle, group, isManual), true);
  }

  public Mesh(ResourceManager creator, String name, java.math.BigInteger handle, String group) {
    this(OgreJNI.new_Mesh__SWIG_2(ResourceManager.getCPtr(creator), creator, name, handle, group), true);
  }

  public SubMesh createSubMesh() {
    long cPtr = OgreJNI.Mesh_createSubMesh__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public SubMesh createSubMesh(String name) {
    long cPtr = OgreJNI.Mesh_createSubMesh__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public void nameSubMesh(String name, int index) {
    OgreJNI.Mesh_nameSubMesh(swigCPtr, this, name, index);
  }

  public void unnameSubMesh(String name) {
    OgreJNI.Mesh_unnameSubMesh(swigCPtr, this, name);
  }

  public int _getSubMeshIndex(String name) {
    return OgreJNI.Mesh__getSubMeshIndex(swigCPtr, this, name);
  }

  public long getNumSubMeshes() {
    return OgreJNI.Mesh_getNumSubMeshes(swigCPtr, this);
  }

  public SubMesh getSubMesh(long index) {
    long cPtr = OgreJNI.Mesh_getSubMesh__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public SubMesh getSubMesh(String name) {
    long cPtr = OgreJNI.Mesh_getSubMesh__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SubMesh(cPtr, false);
  }

  public void destroySubMesh(int index) {
    OgreJNI.Mesh_destroySubMesh__SWIG_0(swigCPtr, this, index);
  }

  public void destroySubMesh(String name) {
    OgreJNI.Mesh_destroySubMesh__SWIG_1(swigCPtr, this, name);
  }

  public SubMeshList getSubMeshes() {
    return new SubMeshList(OgreJNI.Mesh_getSubMeshes(swigCPtr, this), false);
  }

  public void setSharedVertexData(VertexData value) {
    OgreJNI.Mesh_sharedVertexData_set(swigCPtr, this, VertexData.getCPtr(value), value);
  }

  public VertexData getSharedVertexData() {
    long cPtr = OgreJNI.Mesh_sharedVertexData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public void setSharedBlendIndexToBoneIndexMap(SWIGTYPE_p_std__vectorT_unsigned_short_t value) {
    OgreJNI.Mesh_sharedBlendIndexToBoneIndexMap_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_unsigned_short_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_unsigned_short_t getSharedBlendIndexToBoneIndexMap() {
    long cPtr = OgreJNI.Mesh_sharedBlendIndexToBoneIndexMap_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_unsigned_short_t(cPtr, false);
  }

  public MeshPtr clone(String newName, String newGroup) {
    return new MeshPtr(OgreJNI.Mesh_clone__SWIG_0(swigCPtr, this, newName, newGroup), true);
  }

  public MeshPtr clone(String newName) {
    return new MeshPtr(OgreJNI.Mesh_clone__SWIG_1(swigCPtr, this, newName), true);
  }

  public void reload(Resource.LoadingFlags flags) {
    OgreJNI.Mesh_reload__SWIG_0(swigCPtr, this, flags.swigValue());
  }

  public void reload() {
    OgreJNI.Mesh_reload__SWIG_1(swigCPtr, this);
  }

  public AxisAlignedBox getBounds() {
    return new AxisAlignedBox(OgreJNI.Mesh_getBounds(swigCPtr, this), false);
  }

  public float getBoundingSphereRadius() {
    return OgreJNI.Mesh_getBoundingSphereRadius(swigCPtr, this);
  }

  public float getBoneBoundingRadius() {
    return OgreJNI.Mesh_getBoneBoundingRadius(swigCPtr, this);
  }

  public void _setBounds(AxisAlignedBox bounds, boolean pad) {
    OgreJNI.Mesh__setBounds__SWIG_0(swigCPtr, this, AxisAlignedBox.getCPtr(bounds), bounds, pad);
  }

  public void _setBounds(AxisAlignedBox bounds) {
    OgreJNI.Mesh__setBounds__SWIG_1(swigCPtr, this, AxisAlignedBox.getCPtr(bounds), bounds);
  }

  public void _setBoundingSphereRadius(float radius) {
    OgreJNI.Mesh__setBoundingSphereRadius(swigCPtr, this, radius);
  }

  public void _setBoneBoundingRadius(float radius) {
    OgreJNI.Mesh__setBoneBoundingRadius(swigCPtr, this, radius);
  }

  public void _computeBoneBoundingRadius() {
    OgreJNI.Mesh__computeBoneBoundingRadius(swigCPtr, this);
  }

  public void _updateBoundsFromVertexBuffers(boolean pad) {
    OgreJNI.Mesh__updateBoundsFromVertexBuffers__SWIG_0(swigCPtr, this, pad);
  }

  public void _updateBoundsFromVertexBuffers() {
    OgreJNI.Mesh__updateBoundsFromVertexBuffers__SWIG_1(swigCPtr, this);
  }

  public void _calcBoundsFromVertexBuffer(VertexData vertexData, AxisAlignedBox outAABB, SWIGTYPE_p_float outRadius, boolean updateOnly) {
    OgreJNI.Mesh__calcBoundsFromVertexBuffer__SWIG_0(swigCPtr, this, VertexData.getCPtr(vertexData), vertexData, AxisAlignedBox.getCPtr(outAABB), outAABB, SWIGTYPE_p_float.getCPtr(outRadius), updateOnly);
  }

  public void _calcBoundsFromVertexBuffer(VertexData vertexData, AxisAlignedBox outAABB, SWIGTYPE_p_float outRadius) {
    OgreJNI.Mesh__calcBoundsFromVertexBuffer__SWIG_1(swigCPtr, this, VertexData.getCPtr(vertexData), vertexData, AxisAlignedBox.getCPtr(outAABB), outAABB, SWIGTYPE_p_float.getCPtr(outRadius));
  }

  public void setSkeletonName(String skelName) {
    OgreJNI.Mesh_setSkeletonName(swigCPtr, this, skelName);
  }

  public boolean hasSkeleton() {
    return OgreJNI.Mesh_hasSkeleton(swigCPtr, this);
  }

  public boolean hasVertexAnimation() {
    return OgreJNI.Mesh_hasVertexAnimation(swigCPtr, this);
  }

  public SkeletonPtr getSkeleton() {
    return new SkeletonPtr(OgreJNI.Mesh_getSkeleton(swigCPtr, this), false);
  }

  public String getSkeletonName() {
    return OgreJNI.Mesh_getSkeletonName(swigCPtr, this);
  }

  public void _initAnimationState(AnimationStateSet animSet) {
    OgreJNI.Mesh__initAnimationState(swigCPtr, this, AnimationStateSet.getCPtr(animSet), animSet);
  }

  public void _refreshAnimationState(AnimationStateSet animSet) {
    OgreJNI.Mesh__refreshAnimationState(swigCPtr, this, AnimationStateSet.getCPtr(animSet), animSet);
  }

  public void addBoneAssignment(VertexBoneAssignment vertBoneAssign) {
    OgreJNI.Mesh_addBoneAssignment(swigCPtr, this, VertexBoneAssignment.getCPtr(vertBoneAssign), vertBoneAssign);
  }

  public void clearBoneAssignments() {
    OgreJNI.Mesh_clearBoneAssignments(swigCPtr, this);
  }

  public void _notifySkeleton(SkeletonPtr pSkel) {
    OgreJNI.Mesh__notifySkeleton(swigCPtr, this, SkeletonPtr.getCPtr(pSkel), pSkel);
  }

  public SWIGTYPE_p_Ogre__MapIteratorT_std__multimapT_size_t_Ogre__VertexBoneAssignment_s_t_t getBoneAssignmentIterator() {
    return new SWIGTYPE_p_Ogre__MapIteratorT_std__multimapT_size_t_Ogre__VertexBoneAssignment_s_t_t(OgreJNI.Mesh_getBoneAssignmentIterator(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__multimapT_size_t_Ogre__VertexBoneAssignment_s_t getBoneAssignments() {
    return new SWIGTYPE_p_std__multimapT_size_t_Ogre__VertexBoneAssignment_s_t(OgreJNI.Mesh_getBoneAssignments(swigCPtr, this), false);
  }

  public int getNumLodLevels() {
    return OgreJNI.Mesh_getNumLodLevels(swigCPtr, this);
  }

  public MeshLodUsage getLodLevel(int index) {
    return new MeshLodUsage(OgreJNI.Mesh_getLodLevel(swigCPtr, this, index), false);
  }

  public int getLodIndex(float value) {
    return OgreJNI.Mesh_getLodIndex(swigCPtr, this, value);
  }

  public boolean hasManualLodLevel() {
    return OgreJNI.Mesh_hasManualLodLevel(swigCPtr, this);
  }

  public void updateManualLodLevel(int index, String meshName) {
    OgreJNI.Mesh_updateManualLodLevel(swigCPtr, this, index, meshName);
  }

  public void _setLodInfo(int numLevels) {
    OgreJNI.Mesh__setLodInfo(swigCPtr, this, numLevels);
  }

  public void _setLodUsage(int level, MeshLodUsage usage) {
    OgreJNI.Mesh__setLodUsage(swigCPtr, this, level, MeshLodUsage.getCPtr(usage), usage);
  }

  public void _setSubMeshLodFaceList(int subIdx, int level, IndexData facedata) {
    OgreJNI.Mesh__setSubMeshLodFaceList(swigCPtr, this, subIdx, level, IndexData.getCPtr(facedata), facedata);
  }

  public boolean _isManualLodLevel(int level) {
    return OgreJNI.Mesh__isManualLodLevel(swigCPtr, this, level);
  }

  public void removeLodLevels() {
    OgreJNI.Mesh_removeLodLevels(swigCPtr, this);
  }

  public void setHardwareBufferManager(HardwareBufferManagerBase bufferManager) {
    OgreJNI.Mesh_setHardwareBufferManager(swigCPtr, this, HardwareBufferManagerBase.getCPtr(bufferManager), bufferManager);
  }

  public HardwareBufferManagerBase getHardwareBufferManager() {
    long cPtr = OgreJNI.Mesh_getHardwareBufferManager(swigCPtr, this);
    return (cPtr == 0) ? null : new HardwareBufferManagerBase(cPtr, false);
  }

  public void setVertexBufferPolicy(HardwareBuffer.Usage usage, boolean shadowBuffer) {
    OgreJNI.Mesh_setVertexBufferPolicy__SWIG_0(swigCPtr, this, usage.swigValue(), shadowBuffer);
  }

  public void setVertexBufferPolicy(HardwareBuffer.Usage usage) {
    OgreJNI.Mesh_setVertexBufferPolicy__SWIG_1(swigCPtr, this, usage.swigValue());
  }

  public void setIndexBufferPolicy(HardwareBuffer.Usage usage, boolean shadowBuffer) {
    OgreJNI.Mesh_setIndexBufferPolicy__SWIG_0(swigCPtr, this, usage.swigValue(), shadowBuffer);
  }

  public void setIndexBufferPolicy(HardwareBuffer.Usage usage) {
    OgreJNI.Mesh_setIndexBufferPolicy__SWIG_1(swigCPtr, this, usage.swigValue());
  }

  public HardwareBuffer.Usage getVertexBufferUsage() {
    return HardwareBuffer.Usage.swigToEnum(OgreJNI.Mesh_getVertexBufferUsage(swigCPtr, this));
  }

  public HardwareBuffer.Usage getIndexBufferUsage() {
    return HardwareBuffer.Usage.swigToEnum(OgreJNI.Mesh_getIndexBufferUsage(swigCPtr, this));
  }

  public boolean isVertexBufferShadowed() {
    return OgreJNI.Mesh_isVertexBufferShadowed(swigCPtr, this);
  }

  public boolean isIndexBufferShadowed() {
    return OgreJNI.Mesh_isIndexBufferShadowed(swigCPtr, this);
  }

  public int _rationaliseBoneAssignments(long vertexCount, SWIGTYPE_p_std__multimapT_size_t_Ogre__VertexBoneAssignment_s_t assignments) {
    return OgreJNI.Mesh__rationaliseBoneAssignments(swigCPtr, this, vertexCount, SWIGTYPE_p_std__multimapT_size_t_Ogre__VertexBoneAssignment_s_t.getCPtr(assignments));
  }

  public void _compileBoneAssignments() {
    OgreJNI.Mesh__compileBoneAssignments(swigCPtr, this);
  }

  public void _updateCompiledBoneAssignments() {
    OgreJNI.Mesh__updateCompiledBoneAssignments(swigCPtr, this);
  }

  public void mergeAdjacentTexcoords(int finalTexCoordSet, int texCoordSetToDestroy) {
    OgreJNI.Mesh_mergeAdjacentTexcoords(swigCPtr, this, finalTexCoordSet, texCoordSetToDestroy);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet, int index, boolean splitMirrored, boolean splitRotated, boolean storeParityInW) {
    OgreJNI.Mesh_buildTangentVectors__SWIG_0(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet, index, splitMirrored, splitRotated, storeParityInW);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet, int index, boolean splitMirrored, boolean splitRotated) {
    OgreJNI.Mesh_buildTangentVectors__SWIG_1(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet, index, splitMirrored, splitRotated);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet, int index, boolean splitMirrored) {
    OgreJNI.Mesh_buildTangentVectors__SWIG_2(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet, index, splitMirrored);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet, int index) {
    OgreJNI.Mesh_buildTangentVectors__SWIG_3(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet, index);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic, int sourceTexCoordSet) {
    OgreJNI.Mesh_buildTangentVectors__SWIG_4(swigCPtr, this, targetSemantic.swigValue(), sourceTexCoordSet);
  }

  public void buildTangentVectors(VertexElementSemantic targetSemantic) {
    OgreJNI.Mesh_buildTangentVectors__SWIG_5(swigCPtr, this, targetSemantic.swigValue());
  }

  public void buildTangentVectors() {
    OgreJNI.Mesh_buildTangentVectors__SWIG_6(swigCPtr, this);
  }

  public boolean suggestTangentVectorBuildParams(VertexElementSemantic targetSemantic, SWIGTYPE_p_unsigned_short outSourceCoordSet, SWIGTYPE_p_unsigned_short outIndex) {
    return OgreJNI.Mesh_suggestTangentVectorBuildParams(swigCPtr, this, targetSemantic.swigValue(), SWIGTYPE_p_unsigned_short.getCPtr(outSourceCoordSet), SWIGTYPE_p_unsigned_short.getCPtr(outIndex));
  }

  public void buildEdgeList() {
    OgreJNI.Mesh_buildEdgeList(swigCPtr, this);
  }

  public void freeEdgeList() {
    OgreJNI.Mesh_freeEdgeList(swigCPtr, this);
  }

  public void prepareForShadowVolume() {
    OgreJNI.Mesh_prepareForShadowVolume(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__EdgeData getEdgeList() {
    long cPtr = OgreJNI.Mesh_getEdgeList__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__EdgeData(cPtr, false);
  }

  public boolean isPreparedForShadowVolumes() {
    return OgreJNI.Mesh_isPreparedForShadowVolumes(swigCPtr, this);
  }

  public boolean isEdgeListBuilt() {
    return OgreJNI.Mesh_isEdgeListBuilt(swigCPtr, this);
  }

  public static void prepareMatricesForVertexBlend(SWIGTYPE_p_p_Ogre__Affine3 blendMatrices, Affine3 boneMatrices, SWIGTYPE_p_std__vectorT_unsigned_short_t indexMap) {
    OgreJNI.Mesh_prepareMatricesForVertexBlend(SWIGTYPE_p_p_Ogre__Affine3.getCPtr(blendMatrices), Affine3.getCPtr(boneMatrices), boneMatrices, SWIGTYPE_p_std__vectorT_unsigned_short_t.getCPtr(indexMap));
  }

  public static void softwareVertexBlend(VertexData sourceVertexData, VertexData targetVertexData, SWIGTYPE_p_p_Ogre__Affine3 blendMatrices, long numMatrices, boolean blendNormals) {
    OgreJNI.Mesh_softwareVertexBlend(VertexData.getCPtr(sourceVertexData), sourceVertexData, VertexData.getCPtr(targetVertexData), targetVertexData, SWIGTYPE_p_p_Ogre__Affine3.getCPtr(blendMatrices), numMatrices, blendNormals);
  }

  public static void softwareVertexMorph(float t, HardwareVertexBufferPtr b1, HardwareVertexBufferPtr b2, VertexData targetVertexData) {
    OgreJNI.Mesh_softwareVertexMorph(t, HardwareVertexBufferPtr.getCPtr(b1), b1, HardwareVertexBufferPtr.getCPtr(b2), b2, VertexData.getCPtr(targetVertexData), targetVertexData);
  }

  public static void softwareVertexPoseBlend(float weight, SWIGTYPE_p_std__mapT_size_t_Ogre__VectorT_3_Ogre__Real_t_t vertexOffsetMap, SWIGTYPE_p_std__mapT_size_t_Ogre__VectorT_3_Ogre__Real_t_t normalsMap, VertexData targetVertexData) {
    OgreJNI.Mesh_softwareVertexPoseBlend(weight, SWIGTYPE_p_std__mapT_size_t_Ogre__VectorT_3_Ogre__Real_t_t.getCPtr(vertexOffsetMap), SWIGTYPE_p_std__mapT_size_t_Ogre__VectorT_3_Ogre__Real_t_t.getCPtr(normalsMap), VertexData.getCPtr(targetVertexData), targetVertexData);
  }

  public SWIGTYPE_p_std__unordered_mapT_std__string_unsigned_short_t getSubMeshNameMap() {
    return new SWIGTYPE_p_std__unordered_mapT_std__string_unsigned_short_t(OgreJNI.Mesh_getSubMeshNameMap(swigCPtr, this), false);
  }

  public void setAutoBuildEdgeLists(boolean autobuild) {
    OgreJNI.Mesh_setAutoBuildEdgeLists(swigCPtr, this, autobuild);
  }

  public boolean getAutoBuildEdgeLists() {
    return OgreJNI.Mesh_getAutoBuildEdgeLists(swigCPtr, this);
  }

  public VertexAnimationType getSharedVertexDataAnimationType() {
    return VertexAnimationType.swigToEnum(OgreJNI.Mesh_getSharedVertexDataAnimationType(swigCPtr, this));
  }

  public boolean getSharedVertexDataAnimationIncludesNormals() {
    return OgreJNI.Mesh_getSharedVertexDataAnimationIncludesNormals(swigCPtr, this);
  }

  public Animation createAnimation(String name, float length) {
    long cPtr = OgreJNI.Mesh_createAnimation(swigCPtr, this, name, length);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation getAnimation(String name) {
    long cPtr = OgreJNI.Mesh_getAnimation__SWIG_0(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public Animation _getAnimationImpl(String name) {
    long cPtr = OgreJNI.Mesh__getAnimationImpl(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public boolean hasAnimation(String name) {
    return OgreJNI.Mesh_hasAnimation(swigCPtr, this, name);
  }

  public void removeAnimation(String name) {
    OgreJNI.Mesh_removeAnimation(swigCPtr, this, name);
  }

  public int getNumAnimations() {
    return OgreJNI.Mesh_getNumAnimations(swigCPtr, this);
  }

  public Animation getAnimation(int index) {
    long cPtr = OgreJNI.Mesh_getAnimation__SWIG_1(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public void removeAllAnimations() {
    OgreJNI.Mesh_removeAllAnimations(swigCPtr, this);
  }

  public VertexData getVertexDataByTrackHandle(int handle) {
    long cPtr = OgreJNI.Mesh_getVertexDataByTrackHandle(swigCPtr, this, handle);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public void updateMaterialForAllSubMeshes() {
    OgreJNI.Mesh_updateMaterialForAllSubMeshes(swigCPtr, this);
  }

  public void _determineAnimationTypes() {
    OgreJNI.Mesh__determineAnimationTypes(swigCPtr, this);
  }

  public boolean _getAnimationTypesDirty() {
    return OgreJNI.Mesh__getAnimationTypesDirty(swigCPtr, this);
  }

  public Pose createPose(int target, String name) {
    long cPtr = OgreJNI.Mesh_createPose__SWIG_0(swigCPtr, this, target, name);
    return (cPtr == 0) ? null : new Pose(cPtr, false);
  }

  public Pose createPose(int target) {
    long cPtr = OgreJNI.Mesh_createPose__SWIG_1(swigCPtr, this, target);
    return (cPtr == 0) ? null : new Pose(cPtr, false);
  }

  public void removePose(int index) {
    OgreJNI.Mesh_removePose__SWIG_0(swigCPtr, this, index);
  }

  public void removePose(String name) {
    OgreJNI.Mesh_removePose__SWIG_1(swigCPtr, this, name);
  }

  public void removeAllPoses() {
    OgreJNI.Mesh_removeAllPoses(swigCPtr, this);
  }

  public PoseList getPoseList() {
    return new PoseList(OgreJNI.Mesh_getPoseList(swigCPtr, this), false);
  }

  public SWIGTYPE_p_Ogre__LodStrategy getLodStrategy() {
    long cPtr = OgreJNI.Mesh_getLodStrategy(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__LodStrategy(cPtr, false);
  }

  public void setLodStrategy(SWIGTYPE_p_Ogre__LodStrategy lodStrategy) {
    OgreJNI.Mesh_setLodStrategy(swigCPtr, this, SWIGTYPE_p_Ogre__LodStrategy.getCPtr(lodStrategy));
  }

}
