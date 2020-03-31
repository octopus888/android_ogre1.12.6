/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class TextureUnitState {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TextureUnitState(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TextureUnitState obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_TextureUnitState(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class TextureEffect {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected TextureEffect(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(TextureEffect obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_TextureUnitState_TextureEffect(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setType(TextureUnitState.TextureEffectType value) {
      OgreJNI.TextureUnitState_TextureEffect_type_set(swigCPtr, this, value.swigValue());
    }
  
    public TextureUnitState.TextureEffectType getType() {
      return TextureUnitState.TextureEffectType.swigToEnum(OgreJNI.TextureUnitState_TextureEffect_type_get(swigCPtr, this));
    }
  
    public void setSubtype(int value) {
      OgreJNI.TextureUnitState_TextureEffect_subtype_set(swigCPtr, this, value);
    }
  
    public int getSubtype() {
      return OgreJNI.TextureUnitState_TextureEffect_subtype_get(swigCPtr, this);
    }
  
    public void setArg1(float value) {
      OgreJNI.TextureUnitState_TextureEffect_arg1_set(swigCPtr, this, value);
    }
  
    public float getArg1() {
      return OgreJNI.TextureUnitState_TextureEffect_arg1_get(swigCPtr, this);
    }
  
    public void setArg2(float value) {
      OgreJNI.TextureUnitState_TextureEffect_arg2_set(swigCPtr, this, value);
    }
  
    public float getArg2() {
      return OgreJNI.TextureUnitState_TextureEffect_arg2_get(swigCPtr, this);
    }
  
    public void setWaveType(WaveformType value) {
      OgreJNI.TextureUnitState_TextureEffect_waveType_set(swigCPtr, this, value.swigValue());
    }
  
    public WaveformType getWaveType() {
      return WaveformType.swigToEnum(OgreJNI.TextureUnitState_TextureEffect_waveType_get(swigCPtr, this));
    }
  
    public void setBase(float value) {
      OgreJNI.TextureUnitState_TextureEffect_base_set(swigCPtr, this, value);
    }
  
    public float getBase() {
      return OgreJNI.TextureUnitState_TextureEffect_base_get(swigCPtr, this);
    }
  
    public void setFrequency(float value) {
      OgreJNI.TextureUnitState_TextureEffect_frequency_set(swigCPtr, this, value);
    }
  
    public float getFrequency() {
      return OgreJNI.TextureUnitState_TextureEffect_frequency_get(swigCPtr, this);
    }
  
    public void setPhase(float value) {
      OgreJNI.TextureUnitState_TextureEffect_phase_set(swigCPtr, this, value);
    }
  
    public float getPhase() {
      return OgreJNI.TextureUnitState_TextureEffect_phase_get(swigCPtr, this);
    }
  
    public void setAmplitude(float value) {
      OgreJNI.TextureUnitState_TextureEffect_amplitude_set(swigCPtr, this, value);
    }
  
    public float getAmplitude() {
      return OgreJNI.TextureUnitState_TextureEffect_amplitude_get(swigCPtr, this);
    }
  
    public void setController(ControllerReal value) {
      OgreJNI.TextureUnitState_TextureEffect_controller_set(swigCPtr, this, ControllerReal.getCPtr(value), value);
    }
  
    public ControllerReal getController() {
      long cPtr = OgreJNI.TextureUnitState_TextureEffect_controller_get(swigCPtr, this);
      return (cPtr == 0) ? null : new ControllerReal(cPtr, false);
    }
  
    public void setFrustum(Frustum value) {
      OgreJNI.TextureUnitState_TextureEffect_frustum_set(swigCPtr, this, Frustum.getCPtr(value), value);
    }
  
    public Frustum getFrustum() {
      long cPtr = OgreJNI.TextureUnitState_TextureEffect_frustum_get(swigCPtr, this);
      return (cPtr == 0) ? null : new Frustum(cPtr, false);
    }
  
    public TextureEffect() {
      this(OgreJNI.new_TextureUnitState_TextureEffect(), true);
    }
  
  }

  public TextureUnitState(Pass parent) {
    this(OgreJNI.new_TextureUnitState__SWIG_0(Pass.getCPtr(parent), parent), true);
  }

  public TextureUnitState(Pass parent, TextureUnitState oth) {
    this(OgreJNI.new_TextureUnitState__SWIG_1(Pass.getCPtr(parent), parent, TextureUnitState.getCPtr(oth), oth), true);
  }

  public TextureUnitState(Pass parent, String texName, long texCoordSet) {
    this(OgreJNI.new_TextureUnitState__SWIG_2(Pass.getCPtr(parent), parent, texName, texCoordSet), true);
  }

  public TextureUnitState(Pass parent, String texName) {
    this(OgreJNI.new_TextureUnitState__SWIG_3(Pass.getCPtr(parent), parent, texName), true);
  }

  public String getTextureName() {
    return OgreJNI.TextureUnitState_getTextureName(swigCPtr, this);
  }

  public void setTextureName(String name) {
    OgreJNI.TextureUnitState_setTextureName__SWIG_0(swigCPtr, this, name);
  }

  public void setTextureName(String name, TextureType ttype) {
    OgreJNI.TextureUnitState_setTextureName__SWIG_1(swigCPtr, this, name, ttype.swigValue());
  }

  public void setTexture(TexturePtr texPtr) {
    OgreJNI.TextureUnitState_setTexture(swigCPtr, this, TexturePtr.getCPtr(texPtr), texPtr);
  }

  public void setAnimatedTextureName(String name, long numFrames, float duration) {
    OgreJNI.TextureUnitState_setAnimatedTextureName__SWIG_0(swigCPtr, this, name, numFrames, duration);
  }

  public void setAnimatedTextureName(String name, long numFrames) {
    OgreJNI.TextureUnitState_setAnimatedTextureName__SWIG_1(swigCPtr, this, name, numFrames);
  }

  public void setAnimatedTextureName(SWIGTYPE_p_std__string names, long numFrames, float duration) {
    OgreJNI.TextureUnitState_setAnimatedTextureName__SWIG_2(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(names), numFrames, duration);
  }

  public void setAnimatedTextureName(SWIGTYPE_p_std__string names, long numFrames) {
    OgreJNI.TextureUnitState_setAnimatedTextureName__SWIG_3(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(names), numFrames);
  }

  public void setAnimatedTextureName(StringVector names, float duration) {
    OgreJNI.TextureUnitState_setAnimatedTextureName__SWIG_4(swigCPtr, this, StringVector.getCPtr(names), names, duration);
  }

  public void setAnimatedTextureName(StringVector names) {
    OgreJNI.TextureUnitState_setAnimatedTextureName__SWIG_5(swigCPtr, this, StringVector.getCPtr(names), names);
  }

  public void setLayerArrayNames(TextureType type, StringVector names) {
    OgreJNI.TextureUnitState_setLayerArrayNames(swigCPtr, this, type.swigValue(), StringVector.getCPtr(names), names);
  }

  public SWIGTYPE_p_std__pairT_size_t_size_t_t getTextureDimensions(long frame) {
    return new SWIGTYPE_p_std__pairT_size_t_size_t_t(OgreJNI.TextureUnitState_getTextureDimensions__SWIG_0(swigCPtr, this, frame), true);
  }

  public SWIGTYPE_p_std__pairT_size_t_size_t_t getTextureDimensions() {
    return new SWIGTYPE_p_std__pairT_size_t_size_t_t(OgreJNI.TextureUnitState_getTextureDimensions__SWIG_1(swigCPtr, this), true);
  }

  public void setCurrentFrame(long frameNumber) {
    OgreJNI.TextureUnitState_setCurrentFrame(swigCPtr, this, frameNumber);
  }

  public long getCurrentFrame() {
    return OgreJNI.TextureUnitState_getCurrentFrame(swigCPtr, this);
  }

  public String getFrameTextureName(long frameNumber) {
    return OgreJNI.TextureUnitState_getFrameTextureName(swigCPtr, this, frameNumber);
  }

  public void setFrameTextureName(String name, long frameNumber) {
    OgreJNI.TextureUnitState_setFrameTextureName(swigCPtr, this, name, frameNumber);
  }

  public void addFrameTextureName(String name) {
    OgreJNI.TextureUnitState_addFrameTextureName(swigCPtr, this, name);
  }

  public void deleteFrameTextureName(long frameNumber) {
    OgreJNI.TextureUnitState_deleteFrameTextureName(swigCPtr, this, frameNumber);
  }

  public long getNumFrames() {
    return OgreJNI.TextureUnitState_getNumFrames(swigCPtr, this);
  }

  public void setBindingType(TextureUnitState.BindingType bt) {
    OgreJNI.TextureUnitState_setBindingType(swigCPtr, this, bt.swigValue());
  }

  public TextureUnitState.BindingType getBindingType() {
    return TextureUnitState.BindingType.swigToEnum(OgreJNI.TextureUnitState_getBindingType(swigCPtr, this));
  }

  public void setContentType(TextureUnitState.ContentType ct) {
    OgreJNI.TextureUnitState_setContentType(swigCPtr, this, ct.swigValue());
  }

  public TextureUnitState.ContentType getContentType() {
    return TextureUnitState.ContentType.swigToEnum(OgreJNI.TextureUnitState_getContentType(swigCPtr, this));
  }

  public TextureType getTextureType() {
    return TextureType.swigToEnum(OgreJNI.TextureUnitState_getTextureType(swigCPtr, this));
  }

  public void setDesiredFormat(PixelFormat desiredFormat) {
    OgreJNI.TextureUnitState_setDesiredFormat(swigCPtr, this, desiredFormat.swigValue());
  }

  public PixelFormat getDesiredFormat() {
    return PixelFormat.swigToEnum(OgreJNI.TextureUnitState_getDesiredFormat(swigCPtr, this));
  }

  public void setNumMipmaps(int numMipmaps) {
    OgreJNI.TextureUnitState_setNumMipmaps(swigCPtr, this, numMipmaps);
  }

  public int getNumMipmaps() {
    return OgreJNI.TextureUnitState_getNumMipmaps(swigCPtr, this);
  }

  public void setIsAlpha(boolean isAlpha) {
    OgreJNI.TextureUnitState_setIsAlpha(swigCPtr, this, isAlpha);
  }

  public boolean getIsAlpha() {
    return OgreJNI.TextureUnitState_getIsAlpha(swigCPtr, this);
  }

  public float getGamma() {
    return OgreJNI.TextureUnitState_getGamma(swigCPtr, this);
  }

  public void setGamma(float gamma) {
    OgreJNI.TextureUnitState_setGamma(swigCPtr, this, gamma);
  }

  public void setHardwareGammaEnabled(boolean enabled) {
    OgreJNI.TextureUnitState_setHardwareGammaEnabled(swigCPtr, this, enabled);
  }

  public boolean isHardwareGammaEnabled() {
    return OgreJNI.TextureUnitState_isHardwareGammaEnabled(swigCPtr, this);
  }

  public long getTextureCoordSet() {
    return OgreJNI.TextureUnitState_getTextureCoordSet(swigCPtr, this);
  }

  public void setTextureCoordSet(long set) {
    OgreJNI.TextureUnitState_setTextureCoordSet(swigCPtr, this, set);
  }

  public void setTextureTransform(Matrix4 xform) {
    OgreJNI.TextureUnitState_setTextureTransform(swigCPtr, this, Matrix4.getCPtr(xform), xform);
  }

  public Matrix4 getTextureTransform() {
    return new Matrix4(OgreJNI.TextureUnitState_getTextureTransform(swigCPtr, this), false);
  }

  public void setTextureScroll(float u, float v) {
    OgreJNI.TextureUnitState_setTextureScroll(swigCPtr, this, u, v);
  }

  public void setTextureUScroll(float value) {
    OgreJNI.TextureUnitState_setTextureUScroll(swigCPtr, this, value);
  }

  public float getTextureUScroll() {
    return OgreJNI.TextureUnitState_getTextureUScroll(swigCPtr, this);
  }

  public void setTextureVScroll(float value) {
    OgreJNI.TextureUnitState_setTextureVScroll(swigCPtr, this, value);
  }

  public float getTextureVScroll() {
    return OgreJNI.TextureUnitState_getTextureVScroll(swigCPtr, this);
  }

  public void setTextureUScale(float value) {
    OgreJNI.TextureUnitState_setTextureUScale(swigCPtr, this, value);
  }

  public float getTextureUScale() {
    return OgreJNI.TextureUnitState_getTextureUScale(swigCPtr, this);
  }

  public void setTextureVScale(float value) {
    OgreJNI.TextureUnitState_setTextureVScale(swigCPtr, this, value);
  }

  public float getTextureVScale() {
    return OgreJNI.TextureUnitState_getTextureVScale(swigCPtr, this);
  }

  public void setTextureScale(float uScale, float vScale) {
    OgreJNI.TextureUnitState_setTextureScale(swigCPtr, this, uScale, vScale);
  }

  public void setTextureRotate(Radian angle) {
    OgreJNI.TextureUnitState_setTextureRotate(swigCPtr, this, Radian.getCPtr(angle), angle);
  }

  public Radian getTextureRotate() {
    return new Radian(OgreJNI.TextureUnitState_getTextureRotate(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__shared_ptrT_Ogre__Sampler_t getSampler() {
    return new SWIGTYPE_p_std__shared_ptrT_Ogre__Sampler_t(OgreJNI.TextureUnitState_getSampler(swigCPtr, this), false);
  }

  public void setSampler(SWIGTYPE_p_std__shared_ptrT_Ogre__Sampler_t sampler) {
    OgreJNI.TextureUnitState_setSampler(swigCPtr, this, SWIGTYPE_p_std__shared_ptrT_Ogre__Sampler_t.getCPtr(sampler));
  }

  public Sampler.UVWAddressingMode getTextureAddressingMode() {
    return new Sampler.UVWAddressingMode(OgreJNI.TextureUnitState_getTextureAddressingMode(swigCPtr, this), false);
  }

  public void setTextureAddressingMode(TextureAddressingMode tam) {
    OgreJNI.TextureUnitState_setTextureAddressingMode__SWIG_0(swigCPtr, this, tam.swigValue());
  }

  public void setTextureAddressingMode(TextureAddressingMode u, TextureAddressingMode v, TextureAddressingMode w) {
    OgreJNI.TextureUnitState_setTextureAddressingMode__SWIG_1(swigCPtr, this, u.swigValue(), v.swigValue(), w.swigValue());
  }

  public void setTextureAddressingMode(Sampler.UVWAddressingMode uvw) {
    OgreJNI.TextureUnitState_setTextureAddressingMode__SWIG_2(swigCPtr, this, Sampler.UVWAddressingMode.getCPtr(uvw), uvw);
  }

  public void setTextureBorderColour(ColourValue colour) {
    OgreJNI.TextureUnitState_setTextureBorderColour(swigCPtr, this, ColourValue.getCPtr(colour), colour);
  }

  public ColourValue getTextureBorderColour() {
    return new ColourValue(OgreJNI.TextureUnitState_getTextureBorderColour(swigCPtr, this), false);
  }

  public void setTextureFiltering(TextureFilterOptions filterType) {
    OgreJNI.TextureUnitState_setTextureFiltering__SWIG_0(swigCPtr, this, filterType.swigValue());
  }

  public void setTextureFiltering(FilterType ftype, FilterOptions opts) {
    OgreJNI.TextureUnitState_setTextureFiltering__SWIG_1(swigCPtr, this, ftype.swigValue(), opts.swigValue());
  }

  public void setTextureFiltering(FilterOptions minFilter, FilterOptions magFilter, FilterOptions mipFilter) {
    OgreJNI.TextureUnitState_setTextureFiltering__SWIG_2(swigCPtr, this, minFilter.swigValue(), magFilter.swigValue(), mipFilter.swigValue());
  }

  public FilterOptions getTextureFiltering(FilterType ftype) {
    return FilterOptions.swigToEnum(OgreJNI.TextureUnitState_getTextureFiltering(swigCPtr, this, ftype.swigValue()));
  }

  public void setTextureCompareEnabled(boolean enabled) {
    OgreJNI.TextureUnitState_setTextureCompareEnabled(swigCPtr, this, enabled);
  }

  public boolean getTextureCompareEnabled() {
    return OgreJNI.TextureUnitState_getTextureCompareEnabled(swigCPtr, this);
  }

  public void setTextureCompareFunction(CompareFunction function) {
    OgreJNI.TextureUnitState_setTextureCompareFunction(swigCPtr, this, function.swigValue());
  }

  public CompareFunction getTextureCompareFunction() {
    return CompareFunction.swigToEnum(OgreJNI.TextureUnitState_getTextureCompareFunction(swigCPtr, this));
  }

  public void setTextureAnisotropy(long maxAniso) {
    OgreJNI.TextureUnitState_setTextureAnisotropy(swigCPtr, this, maxAniso);
  }

  public long getTextureAnisotropy() {
    return OgreJNI.TextureUnitState_getTextureAnisotropy(swigCPtr, this);
  }

  public void setTextureMipmapBias(float bias) {
    OgreJNI.TextureUnitState_setTextureMipmapBias(swigCPtr, this, bias);
  }

  public float getTextureMipmapBias() {
    return OgreJNI.TextureUnitState_getTextureMipmapBias(swigCPtr, this);
  }

  public void setColourOperationEx(LayerBlendOperationEx op, LayerBlendSource source1, LayerBlendSource source2, ColourValue arg1, ColourValue arg2, float manualBlend) {
    OgreJNI.TextureUnitState_setColourOperationEx__SWIG_0(swigCPtr, this, op.swigValue(), source1.swigValue(), source2.swigValue(), ColourValue.getCPtr(arg1), arg1, ColourValue.getCPtr(arg2), arg2, manualBlend);
  }

  public void setColourOperationEx(LayerBlendOperationEx op, LayerBlendSource source1, LayerBlendSource source2, ColourValue arg1, ColourValue arg2) {
    OgreJNI.TextureUnitState_setColourOperationEx__SWIG_1(swigCPtr, this, op.swigValue(), source1.swigValue(), source2.swigValue(), ColourValue.getCPtr(arg1), arg1, ColourValue.getCPtr(arg2), arg2);
  }

  public void setColourOperationEx(LayerBlendOperationEx op, LayerBlendSource source1, LayerBlendSource source2, ColourValue arg1) {
    OgreJNI.TextureUnitState_setColourOperationEx__SWIG_2(swigCPtr, this, op.swigValue(), source1.swigValue(), source2.swigValue(), ColourValue.getCPtr(arg1), arg1);
  }

  public void setColourOperationEx(LayerBlendOperationEx op, LayerBlendSource source1, LayerBlendSource source2) {
    OgreJNI.TextureUnitState_setColourOperationEx__SWIG_3(swigCPtr, this, op.swigValue(), source1.swigValue(), source2.swigValue());
  }

  public void setColourOperationEx(LayerBlendOperationEx op, LayerBlendSource source1) {
    OgreJNI.TextureUnitState_setColourOperationEx__SWIG_4(swigCPtr, this, op.swigValue(), source1.swigValue());
  }

  public void setColourOperationEx(LayerBlendOperationEx op) {
    OgreJNI.TextureUnitState_setColourOperationEx__SWIG_5(swigCPtr, this, op.swigValue());
  }

  public void setColourOperation(LayerBlendOperation op) {
    OgreJNI.TextureUnitState_setColourOperation(swigCPtr, this, op.swigValue());
  }

  public void setColourOpMultipassFallback(SceneBlendFactor sourceFactor, SceneBlendFactor destFactor) {
    OgreJNI.TextureUnitState_setColourOpMultipassFallback(swigCPtr, this, sourceFactor.swigValue(), destFactor.swigValue());
  }

  public LayerBlendModeEx getColourBlendMode() {
    return new LayerBlendModeEx(OgreJNI.TextureUnitState_getColourBlendMode(swigCPtr, this), false);
  }

  public LayerBlendModeEx getAlphaBlendMode() {
    return new LayerBlendModeEx(OgreJNI.TextureUnitState_getAlphaBlendMode(swigCPtr, this), false);
  }

  public SceneBlendFactor getColourBlendFallbackSrc() {
    return SceneBlendFactor.swigToEnum(OgreJNI.TextureUnitState_getColourBlendFallbackSrc(swigCPtr, this));
  }

  public SceneBlendFactor getColourBlendFallbackDest() {
    return SceneBlendFactor.swigToEnum(OgreJNI.TextureUnitState_getColourBlendFallbackDest(swigCPtr, this));
  }

  public void setAlphaOperation(LayerBlendOperationEx op, LayerBlendSource source1, LayerBlendSource source2, float arg1, float arg2, float manualBlend) {
    OgreJNI.TextureUnitState_setAlphaOperation__SWIG_0(swigCPtr, this, op.swigValue(), source1.swigValue(), source2.swigValue(), arg1, arg2, manualBlend);
  }

  public void setAlphaOperation(LayerBlendOperationEx op, LayerBlendSource source1, LayerBlendSource source2, float arg1, float arg2) {
    OgreJNI.TextureUnitState_setAlphaOperation__SWIG_1(swigCPtr, this, op.swigValue(), source1.swigValue(), source2.swigValue(), arg1, arg2);
  }

  public void setAlphaOperation(LayerBlendOperationEx op, LayerBlendSource source1, LayerBlendSource source2, float arg1) {
    OgreJNI.TextureUnitState_setAlphaOperation__SWIG_2(swigCPtr, this, op.swigValue(), source1.swigValue(), source2.swigValue(), arg1);
  }

  public void setAlphaOperation(LayerBlendOperationEx op, LayerBlendSource source1, LayerBlendSource source2) {
    OgreJNI.TextureUnitState_setAlphaOperation__SWIG_3(swigCPtr, this, op.swigValue(), source1.swigValue(), source2.swigValue());
  }

  public void setAlphaOperation(LayerBlendOperationEx op, LayerBlendSource source1) {
    OgreJNI.TextureUnitState_setAlphaOperation__SWIG_4(swigCPtr, this, op.swigValue(), source1.swigValue());
  }

  public void setAlphaOperation(LayerBlendOperationEx op) {
    OgreJNI.TextureUnitState_setAlphaOperation__SWIG_5(swigCPtr, this, op.swigValue());
  }

  public void addEffect(TextureUnitState.TextureEffect effect) {
    OgreJNI.TextureUnitState_addEffect(swigCPtr, this, TextureUnitState.TextureEffect.getCPtr(effect), effect);
  }

  public void setEnvironmentMap(boolean enable, TextureUnitState.EnvMapType envMapType) {
    OgreJNI.TextureUnitState_setEnvironmentMap__SWIG_0(swigCPtr, this, enable, envMapType.swigValue());
  }

  public void setEnvironmentMap(boolean enable) {
    OgreJNI.TextureUnitState_setEnvironmentMap__SWIG_1(swigCPtr, this, enable);
  }

  public void setScrollAnimation(float uSpeed, float vSpeed) {
    OgreJNI.TextureUnitState_setScrollAnimation(swigCPtr, this, uSpeed, vSpeed);
  }

  public void setRotateAnimation(float speed) {
    OgreJNI.TextureUnitState_setRotateAnimation(swigCPtr, this, speed);
  }

  public void setTransformAnimation(TextureUnitState.TextureTransformType ttype, WaveformType waveType, float base, float frequency, float phase, float amplitude) {
    OgreJNI.TextureUnitState_setTransformAnimation__SWIG_0(swigCPtr, this, ttype.swigValue(), waveType.swigValue(), base, frequency, phase, amplitude);
  }

  public void setTransformAnimation(TextureUnitState.TextureTransformType ttype, WaveformType waveType, float base, float frequency, float phase) {
    OgreJNI.TextureUnitState_setTransformAnimation__SWIG_1(swigCPtr, this, ttype.swigValue(), waveType.swigValue(), base, frequency, phase);
  }

  public void setTransformAnimation(TextureUnitState.TextureTransformType ttype, WaveformType waveType, float base, float frequency) {
    OgreJNI.TextureUnitState_setTransformAnimation__SWIG_2(swigCPtr, this, ttype.swigValue(), waveType.swigValue(), base, frequency);
  }

  public void setTransformAnimation(TextureUnitState.TextureTransformType ttype, WaveformType waveType, float base) {
    OgreJNI.TextureUnitState_setTransformAnimation__SWIG_3(swigCPtr, this, ttype.swigValue(), waveType.swigValue(), base);
  }

  public void setTransformAnimation(TextureUnitState.TextureTransformType ttype, WaveformType waveType) {
    OgreJNI.TextureUnitState_setTransformAnimation__SWIG_4(swigCPtr, this, ttype.swigValue(), waveType.swigValue());
  }

  public void setProjectiveTexturing(boolean enabled, Frustum projectionSettings) {
    OgreJNI.TextureUnitState_setProjectiveTexturing__SWIG_0(swigCPtr, this, enabled, Frustum.getCPtr(projectionSettings), projectionSettings);
  }

  public void setProjectiveTexturing(boolean enabled) {
    OgreJNI.TextureUnitState_setProjectiveTexturing__SWIG_1(swigCPtr, this, enabled);
  }

  public void removeAllEffects() {
    OgreJNI.TextureUnitState_removeAllEffects(swigCPtr, this);
  }

  public void removeEffect(TextureUnitState.TextureEffectType type) {
    OgreJNI.TextureUnitState_removeEffect(swigCPtr, this, type.swigValue());
  }

  public boolean isBlank() {
    return OgreJNI.TextureUnitState_isBlank(swigCPtr, this);
  }

  public void setBlank() {
    OgreJNI.TextureUnitState_setBlank(swigCPtr, this);
  }

  public boolean isTextureLoadFailing() {
    return OgreJNI.TextureUnitState_isTextureLoadFailing(swigCPtr, this);
  }

  public void retryTextureLoad() {
    OgreJNI.TextureUnitState_retryTextureLoad(swigCPtr, this);
  }

  public SWIGTYPE_p_std__multimapT_Ogre__TextureUnitState__TextureEffectType_Ogre__TextureUnitState__TextureEffect_t getEffects() {
    return new SWIGTYPE_p_std__multimapT_Ogre__TextureUnitState__TextureEffectType_Ogre__TextureUnitState__TextureEffect_t(OgreJNI.TextureUnitState_getEffects(swigCPtr, this), false);
  }

  public float getAnimationDuration() {
    return OgreJNI.TextureUnitState_getAnimationDuration(swigCPtr, this);
  }

  public boolean isDefaultFiltering() {
    return OgreJNI.TextureUnitState_isDefaultFiltering(swigCPtr, this);
  }

  public void setCompositorReference(String compositorName, String textureName, long mrtIndex) {
    OgreJNI.TextureUnitState_setCompositorReference__SWIG_0(swigCPtr, this, compositorName, textureName, mrtIndex);
  }

  public void setCompositorReference(String compositorName, String textureName) {
    OgreJNI.TextureUnitState_setCompositorReference__SWIG_1(swigCPtr, this, compositorName, textureName);
  }

  public String getReferencedCompositorName() {
    return OgreJNI.TextureUnitState_getReferencedCompositorName(swigCPtr, this);
  }

  public String getReferencedTextureName() {
    return OgreJNI.TextureUnitState_getReferencedTextureName(swigCPtr, this);
  }

  public long getReferencedMRTIndex() {
    return OgreJNI.TextureUnitState_getReferencedMRTIndex(swigCPtr, this);
  }

  public Pass getParent() {
    long cPtr = OgreJNI.TextureUnitState_getParent(swigCPtr, this);
    return (cPtr == 0) ? null : new Pass(cPtr, false);
  }

  public void _prepare() {
    OgreJNI.TextureUnitState__prepare(swigCPtr, this);
  }

  public void _unprepare() {
    OgreJNI.TextureUnitState__unprepare(swigCPtr, this);
  }

  public void _load() {
    OgreJNI.TextureUnitState__load(swigCPtr, this);
  }

  public void _unload() {
    OgreJNI.TextureUnitState__unload(swigCPtr, this);
  }

  public boolean hasViewRelativeTextureCoordinateGeneration() {
    return OgreJNI.TextureUnitState_hasViewRelativeTextureCoordinateGeneration(swigCPtr, this);
  }

  public boolean isLoaded() {
    return OgreJNI.TextureUnitState_isLoaded(swigCPtr, this);
  }

  public void _notifyNeedsRecompile() {
    OgreJNI.TextureUnitState__notifyNeedsRecompile(swigCPtr, this);
  }

  public void setName(String name) {
    OgreJNI.TextureUnitState_setName(swigCPtr, this, name);
  }

  public String getName() {
    return OgreJNI.TextureUnitState_getName(swigCPtr, this);
  }

  public void setTextureNameAlias(String name) {
    OgreJNI.TextureUnitState_setTextureNameAlias(swigCPtr, this, name);
  }

  public String getTextureNameAlias() {
    return OgreJNI.TextureUnitState_getTextureNameAlias(swigCPtr, this);
  }

  public boolean applyTextureAliases(NameValuePairList aliasList, boolean apply) {
    return OgreJNI.TextureUnitState_applyTextureAliases__SWIG_0(swigCPtr, this, NameValuePairList.getCPtr(aliasList), aliasList, apply);
  }

  public boolean applyTextureAliases(NameValuePairList aliasList) {
    return OgreJNI.TextureUnitState_applyTextureAliases__SWIG_1(swigCPtr, this, NameValuePairList.getCPtr(aliasList), aliasList);
  }

  public void _notifyParent(Pass parent) {
    OgreJNI.TextureUnitState__notifyParent(swigCPtr, this, Pass.getCPtr(parent), parent);
  }

  public TexturePtr _getTexturePtr() {
    return new TexturePtr(OgreJNI.TextureUnitState__getTexturePtr__SWIG_0(swigCPtr, this), false);
  }

  public TexturePtr _getTexturePtr(long frame) {
    return new TexturePtr(OgreJNI.TextureUnitState__getTexturePtr__SWIG_1(swigCPtr, this, frame), false);
  }

  public void _setTexturePtr(TexturePtr texptr) {
    OgreJNI.TextureUnitState__setTexturePtr__SWIG_0(swigCPtr, this, TexturePtr.getCPtr(texptr), texptr);
  }

  public void _setTexturePtr(TexturePtr texptr, long frame) {
    OgreJNI.TextureUnitState__setTexturePtr__SWIG_1(swigCPtr, this, TexturePtr.getCPtr(texptr), texptr, frame);
  }

  public long calculateSize() {
    return OgreJNI.TextureUnitState_calculateSize(swigCPtr, this);
  }

  public ControllerReal _getAnimController() {
    long cPtr = OgreJNI.TextureUnitState__getAnimController(swigCPtr, this);
    return (cPtr == 0) ? null : new ControllerReal(cPtr, false);
  }

  public SWIGTYPE_p_std__shared_ptrT_Ogre__Sampler_t _getLocalSampler() {
    return new SWIGTYPE_p_std__shared_ptrT_Ogre__Sampler_t(OgreJNI.TextureUnitState__getLocalSampler(swigCPtr, this), false);
  }

  public enum TextureEffectType {
    ET_ENVIRONMENT_MAP,
    ET_PROJECTIVE_TEXTURE,
    ET_UVSCROLL,
    ET_USCROLL,
    ET_VSCROLL,
    ET_ROTATE,
    ET_TRANSFORM;

    public final int swigValue() {
      return swigValue;
    }

    public static TextureEffectType swigToEnum(int swigValue) {
      TextureEffectType[] swigValues = TextureEffectType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (TextureEffectType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + TextureEffectType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private TextureEffectType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private TextureEffectType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private TextureEffectType(TextureEffectType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum EnvMapType {
    ENV_PLANAR,
    ENV_CURVED,
    ENV_REFLECTION,
    ENV_NORMAL;

    public final int swigValue() {
      return swigValue;
    }

    public static EnvMapType swigToEnum(int swigValue) {
      EnvMapType[] swigValues = EnvMapType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (EnvMapType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + EnvMapType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private EnvMapType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private EnvMapType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private EnvMapType(EnvMapType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum TextureTransformType {
    TT_TRANSLATE_U,
    TT_TRANSLATE_V,
    TT_SCALE_U,
    TT_SCALE_V,
    TT_ROTATE;

    public final int swigValue() {
      return swigValue;
    }

    public static TextureTransformType swigToEnum(int swigValue) {
      TextureTransformType[] swigValues = TextureTransformType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (TextureTransformType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + TextureTransformType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private TextureTransformType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private TextureTransformType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private TextureTransformType(TextureTransformType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public final static TextureAddressingMode TAM_WRAP = TextureAddressingMode.swigToEnum(OgreJNI.TextureUnitState_TAM_WRAP_get());
  public final static TextureAddressingMode TAM_MIRROR = TextureAddressingMode.swigToEnum(OgreJNI.TextureUnitState_TAM_MIRROR_get());
  public final static TextureAddressingMode TAM_CLAMP = TextureAddressingMode.swigToEnum(OgreJNI.TextureUnitState_TAM_CLAMP_get());
  public final static TextureAddressingMode TAM_BORDER = TextureAddressingMode.swigToEnum(OgreJNI.TextureUnitState_TAM_BORDER_get());
  public final static TextureAddressingMode TAM_UNKNOWN = TextureAddressingMode.swigToEnum(OgreJNI.TextureUnitState_TAM_UNKNOWN_get());
  public enum TextureCubeFace {
    CUBE_FRONT(OgreJNI.TextureUnitState_CUBE_FRONT_get()),
    CUBE_BACK(OgreJNI.TextureUnitState_CUBE_BACK_get()),
    CUBE_LEFT(OgreJNI.TextureUnitState_CUBE_LEFT_get()),
    CUBE_RIGHT(OgreJNI.TextureUnitState_CUBE_RIGHT_get()),
    CUBE_UP(OgreJNI.TextureUnitState_CUBE_UP_get()),
    CUBE_DOWN(OgreJNI.TextureUnitState_CUBE_DOWN_get());

    public final int swigValue() {
      return swigValue;
    }

    public static TextureCubeFace swigToEnum(int swigValue) {
      TextureCubeFace[] swigValues = TextureCubeFace.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (TextureCubeFace swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + TextureCubeFace.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private TextureCubeFace() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private TextureCubeFace(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private TextureCubeFace(TextureCubeFace swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum BindingType {
    BT_FRAGMENT(OgreJNI.TextureUnitState_BT_FRAGMENT_get()),
    BT_VERTEX(OgreJNI.TextureUnitState_BT_VERTEX_get());

    public final int swigValue() {
      return swigValue;
    }

    public static BindingType swigToEnum(int swigValue) {
      BindingType[] swigValues = BindingType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (BindingType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + BindingType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private BindingType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private BindingType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private BindingType(BindingType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public enum ContentType {
    CONTENT_NAMED(OgreJNI.TextureUnitState_CONTENT_NAMED_get()),
    CONTENT_SHADOW(OgreJNI.TextureUnitState_CONTENT_SHADOW_get()),
    CONTENT_COMPOSITOR(OgreJNI.TextureUnitState_CONTENT_COMPOSITOR_get());

    public final int swigValue() {
      return swigValue;
    }

    public static ContentType swigToEnum(int swigValue) {
      ContentType[] swigValues = ContentType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (ContentType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + ContentType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private ContentType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private ContentType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private ContentType(ContentType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
