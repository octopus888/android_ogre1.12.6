/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class CompositorManager extends ResourceManager {
  private transient long swigCPtr;

  protected CompositorManager(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.CompositorManager_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CompositorManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_CompositorManager(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CompositorManager() {
    this(OgreJNI.new_CompositorManager(), true);
  }

  public Resource createImpl(String name, java.math.BigInteger handle, String group, boolean isManual, ManualResourceLoader loader, NameValuePairList params) {
    long cPtr = OgreJNI.CompositorManager_createImpl(swigCPtr, this, name, handle, group, isManual, ManualResourceLoader.getCPtr(loader), loader, NameValuePairList.getCPtr(params), params);
    return (cPtr == 0) ? null : new Resource(cPtr, false);
  }

  public void initialise() {
    OgreJNI.CompositorManager_initialise(swigCPtr, this);
  }

  public CompositorPtr create(String name, String group, boolean isManual, ManualResourceLoader loader, NameValuePairList createParams) {
    return new CompositorPtr(OgreJNI.CompositorManager_create__SWIG_0(swigCPtr, this, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader, NameValuePairList.getCPtr(createParams), createParams), true);
  }

  public CompositorPtr create(String name, String group, boolean isManual, ManualResourceLoader loader) {
    return new CompositorPtr(OgreJNI.CompositorManager_create__SWIG_1(swigCPtr, this, name, group, isManual, ManualResourceLoader.getCPtr(loader), loader), true);
  }

  public CompositorPtr create(String name, String group, boolean isManual) {
    return new CompositorPtr(OgreJNI.CompositorManager_create__SWIG_2(swigCPtr, this, name, group, isManual), true);
  }

  public CompositorPtr create(String name, String group) {
    return new CompositorPtr(OgreJNI.CompositorManager_create__SWIG_3(swigCPtr, this, name, group), true);
  }

  public CompositorPtr getByName(String name, String groupName) {
    return new CompositorPtr(OgreJNI.CompositorManager_getByName__SWIG_0(swigCPtr, this, name, groupName), true);
  }

  public CompositorPtr getByName(String name) {
    return new CompositorPtr(OgreJNI.CompositorManager_getByName__SWIG_1(swigCPtr, this, name), true);
  }

  public void parseScript(DataStreamPtr stream, String groupName) {
    OgreJNI.CompositorManager_parseScript(swigCPtr, this, DataStreamPtr.getCPtr(stream), stream, groupName);
  }

  public CompositorChain getCompositorChain(Viewport vp) {
    long cPtr = OgreJNI.CompositorManager_getCompositorChain(swigCPtr, this, Viewport.getCPtr(vp), vp);
    return (cPtr == 0) ? null : new CompositorChain(cPtr, false);
  }

  public boolean hasCompositorChain(Viewport vp) {
    return OgreJNI.CompositorManager_hasCompositorChain(swigCPtr, this, Viewport.getCPtr(vp), vp);
  }

  public void removeCompositorChain(Viewport vp) {
    OgreJNI.CompositorManager_removeCompositorChain(swigCPtr, this, Viewport.getCPtr(vp), vp);
  }

  public CompositorInstance addCompositor(Viewport vp, String compositor, int addPosition) {
    long cPtr = OgreJNI.CompositorManager_addCompositor__SWIG_0(swigCPtr, this, Viewport.getCPtr(vp), vp, compositor, addPosition);
    return (cPtr == 0) ? null : new CompositorInstance(cPtr, false);
  }

  public CompositorInstance addCompositor(Viewport vp, String compositor) {
    long cPtr = OgreJNI.CompositorManager_addCompositor__SWIG_1(swigCPtr, this, Viewport.getCPtr(vp), vp, compositor);
    return (cPtr == 0) ? null : new CompositorInstance(cPtr, false);
  }

  public void removeCompositor(Viewport vp, String compositor) {
    OgreJNI.CompositorManager_removeCompositor(swigCPtr, this, Viewport.getCPtr(vp), vp, compositor);
  }

  public void setCompositorEnabled(Viewport vp, String compositor, boolean value) {
    OgreJNI.CompositorManager_setCompositorEnabled(swigCPtr, this, Viewport.getCPtr(vp), vp, compositor, value);
  }

  public Renderable _getTexturedRectangle2D() {
    long cPtr = OgreJNI.CompositorManager__getTexturedRectangle2D(swigCPtr, this);
    return (cPtr == 0) ? null : new Renderable(cPtr, false);
  }

  public void removeAll() {
    OgreJNI.CompositorManager_removeAll(swigCPtr, this);
  }

  public void _reconstructAllCompositorResources() {
    OgreJNI.CompositorManager__reconstructAllCompositorResources(swigCPtr, this);
  }

  public TexturePtr getPooledTexture(String name, String localName, long w, long h, PixelFormat f, long aa, String aaHint, boolean srgb, SWIGTYPE_p_std__setT_Ogre__Texture_p_t texturesAlreadyAssigned, CompositorInstance inst, CompositionTechnique.TextureScope scope) {
    return new TexturePtr(OgreJNI.CompositorManager_getPooledTexture(swigCPtr, this, name, localName, w, h, f.swigValue(), aa, aaHint, srgb, SWIGTYPE_p_std__setT_Ogre__Texture_p_t.getCPtr(texturesAlreadyAssigned), CompositorInstance.getCPtr(inst), inst, scope.swigValue()), true);
  }

  public void freePooledTextures(boolean onlyIfUnreferenced) {
    OgreJNI.CompositorManager_freePooledTextures__SWIG_0(swigCPtr, this, onlyIfUnreferenced);
  }

  public void freePooledTextures() {
    OgreJNI.CompositorManager_freePooledTextures__SWIG_1(swigCPtr, this);
  }

  public void registerCompositorLogic(String name, SWIGTYPE_p_Ogre__CompositorLogic logic) {
    OgreJNI.CompositorManager_registerCompositorLogic(swigCPtr, this, name, SWIGTYPE_p_Ogre__CompositorLogic.getCPtr(logic));
  }

  public void unregisterCompositorLogic(String name) {
    OgreJNI.CompositorManager_unregisterCompositorLogic(swigCPtr, this, name);
  }

  public SWIGTYPE_p_Ogre__CompositorLogic getCompositorLogic(String name) {
    long cPtr = OgreJNI.CompositorManager_getCompositorLogic(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__CompositorLogic(cPtr, false);
  }

  public boolean hasCompositorLogic(String name) {
    return OgreJNI.CompositorManager_hasCompositorLogic(swigCPtr, this, name);
  }

  public void registerCustomCompositionPass(String name, SWIGTYPE_p_Ogre__CustomCompositionPass customPass) {
    OgreJNI.CompositorManager_registerCustomCompositionPass(swigCPtr, this, name, SWIGTYPE_p_Ogre__CustomCompositionPass.getCPtr(customPass));
  }

  public void unregisterCustomCompositionPass(String name) {
    OgreJNI.CompositorManager_unregisterCustomCompositionPass(swigCPtr, this, name);
  }

  public SWIGTYPE_p_Ogre__CustomCompositionPass getCustomCompositionPass(String name) {
    long cPtr = OgreJNI.CompositorManager_getCustomCompositionPass(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__CustomCompositionPass(cPtr, false);
  }

  public boolean hasCustomCompositionPass(String name) {
    return OgreJNI.CompositorManager_hasCustomCompositionPass(swigCPtr, this, name);
  }

  public void _relocateChain(Viewport sourceVP, Viewport destVP) {
    OgreJNI.CompositorManager__relocateChain(swigCPtr, this, Viewport.getCPtr(sourceVP), sourceVP, Viewport.getCPtr(destVP), destVP);
  }

  public static CompositorManager getSingleton() {
    return new CompositorManager(OgreJNI.CompositorManager_getSingleton(), false);
  }

}
