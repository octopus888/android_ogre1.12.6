/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class CompositionPass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CompositionPass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CompositionPass obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_CompositionPass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CompositionPass(CompositionTargetPass parent) {
    this(OgreJNI.new_CompositionPass(CompositionTargetPass.getCPtr(parent), parent), true);
  }

  public void setType(CompositionPass.PassType type) {
    OgreJNI.CompositionPass_setType(swigCPtr, this, type.swigValue());
  }

  public void setIdentifier(long id) {
    OgreJNI.CompositionPass_setIdentifier(swigCPtr, this, id);
  }

  public long getIdentifier() {
    return OgreJNI.CompositionPass_getIdentifier(swigCPtr, this);
  }

  public void setMaterial(MaterialPtr mat) {
    OgreJNI.CompositionPass_setMaterial(swigCPtr, this, MaterialPtr.getCPtr(mat), mat);
  }

  public void setMaterialName(String name) {
    OgreJNI.CompositionPass_setMaterialName(swigCPtr, this, name);
  }

  public MaterialPtr getMaterial() {
    return new MaterialPtr(OgreJNI.CompositionPass_getMaterial(swigCPtr, this), false);
  }

  public void setFirstRenderQueue(short id) {
    OgreJNI.CompositionPass_setFirstRenderQueue(swigCPtr, this, id);
  }

  public short getFirstRenderQueue() {
    return OgreJNI.CompositionPass_getFirstRenderQueue(swigCPtr, this);
  }

  public void setLastRenderQueue(short id) {
    OgreJNI.CompositionPass_setLastRenderQueue(swigCPtr, this, id);
  }

  public short getLastRenderQueue() {
    return OgreJNI.CompositionPass_getLastRenderQueue(swigCPtr, this);
  }

  public void setMaterialScheme(String schemeName) {
    OgreJNI.CompositionPass_setMaterialScheme(swigCPtr, this, schemeName);
  }

  public String getMaterialScheme() {
    return OgreJNI.CompositionPass_getMaterialScheme(swigCPtr, this);
  }

  public void setClearBuffers(long val) {
    OgreJNI.CompositionPass_setClearBuffers(swigCPtr, this, val);
  }

  public long getClearBuffers() {
    return OgreJNI.CompositionPass_getClearBuffers(swigCPtr, this);
  }

  public void setClearColour(ColourValue val) {
    OgreJNI.CompositionPass_setClearColour(swigCPtr, this, ColourValue.getCPtr(val), val);
  }

  public ColourValue getClearColour() {
    return new ColourValue(OgreJNI.CompositionPass_getClearColour(swigCPtr, this), false);
  }

  public void setAutomaticColour(boolean val) {
    OgreJNI.CompositionPass_setAutomaticColour(swigCPtr, this, val);
  }

  public boolean getAutomaticColour() {
    return OgreJNI.CompositionPass_getAutomaticColour(swigCPtr, this);
  }

  public void setClearDepth(float depth) {
    OgreJNI.CompositionPass_setClearDepth(swigCPtr, this, depth);
  }

  public float getClearDepth() {
    return OgreJNI.CompositionPass_getClearDepth(swigCPtr, this);
  }

  public void setClearStencil(long value) {
    OgreJNI.CompositionPass_setClearStencil(swigCPtr, this, value);
  }

  public long getClearStencil() {
    return OgreJNI.CompositionPass_getClearStencil(swigCPtr, this);
  }

  public void setStencilCheck(boolean value) {
    OgreJNI.CompositionPass_setStencilCheck(swigCPtr, this, value);
  }

  public boolean getStencilCheck() {
    return OgreJNI.CompositionPass_getStencilCheck(swigCPtr, this);
  }

  public void setStencilFunc(CompareFunction value) {
    OgreJNI.CompositionPass_setStencilFunc(swigCPtr, this, value.swigValue());
  }

  public CompareFunction getStencilFunc() {
    return CompareFunction.swigToEnum(OgreJNI.CompositionPass_getStencilFunc(swigCPtr, this));
  }

  public void setStencilRefValue(long value) {
    OgreJNI.CompositionPass_setStencilRefValue(swigCPtr, this, value);
  }

  public long getStencilRefValue() {
    return OgreJNI.CompositionPass_getStencilRefValue(swigCPtr, this);
  }

  public void setStencilMask(long value) {
    OgreJNI.CompositionPass_setStencilMask(swigCPtr, this, value);
  }

  public long getStencilMask() {
    return OgreJNI.CompositionPass_getStencilMask(swigCPtr, this);
  }

  public void setStencilFailOp(StencilOperation value) {
    OgreJNI.CompositionPass_setStencilFailOp(swigCPtr, this, value.swigValue());
  }

  public StencilOperation getStencilFailOp() {
    return StencilOperation.swigToEnum(OgreJNI.CompositionPass_getStencilFailOp(swigCPtr, this));
  }

  public void setStencilDepthFailOp(StencilOperation value) {
    OgreJNI.CompositionPass_setStencilDepthFailOp(swigCPtr, this, value.swigValue());
  }

  public StencilOperation getStencilDepthFailOp() {
    return StencilOperation.swigToEnum(OgreJNI.CompositionPass_getStencilDepthFailOp(swigCPtr, this));
  }

  public void setStencilPassOp(StencilOperation value) {
    OgreJNI.CompositionPass_setStencilPassOp(swigCPtr, this, value.swigValue());
  }

  public StencilOperation getStencilPassOp() {
    return StencilOperation.swigToEnum(OgreJNI.CompositionPass_getStencilPassOp(swigCPtr, this));
  }

  public void setStencilTwoSidedOperation(boolean value) {
    OgreJNI.CompositionPass_setStencilTwoSidedOperation(swigCPtr, this, value);
  }

  public boolean getStencilTwoSidedOperation() {
    return OgreJNI.CompositionPass_getStencilTwoSidedOperation(swigCPtr, this);
  }

  public void setStencilReadBackAsTextureOperation(boolean value) {
    OgreJNI.CompositionPass_setStencilReadBackAsTextureOperation(swigCPtr, this, value);
  }

  public boolean getStencilReadBackAsTextureOperation() {
    return OgreJNI.CompositionPass_getStencilReadBackAsTextureOperation(swigCPtr, this);
  }

  static public class InputTex {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected InputTex(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(InputTex obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_CompositionPass_InputTex(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setName(String value) {
      OgreJNI.CompositionPass_InputTex_name_set(swigCPtr, this, value);
    }
  
    public String getName() {
      return OgreJNI.CompositionPass_InputTex_name_get(swigCPtr, this);
    }
  
    public void setMrtIndex(long value) {
      OgreJNI.CompositionPass_InputTex_mrtIndex_set(swigCPtr, this, value);
    }
  
    public long getMrtIndex() {
      return OgreJNI.CompositionPass_InputTex_mrtIndex_get(swigCPtr, this);
    }
  
    public InputTex() {
      this(OgreJNI.new_CompositionPass_InputTex__SWIG_0(), true);
    }
  
    public InputTex(String _name, long _mrtIndex) {
      this(OgreJNI.new_CompositionPass_InputTex__SWIG_1(_name, _mrtIndex), true);
    }
  
    public InputTex(String _name) {
      this(OgreJNI.new_CompositionPass_InputTex__SWIG_2(_name), true);
    }
  
  }

  public void setInput(long id, String input, long mrtIndex) {
    OgreJNI.CompositionPass_setInput__SWIG_0(swigCPtr, this, id, input, mrtIndex);
  }

  public void setInput(long id, String input) {
    OgreJNI.CompositionPass_setInput__SWIG_1(swigCPtr, this, id, input);
  }

  public void setInput(long id) {
    OgreJNI.CompositionPass_setInput__SWIG_2(swigCPtr, this, id);
  }

  public CompositionPass.InputTex getInput(long id) {
    return new CompositionPass.InputTex(OgreJNI.CompositionPass_getInput(swigCPtr, this, id), false);
  }

  public long getNumInputs() {
    return OgreJNI.CompositionPass_getNumInputs(swigCPtr, this);
  }

  public void clearAllInputs() {
    OgreJNI.CompositionPass_clearAllInputs(swigCPtr, this);
  }

  public CompositionTargetPass getParent() {
    long cPtr = OgreJNI.CompositionPass_getParent(swigCPtr, this);
    return (cPtr == 0) ? null : new CompositionTargetPass(cPtr, false);
  }

  public boolean _isSupported() {
    return OgreJNI.CompositionPass__isSupported(swigCPtr, this);
  }

  public void setQuadCorners(FloatRect quad) {
    OgreJNI.CompositionPass_setQuadCorners__SWIG_0(swigCPtr, this, FloatRect.getCPtr(quad), quad);
  }

  public void setQuadCorners(float left, float top, float right, float bottom) {
    OgreJNI.CompositionPass_setQuadCorners__SWIG_1(swigCPtr, this, left, top, right, bottom);
  }

  public boolean getQuadCorners(FloatRect quad) {
    return OgreJNI.CompositionPass_getQuadCorners__SWIG_0(swigCPtr, this, FloatRect.getCPtr(quad), quad);
  }

  public boolean getQuadCorners(SWIGTYPE_p_float left, SWIGTYPE_p_float top, SWIGTYPE_p_float right, SWIGTYPE_p_float bottom) {
    return OgreJNI.CompositionPass_getQuadCorners__SWIG_1(swigCPtr, this, SWIGTYPE_p_float.getCPtr(left), SWIGTYPE_p_float.getCPtr(top), SWIGTYPE_p_float.getCPtr(right), SWIGTYPE_p_float.getCPtr(bottom));
  }

  public void setQuadFarCorners(boolean farCorners, boolean farCornersViewSpace) {
    OgreJNI.CompositionPass_setQuadFarCorners(swigCPtr, this, farCorners, farCornersViewSpace);
  }

  public boolean getQuadFarCorners() {
    return OgreJNI.CompositionPass_getQuadFarCorners(swigCPtr, this);
  }

  public boolean getQuadFarCornersViewSpace() {
    return OgreJNI.CompositionPass_getQuadFarCornersViewSpace(swigCPtr, this);
  }

  public void setCustomType(String customType) {
    OgreJNI.CompositionPass_setCustomType(swigCPtr, this, customType);
  }

  public String getCustomType() {
    return OgreJNI.CompositionPass_getCustomType(swigCPtr, this);
  }

  public void setThreadGroups(Vector3i g) {
    OgreJNI.CompositionPass_setThreadGroups(swigCPtr, this, Vector3i.getCPtr(g), g);
  }

  public Vector3i getThreadGroups() {
    return new Vector3i(OgreJNI.CompositionPass_getThreadGroups(swigCPtr, this), true);
  }

  public enum PassType {
    PT_CLEAR,
    PT_STENCIL,
    PT_RENDERSCENE,
    PT_RENDERQUAD,
    PT_RENDERCUSTOM,
    PT_COMPUTE;

    public final int swigValue() {
      return swigValue;
    }

    public static PassType swigToEnum(int swigValue) {
      PassType[] swigValues = PassType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (PassType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + PassType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private PassType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private PassType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private PassType(PassType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}