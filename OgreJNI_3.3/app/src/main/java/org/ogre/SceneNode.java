/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class SceneNode extends Node {
  private transient long swigCPtr;

  protected SceneNode(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.SceneNode_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SceneNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_SceneNode(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SceneNode(SceneManager creator) {
    this(OgreJNI.new_SceneNode__SWIG_0(SceneManager.getCPtr(creator), creator), true);
  }

  public SceneNode(SceneManager creator, String name) {
    this(OgreJNI.new_SceneNode__SWIG_1(SceneManager.getCPtr(creator), creator, name), true);
  }

  public void attachObject(MovableObject obj) {
    OgreJNI.SceneNode_attachObject(swigCPtr, this, MovableObject.getCPtr(obj), obj);
  }

  public int numAttachedObjects() {
    return OgreJNI.SceneNode_numAttachedObjects(swigCPtr, this);
  }

  public MovableObject getAttachedObject(int index) {
    long cPtr = OgreJNI.SceneNode_getAttachedObject__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new MovableObject(cPtr, false);
  }

  public MovableObject getAttachedObject(String name) {
    long cPtr = OgreJNI.SceneNode_getAttachedObject__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MovableObject(cPtr, false);
  }

  public MovableObject detachObject(int index) {
    long cPtr = OgreJNI.SceneNode_detachObject__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new MovableObject(cPtr, false);
  }

  public void detachObject(MovableObject obj) {
    OgreJNI.SceneNode_detachObject__SWIG_1(swigCPtr, this, MovableObject.getCPtr(obj), obj);
  }

  public MovableObject detachObject(String name) {
    long cPtr = OgreJNI.SceneNode_detachObject__SWIG_2(swigCPtr, this, name);
    return (cPtr == 0) ? null : new MovableObject(cPtr, false);
  }

  public void detachAllObjects() {
    OgreJNI.SceneNode_detachAllObjects(swigCPtr, this);
  }

  public boolean isInSceneGraph() {
    return OgreJNI.SceneNode_isInSceneGraph(swigCPtr, this);
  }

  public void _notifyRootNode() {
    OgreJNI.SceneNode__notifyRootNode(swigCPtr, this);
  }

  public void _update(boolean updateChildren, boolean parentHasChanged) {
    OgreJNI.SceneNode__update(swigCPtr, this, updateChildren, parentHasChanged);
  }

  public void _updateBounds() {
    OgreJNI.SceneNode__updateBounds(swigCPtr, this);
  }

  public void _findVisibleObjects(Camera cam, RenderQueue queue, VisibleObjectsBoundsInfo visibleBounds, boolean includeChildren, boolean displayNodes, boolean onlyShadowCasters) {
    OgreJNI.SceneNode__findVisibleObjects__SWIG_0(swigCPtr, this, Camera.getCPtr(cam), cam, RenderQueue.getCPtr(queue), queue, VisibleObjectsBoundsInfo.getCPtr(visibleBounds), visibleBounds, includeChildren, displayNodes, onlyShadowCasters);
  }

  public void _findVisibleObjects(Camera cam, RenderQueue queue, VisibleObjectsBoundsInfo visibleBounds, boolean includeChildren, boolean displayNodes) {
    OgreJNI.SceneNode__findVisibleObjects__SWIG_1(swigCPtr, this, Camera.getCPtr(cam), cam, RenderQueue.getCPtr(queue), queue, VisibleObjectsBoundsInfo.getCPtr(visibleBounds), visibleBounds, includeChildren, displayNodes);
  }

  public void _findVisibleObjects(Camera cam, RenderQueue queue, VisibleObjectsBoundsInfo visibleBounds, boolean includeChildren) {
    OgreJNI.SceneNode__findVisibleObjects__SWIG_2(swigCPtr, this, Camera.getCPtr(cam), cam, RenderQueue.getCPtr(queue), queue, VisibleObjectsBoundsInfo.getCPtr(visibleBounds), visibleBounds, includeChildren);
  }

  public void _findVisibleObjects(Camera cam, RenderQueue queue, VisibleObjectsBoundsInfo visibleBounds) {
    OgreJNI.SceneNode__findVisibleObjects__SWIG_3(swigCPtr, this, Camera.getCPtr(cam), cam, RenderQueue.getCPtr(queue), queue, VisibleObjectsBoundsInfo.getCPtr(visibleBounds), visibleBounds);
  }

  public AxisAlignedBox _getWorldAABB() {
    return new AxisAlignedBox(OgreJNI.SceneNode__getWorldAABB(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__MovableObject_p_t getAttachedObjects() {
    return new SWIGTYPE_p_std__vectorT_Ogre__MovableObject_p_t(OgreJNI.SceneNode_getAttachedObjects(swigCPtr, this), false);
  }

  public SceneManager getCreator() {
    long cPtr = OgreJNI.SceneNode_getCreator(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneManager(cPtr, false);
  }

  public void removeAndDestroyChild(String name) {
    OgreJNI.SceneNode_removeAndDestroyChild__SWIG_0(swigCPtr, this, name);
  }

  public void removeAndDestroyChild(int index) {
    OgreJNI.SceneNode_removeAndDestroyChild__SWIG_1(swigCPtr, this, index);
  }

  public void removeAndDestroyChild(SceneNode child) {
    OgreJNI.SceneNode_removeAndDestroyChild__SWIG_2(swigCPtr, this, SceneNode.getCPtr(child), child);
  }

  public void removeAndDestroyAllChildren() {
    OgreJNI.SceneNode_removeAndDestroyAllChildren(swigCPtr, this);
  }

  public void showBoundingBox(boolean bShow) {
    OgreJNI.SceneNode_showBoundingBox(swigCPtr, this, bShow);
  }

  public void hideBoundingBox(boolean bHide) {
    OgreJNI.SceneNode_hideBoundingBox(swigCPtr, this, bHide);
  }

  public void _addBoundingBoxToQueue(RenderQueue queue) {
    OgreJNI.SceneNode__addBoundingBoxToQueue(swigCPtr, this, RenderQueue.getCPtr(queue), queue);
  }

  public boolean getShowBoundingBox() {
    return OgreJNI.SceneNode_getShowBoundingBox(swigCPtr, this);
  }

  public SceneNode createChildSceneNode(Vector3 translate, Quaternion rotate) {
    long cPtr = OgreJNI.SceneNode_createChildSceneNode__SWIG_0(swigCPtr, this, Vector3.getCPtr(translate), translate, Quaternion.getCPtr(rotate), rotate);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public SceneNode createChildSceneNode(Vector3 translate) {
    long cPtr = OgreJNI.SceneNode_createChildSceneNode__SWIG_1(swigCPtr, this, Vector3.getCPtr(translate), translate);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public SceneNode createChildSceneNode() {
    long cPtr = OgreJNI.SceneNode_createChildSceneNode__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public SceneNode createChildSceneNode(String name, Vector3 translate, Quaternion rotate) {
    long cPtr = OgreJNI.SceneNode_createChildSceneNode__SWIG_3(swigCPtr, this, name, Vector3.getCPtr(translate), translate, Quaternion.getCPtr(rotate), rotate);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public SceneNode createChildSceneNode(String name, Vector3 translate) {
    long cPtr = OgreJNI.SceneNode_createChildSceneNode__SWIG_4(swigCPtr, this, name, Vector3.getCPtr(translate), translate);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public SceneNode createChildSceneNode(String name) {
    long cPtr = OgreJNI.SceneNode_createChildSceneNode__SWIG_5(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public void findLights(SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t destList, float radius, long lightMask) {
    OgreJNI.SceneNode_findLights__SWIG_0(swigCPtr, this, SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t.getCPtr(destList), radius, lightMask);
  }

  public void findLights(SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t destList, float radius) {
    OgreJNI.SceneNode_findLights__SWIG_1(swigCPtr, this, SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t.getCPtr(destList), radius);
  }

  public void setFixedYawAxis(boolean useFixed, Vector3 fixedAxis) {
    OgreJNI.SceneNode_setFixedYawAxis__SWIG_0(swigCPtr, this, useFixed, Vector3.getCPtr(fixedAxis), fixedAxis);
  }

  public void setFixedYawAxis(boolean useFixed) {
    OgreJNI.SceneNode_setFixedYawAxis__SWIG_1(swigCPtr, this, useFixed);
  }

  public void yaw(Radian angle, Node.TransformSpace relativeTo) {
    OgreJNI.SceneNode_yaw__SWIG_0(swigCPtr, this, Radian.getCPtr(angle), angle, relativeTo.swigValue());
  }

  public void yaw(Radian angle) {
    OgreJNI.SceneNode_yaw__SWIG_1(swigCPtr, this, Radian.getCPtr(angle), angle);
  }

  public void setDirection(float x, float y, float z, Node.TransformSpace relativeTo, Vector3 localDirectionVector) {
    OgreJNI.SceneNode_setDirection__SWIG_0(swigCPtr, this, x, y, z, relativeTo.swigValue(), Vector3.getCPtr(localDirectionVector), localDirectionVector);
  }

  public void setDirection(float x, float y, float z, Node.TransformSpace relativeTo) {
    OgreJNI.SceneNode_setDirection__SWIG_1(swigCPtr, this, x, y, z, relativeTo.swigValue());
  }

  public void setDirection(float x, float y, float z) {
    OgreJNI.SceneNode_setDirection__SWIG_2(swigCPtr, this, x, y, z);
  }

  public void setDirection(Vector3 vec, Node.TransformSpace relativeTo, Vector3 localDirectionVector) {
    OgreJNI.SceneNode_setDirection__SWIG_3(swigCPtr, this, Vector3.getCPtr(vec), vec, relativeTo.swigValue(), Vector3.getCPtr(localDirectionVector), localDirectionVector);
  }

  public void setDirection(Vector3 vec, Node.TransformSpace relativeTo) {
    OgreJNI.SceneNode_setDirection__SWIG_4(swigCPtr, this, Vector3.getCPtr(vec), vec, relativeTo.swigValue());
  }

  public void setDirection(Vector3 vec) {
    OgreJNI.SceneNode_setDirection__SWIG_5(swigCPtr, this, Vector3.getCPtr(vec), vec);
  }

  public void lookAt(Vector3 targetPoint, Node.TransformSpace relativeTo, Vector3 localDirectionVector) {
    OgreJNI.SceneNode_lookAt__SWIG_0(swigCPtr, this, Vector3.getCPtr(targetPoint), targetPoint, relativeTo.swigValue(), Vector3.getCPtr(localDirectionVector), localDirectionVector);
  }

  public void lookAt(Vector3 targetPoint, Node.TransformSpace relativeTo) {
    OgreJNI.SceneNode_lookAt__SWIG_1(swigCPtr, this, Vector3.getCPtr(targetPoint), targetPoint, relativeTo.swigValue());
  }

  public void setAutoTracking(boolean enabled, SceneNode target, Vector3 localDirectionVector, Vector3 offset) {
    OgreJNI.SceneNode_setAutoTracking__SWIG_0(swigCPtr, this, enabled, SceneNode.getCPtr(target), target, Vector3.getCPtr(localDirectionVector), localDirectionVector, Vector3.getCPtr(offset), offset);
  }

  public void setAutoTracking(boolean enabled, SceneNode target, Vector3 localDirectionVector) {
    OgreJNI.SceneNode_setAutoTracking__SWIG_1(swigCPtr, this, enabled, SceneNode.getCPtr(target), target, Vector3.getCPtr(localDirectionVector), localDirectionVector);
  }

  public void setAutoTracking(boolean enabled, SceneNode target) {
    OgreJNI.SceneNode_setAutoTracking__SWIG_2(swigCPtr, this, enabled, SceneNode.getCPtr(target), target);
  }

  public void setAutoTracking(boolean enabled) {
    OgreJNI.SceneNode_setAutoTracking__SWIG_3(swigCPtr, this, enabled);
  }

  public SceneNode getAutoTrackTarget() {
    long cPtr = OgreJNI.SceneNode_getAutoTrackTarget(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public Vector3 getAutoTrackOffset() {
    return new Vector3(OgreJNI.SceneNode_getAutoTrackOffset(swigCPtr, this), false);
  }

  public Vector3 getAutoTrackLocalDirection() {
    return new Vector3(OgreJNI.SceneNode_getAutoTrackLocalDirection(swigCPtr, this), false);
  }

  public void _autoTrack() {
    OgreJNI.SceneNode__autoTrack(swigCPtr, this);
  }

  public SceneNode getParentSceneNode() {
    long cPtr = OgreJNI.SceneNode_getParentSceneNode(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneNode(cPtr, false);
  }

  public void setVisible(boolean visible, boolean cascade) {
    OgreJNI.SceneNode_setVisible__SWIG_0(swigCPtr, this, visible, cascade);
  }

  public void setVisible(boolean visible) {
    OgreJNI.SceneNode_setVisible__SWIG_1(swigCPtr, this, visible);
  }

  public void flipVisibility(boolean cascade) {
    OgreJNI.SceneNode_flipVisibility__SWIG_0(swigCPtr, this, cascade);
  }

  public void flipVisibility() {
    OgreJNI.SceneNode_flipVisibility__SWIG_1(swigCPtr, this);
  }

  public void setDebugDisplayEnabled(boolean enabled, boolean cascade) {
    OgreJNI.SceneNode_setDebugDisplayEnabled__SWIG_0(swigCPtr, this, enabled, cascade);
  }

  public void setDebugDisplayEnabled(boolean enabled) {
    OgreJNI.SceneNode_setDebugDisplayEnabled__SWIG_1(swigCPtr, this, enabled);
  }

  public Node.DebugRenderable getDebugRenderable() {
    long cPtr = OgreJNI.SceneNode_getDebugRenderable__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new Node.DebugRenderable(cPtr, false);
  }

  public Node.DebugRenderable getDebugRenderable(float scaling) {
    long cPtr = OgreJNI.SceneNode_getDebugRenderable__SWIG_1_0(swigCPtr, this, scaling);
    return (cPtr == 0) ? null : new Node.DebugRenderable(cPtr, false);
  }

}
