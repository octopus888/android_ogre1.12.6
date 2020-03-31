/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class TextureFrameControllerValue {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TextureFrameControllerValue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextureFrameControllerValue obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_TextureFrameControllerValue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TextureFrameControllerValue(TextureUnitState t) {
    this(OgreJNI.new_TextureFrameControllerValue(TextureUnitState.getCPtr(t), t), true);
  }

  public static ControllerValueRealPtr create(TextureUnitState t) {
    return new ControllerValueRealPtr(OgreJNI.TextureFrameControllerValue_create(TextureUnitState.getCPtr(t), t), true);
  }

  public float getValue() {
    return OgreJNI.TextureFrameControllerValue_getValue(swigCPtr, this);
  }

  public void setValue(float value) {
    OgreJNI.TextureFrameControllerValue_setValue(swigCPtr, this, value);
  }

}