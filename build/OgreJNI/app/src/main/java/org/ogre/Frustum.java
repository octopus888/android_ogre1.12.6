/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Frustum extends MovableObject {
  private transient long swigCPtr;

  protected Frustum(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.Frustum_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Frustum obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Frustum(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Frustum(String name) {
    this(OgreJNI.new_Frustum__SWIG_0(name), true);
  }

  public Frustum() {
    this(OgreJNI.new_Frustum__SWIG_1(), true);
  }

  public void setFOVy(Radian fovy) {
    OgreJNI.Frustum_setFOVy(swigCPtr, this, Radian.getCPtr(fovy), fovy);
  }

  public Radian getFOVy() {
    return new Radian(OgreJNI.Frustum_getFOVy(swigCPtr, this), false);
  }

  public void setNearClipDistance(float nearDist) {
    OgreJNI.Frustum_setNearClipDistance(swigCPtr, this, nearDist);
  }

  public float getNearClipDistance() {
    return OgreJNI.Frustum_getNearClipDistance(swigCPtr, this);
  }

  public void setFarClipDistance(float farDist) {
    OgreJNI.Frustum_setFarClipDistance(swigCPtr, this, farDist);
  }

  public float getFarClipDistance() {
    return OgreJNI.Frustum_getFarClipDistance(swigCPtr, this);
  }

  public void setAspectRatio(float ratio) {
    OgreJNI.Frustum_setAspectRatio(swigCPtr, this, ratio);
  }

  public float getAspectRatio() {
    return OgreJNI.Frustum_getAspectRatio(swigCPtr, this);
  }

  public void setFrustumOffset(Vector2 offset) {
    OgreJNI.Frustum_setFrustumOffset__SWIG_0(swigCPtr, this, Vector2.getCPtr(offset), offset);
  }

  public void setFrustumOffset(float horizontal, float vertical) {
    OgreJNI.Frustum_setFrustumOffset__SWIG_1(swigCPtr, this, horizontal, vertical);
  }

  public void setFrustumOffset(float horizontal) {
    OgreJNI.Frustum_setFrustumOffset__SWIG_2(swigCPtr, this, horizontal);
  }

  public void setFrustumOffset() {
    OgreJNI.Frustum_setFrustumOffset__SWIG_3(swigCPtr, this);
  }

  public Vector2 getFrustumOffset() {
    return new Vector2(OgreJNI.Frustum_getFrustumOffset(swigCPtr, this), false);
  }

  public void setFocalLength(float focalLength) {
    OgreJNI.Frustum_setFocalLength__SWIG_0(swigCPtr, this, focalLength);
  }

  public void setFocalLength() {
    OgreJNI.Frustum_setFocalLength__SWIG_1(swigCPtr, this);
  }

  public float getFocalLength() {
    return OgreJNI.Frustum_getFocalLength(swigCPtr, this);
  }

  public void setFrustumExtents(float left, float right, float top, float bottom) {
    OgreJNI.Frustum_setFrustumExtents(swigCPtr, this, left, right, top, bottom);
  }

  public void resetFrustumExtents() {
    OgreJNI.Frustum_resetFrustumExtents(swigCPtr, this);
  }

  public FloatRect getFrustumExtents() {
    return new FloatRect(OgreJNI.Frustum_getFrustumExtents(swigCPtr, this), true);
  }

  public Matrix4 getProjectionMatrixRS() {
    return new Matrix4(OgreJNI.Frustum_getProjectionMatrixRS(swigCPtr, this), false);
  }

  public Matrix4 getProjectionMatrixWithRSDepth() {
    return new Matrix4(OgreJNI.Frustum_getProjectionMatrixWithRSDepth(swigCPtr, this), false);
  }

  public Matrix4 getProjectionMatrix() {
    return new Matrix4(OgreJNI.Frustum_getProjectionMatrix(swigCPtr, this), false);
  }

  public Affine3 getViewMatrix() {
    return new Affine3(OgreJNI.Frustum_getViewMatrix(swigCPtr, this), false);
  }

  public void calcViewMatrixRelative(Vector3 relPos, Matrix4 matToUpdate) {
    OgreJNI.Frustum_calcViewMatrixRelative(swigCPtr, this, Vector3.getCPtr(relPos), relPos, Matrix4.getCPtr(matToUpdate), matToUpdate);
  }

  public void setCustomViewMatrix(boolean enable, Affine3 viewMatrix) {
    OgreJNI.Frustum_setCustomViewMatrix__SWIG_0(swigCPtr, this, enable, Affine3.getCPtr(viewMatrix), viewMatrix);
  }

  public void setCustomViewMatrix(boolean enable) {
    OgreJNI.Frustum_setCustomViewMatrix__SWIG_1(swigCPtr, this, enable);
  }

  public boolean isCustomViewMatrixEnabled() {
    return OgreJNI.Frustum_isCustomViewMatrixEnabled(swigCPtr, this);
  }

  public void setCustomProjectionMatrix(boolean enable, Matrix4 projectionMatrix) {
    OgreJNI.Frustum_setCustomProjectionMatrix__SWIG_0(swigCPtr, this, enable, Matrix4.getCPtr(projectionMatrix), projectionMatrix);
  }

  public void setCustomProjectionMatrix(boolean enable) {
    OgreJNI.Frustum_setCustomProjectionMatrix__SWIG_1(swigCPtr, this, enable);
  }

  public boolean isCustomProjectionMatrixEnabled() {
    return OgreJNI.Frustum_isCustomProjectionMatrixEnabled(swigCPtr, this);
  }

  public Plane getFrustumPlanes() {
    long cPtr = OgreJNI.Frustum_getFrustumPlanes(swigCPtr, this);
    return (cPtr == 0) ? null : new Plane(cPtr, false);
  }

  public Plane getFrustumPlane(int plane) {
    return new Plane(OgreJNI.Frustum_getFrustumPlane(swigCPtr, this, plane), false);
  }

  public boolean isVisible() {
    return OgreJNI.Frustum_isVisible__SWIG_0_0(swigCPtr, this);
  }

  public boolean isVisible(AxisAlignedBox bound, SWIGTYPE_p_Ogre__FrustumPlane culledBy) {
    return OgreJNI.Frustum_isVisible__SWIG_1(swigCPtr, this, AxisAlignedBox.getCPtr(bound), bound, SWIGTYPE_p_Ogre__FrustumPlane.getCPtr(culledBy));
  }

  public boolean isVisible(AxisAlignedBox bound) {
    return OgreJNI.Frustum_isVisible__SWIG_2(swigCPtr, this, AxisAlignedBox.getCPtr(bound), bound);
  }

  public boolean isVisible(Sphere bound, SWIGTYPE_p_Ogre__FrustumPlane culledBy) {
    return OgreJNI.Frustum_isVisible__SWIG_3(swigCPtr, this, Sphere.getCPtr(bound), bound, SWIGTYPE_p_Ogre__FrustumPlane.getCPtr(culledBy));
  }

  public boolean isVisible(Sphere bound) {
    return OgreJNI.Frustum_isVisible__SWIG_4(swigCPtr, this, Sphere.getCPtr(bound), bound);
  }

  public boolean isVisible(Vector3 vert, SWIGTYPE_p_Ogre__FrustumPlane culledBy) {
    return OgreJNI.Frustum_isVisible__SWIG_5(swigCPtr, this, Vector3.getCPtr(vert), vert, SWIGTYPE_p_Ogre__FrustumPlane.getCPtr(culledBy));
  }

  public boolean isVisible(Vector3 vert) {
    return OgreJNI.Frustum_isVisible__SWIG_6(swigCPtr, this, Vector3.getCPtr(vert), vert);
  }

  public long getTypeFlags() {
    return OgreJNI.Frustum_getTypeFlags(swigCPtr, this);
  }

  public AxisAlignedBox getBoundingBox() {
    return new AxisAlignedBox(OgreJNI.Frustum_getBoundingBox(swigCPtr, this), false);
  }

  public float getBoundingRadius() {
    return OgreJNI.Frustum_getBoundingRadius(swigCPtr, this);
  }

  public void _updateRenderQueue(RenderQueue queue) {
    OgreJNI.Frustum__updateRenderQueue(swigCPtr, this, RenderQueue.getCPtr(queue), queue);
  }

  public String getMovableType() {
    return OgreJNI.Frustum_getMovableType(swigCPtr, this);
  }

  public void _notifyCurrentCamera(Camera cam) {
    OgreJNI.Frustum__notifyCurrentCamera(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public void setMaterial(MaterialPtr mat) {
    OgreJNI.Frustum_setMaterial(swigCPtr, this, MaterialPtr.getCPtr(mat), mat);
  }

  public MaterialPtr getMaterial() {
    return new MaterialPtr(OgreJNI.Frustum_getMaterial(swigCPtr, this), false);
  }

  public void getRenderOperation(RenderOperation op) {
    OgreJNI.Frustum_getRenderOperation(swigCPtr, this, RenderOperation.getCPtr(op), op);
  }

  public void getWorldTransforms(Matrix4 xform) {
    OgreJNI.Frustum_getWorldTransforms(swigCPtr, this, Matrix4.getCPtr(xform), xform);
  }

  public float getSquaredViewDepth(Camera cam) {
    return OgreJNI.Frustum_getSquaredViewDepth(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t getLights() {
    return new SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t(OgreJNI.Frustum_getLights(swigCPtr, this), false);
  }

  public SWIGTYPE_p_a_8__Ogre__VectorT_3_float_t getWorldSpaceCorners() {
    return new SWIGTYPE_p_a_8__Ogre__VectorT_3_float_t(OgreJNI.Frustum_getWorldSpaceCorners(swigCPtr, this), false);
  }

  public void setProjectionType(ProjectionType pt) {
    OgreJNI.Frustum_setProjectionType(swigCPtr, this, pt.swigValue());
  }

  public ProjectionType getProjectionType() {
    return ProjectionType.swigToEnum(OgreJNI.Frustum_getProjectionType(swigCPtr, this));
  }

  public void setOrthoWindow(float w, float h) {
    OgreJNI.Frustum_setOrthoWindow(swigCPtr, this, w, h);
  }

  public void setOrthoWindowHeight(float h) {
    OgreJNI.Frustum_setOrthoWindowHeight(swigCPtr, this, h);
  }

  public void setOrthoWindowWidth(float w) {
    OgreJNI.Frustum_setOrthoWindowWidth(swigCPtr, this, w);
  }

  public float getOrthoWindowHeight() {
    return OgreJNI.Frustum_getOrthoWindowHeight(swigCPtr, this);
  }

  public float getOrthoWindowWidth() {
    return OgreJNI.Frustum_getOrthoWindowWidth(swigCPtr, this);
  }

  public void enableReflection(Plane p) {
    OgreJNI.Frustum_enableReflection__SWIG_0(swigCPtr, this, Plane.getCPtr(p), p);
  }

  public void enableReflection(MovablePlane p) {
    OgreJNI.Frustum_enableReflection__SWIG_1(swigCPtr, this, MovablePlane.getCPtr(p), p);
  }

  public void disableReflection() {
    OgreJNI.Frustum_disableReflection(swigCPtr, this);
  }

  public boolean isReflected() {
    return OgreJNI.Frustum_isReflected(swigCPtr, this);
  }

  public Affine3 getReflectionMatrix() {
    return new Affine3(OgreJNI.Frustum_getReflectionMatrix(swigCPtr, this), false);
  }

  public Plane getReflectionPlane() {
    return new Plane(OgreJNI.Frustum_getReflectionPlane(swigCPtr, this), false);
  }

  public boolean projectSphere(Sphere sphere, SWIGTYPE_p_float left, SWIGTYPE_p_float top, SWIGTYPE_p_float right, SWIGTYPE_p_float bottom) {
    return OgreJNI.Frustum_projectSphere(swigCPtr, this, Sphere.getCPtr(sphere), sphere, SWIGTYPE_p_float.getCPtr(left), SWIGTYPE_p_float.getCPtr(top), SWIGTYPE_p_float.getCPtr(right), SWIGTYPE_p_float.getCPtr(bottom));
  }

  public void enableCustomNearClipPlane(MovablePlane plane) {
    OgreJNI.Frustum_enableCustomNearClipPlane__SWIG_0(swigCPtr, this, MovablePlane.getCPtr(plane), plane);
  }

  public void enableCustomNearClipPlane(Plane plane) {
    OgreJNI.Frustum_enableCustomNearClipPlane__SWIG_1(swigCPtr, this, Plane.getCPtr(plane), plane);
  }

  public void disableCustomNearClipPlane() {
    OgreJNI.Frustum_disableCustomNearClipPlane(swigCPtr, this);
  }

  public boolean isCustomNearClipPlaneEnabled() {
    return OgreJNI.Frustum_isCustomNearClipPlaneEnabled(swigCPtr, this);
  }

  public void visitRenderables(Renderable.Visitor visitor, boolean debugRenderables) {
    OgreJNI.Frustum_visitRenderables__SWIG_0(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor, debugRenderables);
  }

  public void visitRenderables(Renderable.Visitor visitor) {
    OgreJNI.Frustum_visitRenderables__SWIG_1(swigCPtr, this, Renderable.Visitor.getCPtr(visitor), visitor);
  }

  public static float getINFINITE_FAR_PLANE_ADJUST() {
    return OgreJNI.Frustum_INFINITE_FAR_PLANE_ADJUST_get();
  }

  public Vector3 getPositionForViewUpdate() {
    return new Vector3(OgreJNI.Frustum_getPositionForViewUpdate(swigCPtr, this), false);
  }

  public Quaternion getOrientationForViewUpdate() {
    return new Quaternion(OgreJNI.Frustum_getOrientationForViewUpdate(swigCPtr, this), false);
  }

  public PlaneBoundedVolume getPlaneBoundedVolume() {
    return new PlaneBoundedVolume(OgreJNI.Frustum_getPlaneBoundedVolume(swigCPtr, this), true);
  }

  public void setOrientationMode(OrientationMode orientationMode) {
    OgreJNI.Frustum_setOrientationMode(swigCPtr, this, orientationMode.swigValue());
  }

  public OrientationMode getOrientationMode() {
    return OrientationMode.swigToEnum(OgreJNI.Frustum_getOrientationMode(swigCPtr, this));
  }

}
