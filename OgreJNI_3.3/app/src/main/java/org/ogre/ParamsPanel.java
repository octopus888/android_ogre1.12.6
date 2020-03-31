/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ParamsPanel extends Widget {
  private transient long swigCPtr;

  protected ParamsPanel(long cPtr, boolean cMemoryOwn) {
    super(BitesJNI.ParamsPanel_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ParamsPanel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BitesJNI.delete_ParamsPanel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ParamsPanel(String name, float width, long lines) {
    this(BitesJNI.new_ParamsPanel(name, width, lines), true);
  }

  public void setAllParamNames(StringVector paramNames) {
    BitesJNI.ParamsPanel_setAllParamNames(swigCPtr, this, StringVector.getCPtr(paramNames), paramNames);
  }

  public StringVector getAllParamNames() {
    return new StringVector(BitesJNI.ParamsPanel_getAllParamNames(swigCPtr, this), false);
  }

  public void setAllParamValues(StringVector paramValues) {
    BitesJNI.ParamsPanel_setAllParamValues(swigCPtr, this, StringVector.getCPtr(paramValues), paramValues);
  }

  public void setParamValue(SWIGTYPE_p_Ogre__DisplayString paramName, SWIGTYPE_p_Ogre__DisplayString paramValue) {
    BitesJNI.ParamsPanel_setParamValue__SWIG_0(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(paramName), SWIGTYPE_p_Ogre__DisplayString.getCPtr(paramValue));
  }

  public void setParamValue(long index, SWIGTYPE_p_Ogre__DisplayString paramValue) {
    BitesJNI.ParamsPanel_setParamValue__SWIG_1(swigCPtr, this, index, SWIGTYPE_p_Ogre__DisplayString.getCPtr(paramValue));
  }

  public SWIGTYPE_p_Ogre__DisplayString getParamValue(SWIGTYPE_p_Ogre__DisplayString paramName) {
    return new SWIGTYPE_p_Ogre__DisplayString(BitesJNI.ParamsPanel_getParamValue__SWIG_0(swigCPtr, this, SWIGTYPE_p_Ogre__DisplayString.getCPtr(paramName)), true);
  }

  public SWIGTYPE_p_Ogre__DisplayString getParamValue(long index) {
    return new SWIGTYPE_p_Ogre__DisplayString(BitesJNI.ParamsPanel_getParamValue__SWIG_1(swigCPtr, this, index), true);
  }

  public StringVector getAllParamValues() {
    return new StringVector(BitesJNI.ParamsPanel_getAllParamValues(swigCPtr, this), false);
  }

}
