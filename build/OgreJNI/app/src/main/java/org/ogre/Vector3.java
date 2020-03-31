/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Vector3 extends VectorBase3 {
  private transient long swigCPtr;

  protected Vector3(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.Vector3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Vector3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Vector3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Vector3() {
    this(OgreJNI.new_Vector3__SWIG_0(), true);
  }

  public Vector3(float _x, float _y, float _z) {
    this(OgreJNI.new_Vector3__SWIG_1(_x, _y, _z), true);
  }

  public Vector3(float s) {
    this(OgreJNI.new_Vector3__SWIG_2(s), true);
  }

  public Vector2 xy() {
    return new Vector2(OgreJNI.Vector3_xy(swigCPtr, this), true);
  }

  public float __getitem__(long i) {
    return OgreJNI.Vector3___getitem____SWIG_0(swigCPtr, this, i);
  }

  public boolean positionEquals(Vector3 rhs, float tolerance) {
    return OgreJNI.Vector3_positionEquals__SWIG_0(swigCPtr, this, Vector3.getCPtr(rhs), rhs, tolerance);
  }

  public boolean positionEquals(Vector3 rhs) {
    return OgreJNI.Vector3_positionEquals__SWIG_1(swigCPtr, this, Vector3.getCPtr(rhs), rhs);
  }

  public void makeFloor(Vector3 cmp) {
    OgreJNI.Vector3_makeFloor(swigCPtr, this, Vector3.getCPtr(cmp), cmp);
  }

  public void makeCeil(Vector3 cmp) {
    OgreJNI.Vector3_makeCeil(swigCPtr, this, Vector3.getCPtr(cmp), cmp);
  }

  public float dotProduct(VectorBase3 vec) {
    return OgreJNI.Vector3_dotProduct(swigCPtr, this, VectorBase3.getCPtr(vec), vec);
  }

  public float squaredLength() {
    return OgreJNI.Vector3_squaredLength(swigCPtr, this);
  }

  public boolean isZeroLength() {
    return OgreJNI.Vector3_isZeroLength(swigCPtr, this);
  }

  public float length() {
    return OgreJNI.Vector3_length(swigCPtr, this);
  }

  public float distance(Vector3 rhs) {
    return OgreJNI.Vector3_distance(swigCPtr, this, Vector3.getCPtr(rhs), rhs);
  }

  public float squaredDistance(Vector3 rhs) {
    return OgreJNI.Vector3_squaredDistance(swigCPtr, this, Vector3.getCPtr(rhs), rhs);
  }

  public float normalise() {
    return OgreJNI.Vector3_normalise(swigCPtr, this);
  }

  public Vector3 normalisedCopy() {
    return new Vector3(OgreJNI.Vector3_normalisedCopy(swigCPtr, this), true);
  }

  public boolean isNaN() {
    return OgreJNI.Vector3_isNaN(swigCPtr, this);
  }

  public Radian angleBetween(Vector3 dest) {
    return new Radian(OgreJNI.Vector3_angleBetween(swigCPtr, this, Vector3.getCPtr(dest), dest), true);
  }

  public Vector3 reflect(Vector3 normal) {
    return new Vector3(OgreJNI.Vector3_reflect(swigCPtr, this, Vector3.getCPtr(normal), normal), true);
  }

  public Vector3 __sub__() {
    return new Vector3(OgreJNI.Vector3___sub____SWIG_0(swigCPtr, this), true);
  }

  public Vector3 __add__() {
    return new Vector3(OgreJNI.Vector3___add____SWIG_0(swigCPtr, this), false);
  }

  public Vector3 __mul__(float s) {
    return new Vector3(OgreJNI.Vector3___mul____SWIG_0(swigCPtr, this, s), true);
  }

  public Vector3 __div__(float s) {
    return new Vector3(OgreJNI.Vector3___div____SWIG_0(swigCPtr, this, s), true);
  }

  public Vector3 __sub__(float s) {
    return new Vector3(OgreJNI.Vector3___sub____SWIG_1(swigCPtr, this, s), true);
  }

  public Vector3 __add__(float s) {
    return new Vector3(OgreJNI.Vector3___add____SWIG_1(swigCPtr, this, s), true);
  }

  public Vector3 __add__(Vector3 b) {
    return new Vector3(OgreJNI.Vector3___add____SWIG_2(swigCPtr, this, Vector3.getCPtr(b), b), true);
  }

  public Vector3 __sub__(Vector3 b) {
    return new Vector3(OgreJNI.Vector3___sub____SWIG_2(swigCPtr, this, Vector3.getCPtr(b), b), true);
  }

  public Vector3 __mul__(Vector3 b) {
    return new Vector3(OgreJNI.Vector3___mul____SWIG_1(swigCPtr, this, Vector3.getCPtr(b), b), true);
  }

  public Vector3 __div__(Vector3 b) {
    return new Vector3(OgreJNI.Vector3___div____SWIG_1(swigCPtr, this, Vector3.getCPtr(b), b), true);
  }

  public String toString() {
    return OgreJNI.Vector3_toString(swigCPtr, this);
  }

}
