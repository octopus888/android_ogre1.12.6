/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class EntityMaterialLodChangedEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EntityMaterialLodChangedEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EntityMaterialLodChangedEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_EntityMaterialLodChangedEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSubEntity(SubEntity value) {
    OgreJNI.EntityMaterialLodChangedEvent_subEntity_set(swigCPtr, this, SubEntity.getCPtr(value), value);
  }

  public SubEntity getSubEntity() {
    long cPtr = OgreJNI.EntityMaterialLodChangedEvent_subEntity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SubEntity(cPtr, false);
  }

  public void setCamera(Camera value) {
    OgreJNI.EntityMaterialLodChangedEvent_camera_set(swigCPtr, this, Camera.getCPtr(value), value);
  }

  public Camera getCamera() {
    long cPtr = OgreJNI.EntityMaterialLodChangedEvent_camera_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Camera(cPtr, false);
  }

  public void setLodValue(float value) {
    OgreJNI.EntityMaterialLodChangedEvent_lodValue_set(swigCPtr, this, value);
  }

  public float getLodValue() {
    return OgreJNI.EntityMaterialLodChangedEvent_lodValue_get(swigCPtr, this);
  }

  public void setPreviousLodIndex(int value) {
    OgreJNI.EntityMaterialLodChangedEvent_previousLodIndex_set(swigCPtr, this, value);
  }

  public int getPreviousLodIndex() {
    return OgreJNI.EntityMaterialLodChangedEvent_previousLodIndex_get(swigCPtr, this);
  }

  public void setNewLodIndex(int value) {
    OgreJNI.EntityMaterialLodChangedEvent_newLodIndex_set(swigCPtr, this, value);
  }

  public int getNewLodIndex() {
    return OgreJNI.EntityMaterialLodChangedEvent_newLodIndex_get(swigCPtr, this);
  }

  public EntityMaterialLodChangedEvent() {
    this(OgreJNI.new_EntityMaterialLodChangedEvent(), true);
  }

}