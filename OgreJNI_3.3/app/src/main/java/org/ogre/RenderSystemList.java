/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class RenderSystemList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RenderSystemList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RenderSystemList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_RenderSystemList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RenderSystemList() {
    this(OgreJNI.new_RenderSystemList__SWIG_0(), true);
  }

  public RenderSystemList(long n) {
    this(OgreJNI.new_RenderSystemList__SWIG_1(n), true);
  }

  public long size() {
    return OgreJNI.RenderSystemList_size(swigCPtr, this);
  }

  public long capacity() {
    return OgreJNI.RenderSystemList_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    OgreJNI.RenderSystemList_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return OgreJNI.RenderSystemList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    OgreJNI.RenderSystemList_clear(swigCPtr, this);
  }

  public void add(RenderSystem x) {
    OgreJNI.RenderSystemList_add(swigCPtr, this, RenderSystem.getCPtr(x), x);
  }

  public RenderSystem get(int i) {
    long cPtr = OgreJNI.RenderSystemList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new RenderSystem(cPtr, false);
  }

  public void set(int i, RenderSystem val) {
    OgreJNI.RenderSystemList_set(swigCPtr, this, i, RenderSystem.getCPtr(val), val);
  }

}