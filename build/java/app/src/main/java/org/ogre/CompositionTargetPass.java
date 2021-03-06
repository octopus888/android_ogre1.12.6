/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class CompositionTargetPass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CompositionTargetPass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CompositionTargetPass obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_CompositionTargetPass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CompositionTargetPass(CompositionTechnique parent) {
    this(OgreJNI.new_CompositionTargetPass(CompositionTechnique.getCPtr(parent), parent), true);
  }

  public void setInputMode(CompositionTargetPass.InputMode mode) {
    OgreJNI.CompositionTargetPass_setInputMode(swigCPtr, this, mode.swigValue());
  }

  public CompositionTargetPass.InputMode getInputMode() {
    return CompositionTargetPass.InputMode.swigToEnum(OgreJNI.CompositionTargetPass_getInputMode(swigCPtr, this));
  }

  public void setOutputName(String out) {
    OgreJNI.CompositionTargetPass_setOutputName(swigCPtr, this, out);
  }

  public String getOutputName() {
    return OgreJNI.CompositionTargetPass_getOutputName(swigCPtr, this);
  }

  public void setOnlyInitial(boolean value) {
    OgreJNI.CompositionTargetPass_setOnlyInitial(swigCPtr, this, value);
  }

  public boolean getOnlyInitial() {
    return OgreJNI.CompositionTargetPass_getOnlyInitial(swigCPtr, this);
  }

  public void setVisibilityMask(long mask) {
    OgreJNI.CompositionTargetPass_setVisibilityMask(swigCPtr, this, mask);
  }

  public long getVisibilityMask() {
    return OgreJNI.CompositionTargetPass_getVisibilityMask(swigCPtr, this);
  }

  public void setMaterialScheme(String schemeName) {
    OgreJNI.CompositionTargetPass_setMaterialScheme(swigCPtr, this, schemeName);
  }

  public String getMaterialScheme() {
    return OgreJNI.CompositionTargetPass_getMaterialScheme(swigCPtr, this);
  }

  public void setShadowsEnabled(boolean enabled) {
    OgreJNI.CompositionTargetPass_setShadowsEnabled(swigCPtr, this, enabled);
  }

  public boolean getShadowsEnabled() {
    return OgreJNI.CompositionTargetPass_getShadowsEnabled(swigCPtr, this);
  }

  public void setLodBias(float bias) {
    OgreJNI.CompositionTargetPass_setLodBias(swigCPtr, this, bias);
  }

  public float getLodBias() {
    return OgreJNI.CompositionTargetPass_getLodBias(swigCPtr, this);
  }

  public CompositionPass createPass(CompositionPass.PassType type) {
    long cPtr = OgreJNI.CompositionTargetPass_createPass__SWIG_0(swigCPtr, this, type.swigValue());
    return (cPtr == 0) ? null : new CompositionPass(cPtr, false);
  }

  public CompositionPass createPass() {
    long cPtr = OgreJNI.CompositionTargetPass_createPass__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new CompositionPass(cPtr, false);
  }

  public void removePass(long idx) {
    OgreJNI.CompositionTargetPass_removePass(swigCPtr, this, idx);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__CompositionPass_p_t getPasses() {
    return new SWIGTYPE_p_std__vectorT_Ogre__CompositionPass_p_t(OgreJNI.CompositionTargetPass_getPasses(swigCPtr, this), false);
  }

  public void removeAllPasses() {
    OgreJNI.CompositionTargetPass_removeAllPasses(swigCPtr, this);
  }

  public CompositionTechnique getParent() {
    long cPtr = OgreJNI.CompositionTargetPass_getParent(swigCPtr, this);
    return (cPtr == 0) ? null : new CompositionTechnique(cPtr, false);
  }

  public boolean _isSupported() {
    return OgreJNI.CompositionTargetPass__isSupported(swigCPtr, this);
  }

  public enum InputMode {
    IM_NONE,
    IM_PREVIOUS;

    public final int swigValue() {
      return swigValue;
    }

    public static InputMode swigToEnum(int swigValue) {
      InputMode[] swigValues = InputMode.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (InputMode swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + InputMode.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private InputMode() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private InputMode(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private InputMode(InputMode swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
