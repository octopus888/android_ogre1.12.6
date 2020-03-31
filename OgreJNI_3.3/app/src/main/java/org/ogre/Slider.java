/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Slider extends Widget {
  private transient long swigCPtr;

  protected Slider(long cPtr, boolean cMemoryOwn) {
    super(BitesJNI.Slider_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Slider obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BitesJNI.delete_Slider(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Slider(String name, SWIGTYPE_p_Ogre__DisplayString caption, float width, float trackWidth, float valueBoxWidth, float minValue, float maxValue, long snaps) {
    this(BitesJNI.new_Slider(name, SWIGTYPE_p_Ogre__DisplayString.getCPtr(caption), width, trackWidth, valueBoxWidth, minValue, maxValue, snaps), true);
  }

  public void setRange(float minValue, float maxValue, long snaps, boolean notifyListener) {
    BitesJNI.Slider_setRange__SWIG_0(swigCPtr, this, minValue, maxValue, snaps, notifyListener);
  }

  public void setRange(float minValue, float maxValue, long snaps) {
    BitesJNI.Slider_setRange__SWIG_1(swigCPtr, this, minValue, maxValue, snaps);
  }

  public SWIGTYPE_p_Ogre__DisplayString getValueCaption() {
    return new SWIGTYPE_p_Ogre__DisplayString(BitesJNI.Slider_getValueCaption(swigCPtr, this), false);
  }

  public void setValueCaption(SWIGTYPE_p_Ogre__DisplayString caption) {
    BitesJNI.Slider_setValueCaption(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(caption));
  }

  public void setValue(float value, boolean notifyListener) {
    BitesJNI.Slider_setValue__SWIG_0(swigCPtr, this, value, notifyListener);
  }

  public void setValue(float value) {
    BitesJNI.Slider_setValue__SWIG_1(swigCPtr, this, value);
  }

  public float getValue() {
    return BitesJNI.Slider_getValue(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__DisplayString getCaption() {
    return new SWIGTYPE_p_Ogre__DisplayString(BitesJNI.Slider_getCaption(swigCPtr, this), false);
  }

  public void setCaption(SWIGTYPE_p_Ogre__DisplayString caption) {
    BitesJNI.Slider_setCaption(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(caption));
  }

  public void _cursorPressed(Vector2 cursorPos) {
    BitesJNI.Slider__cursorPressed(swigCPtr, this, Vector2.getCPtr(cursorPos), cursorPos);
  }

  public void _cursorReleased(Vector2 cursorPos) {
    BitesJNI.Slider__cursorReleased(swigCPtr, this, Vector2.getCPtr(cursorPos), cursorPos);
  }

  public void _cursorMoved(Vector2 cursorPos, float wheelDelta) {
    BitesJNI.Slider__cursorMoved(swigCPtr, this, Vector2.getCPtr(cursorPos), cursorPos, wheelDelta);
  }

  public void _focusLost() {
    BitesJNI.Slider__focusLost(swigCPtr, this);
  }

}
