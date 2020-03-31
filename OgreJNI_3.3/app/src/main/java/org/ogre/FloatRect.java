/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class FloatRect {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FloatRect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FloatRect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_FloatRect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLeft(float value) {
    OgreJNI.FloatRect_left_set(swigCPtr, this, value);
  }

  public float getLeft() {
    return OgreJNI.FloatRect_left_get(swigCPtr, this);
  }

  public void setTop(float value) {
    OgreJNI.FloatRect_top_set(swigCPtr, this, value);
  }

  public float getTop() {
    return OgreJNI.FloatRect_top_get(swigCPtr, this);
  }

  public void setRight(float value) {
    OgreJNI.FloatRect_right_set(swigCPtr, this, value);
  }

  public float getRight() {
    return OgreJNI.FloatRect_right_get(swigCPtr, this);
  }

  public void setBottom(float value) {
    OgreJNI.FloatRect_bottom_set(swigCPtr, this, value);
  }

  public float getBottom() {
    return OgreJNI.FloatRect_bottom_get(swigCPtr, this);
  }

  public FloatRect() {
    this(OgreJNI.new_FloatRect__SWIG_0(), true);
  }

  public FloatRect(float l, float t, float r, float b) {
    this(OgreJNI.new_FloatRect__SWIG_1(l, t, r, b), true);
  }

  public FloatRect(FloatRect o) {
    this(OgreJNI.new_FloatRect__SWIG_2(FloatRect.getCPtr(o), o), true);
  }

  public float width() {
    return OgreJNI.FloatRect_width(swigCPtr, this);
  }

  public float height() {
    return OgreJNI.FloatRect_height(swigCPtr, this);
  }

  public boolean isNull() {
    return OgreJNI.FloatRect_isNull(swigCPtr, this);
  }

  public void setNull() {
    OgreJNI.FloatRect_setNull(swigCPtr, this);
  }

  public FloatRect merge(FloatRect rhs) {
    return new FloatRect(OgreJNI.FloatRect_merge(swigCPtr, this, FloatRect.getCPtr(rhs), rhs), false);
  }

  public FloatRect intersect(FloatRect rhs) {
    return new FloatRect(OgreJNI.FloatRect_intersect(swigCPtr, this, FloatRect.getCPtr(rhs), rhs), true);
  }

  public String toString() {
    return OgreJNI.FloatRect_toString(swigCPtr, this);
  }

}
