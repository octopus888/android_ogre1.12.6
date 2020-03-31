/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class SimpleSpline {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SimpleSpline(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SimpleSpline obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_SimpleSpline(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SimpleSpline() {
    this(OgreJNI.new_SimpleSpline(), true);
  }

  public void addPoint(Vector3 p) {
    OgreJNI.SimpleSpline_addPoint(swigCPtr, this, Vector3.getCPtr(p), p);
  }

  public Vector3 getPoint(int index) {
    return new Vector3(OgreJNI.SimpleSpline_getPoint(swigCPtr, this, index), false);
  }

  public int getNumPoints() {
    return OgreJNI.SimpleSpline_getNumPoints(swigCPtr, this);
  }

  public void clear() {
    OgreJNI.SimpleSpline_clear(swigCPtr, this);
  }

  public void updatePoint(int index, Vector3 value) {
    OgreJNI.SimpleSpline_updatePoint(swigCPtr, this, index, Vector3.getCPtr(value), value);
  }

  public Vector3 interpolate(float t) {
    return new Vector3(OgreJNI.SimpleSpline_interpolate__SWIG_0(swigCPtr, this, t), true);
  }

  public Vector3 interpolate(long fromIndex, float t) {
    return new Vector3(OgreJNI.SimpleSpline_interpolate__SWIG_1(swigCPtr, this, fromIndex, t), true);
  }

  public void setAutoCalculate(boolean autoCalc) {
    OgreJNI.SimpleSpline_setAutoCalculate(swigCPtr, this, autoCalc);
  }

  public void recalcTangents() {
    OgreJNI.SimpleSpline_recalcTangents(swigCPtr, this);
  }

}
