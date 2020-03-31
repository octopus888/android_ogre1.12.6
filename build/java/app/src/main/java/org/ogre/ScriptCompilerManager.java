/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ScriptCompilerManager extends ScriptLoader {
  private transient long swigCPtr;

  protected ScriptCompilerManager(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.ScriptCompilerManager_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ScriptCompilerManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ScriptCompilerManager(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ScriptCompilerManager() {
    this(OgreJNI.new_ScriptCompilerManager(), true);
  }

  public void setListener(ScriptCompilerListener listener) {
    OgreJNI.ScriptCompilerManager_setListener(swigCPtr, this, ScriptCompilerListener.getCPtr(listener), listener);
  }

  public ScriptCompilerListener getListener() {
    long cPtr = OgreJNI.ScriptCompilerManager_getListener(swigCPtr, this);
    return (cPtr == 0) ? null : new ScriptCompilerListener(cPtr, false);
  }

  public void addTranslatorManager(SWIGTYPE_p_Ogre__ScriptTranslatorManager man) {
    OgreJNI.ScriptCompilerManager_addTranslatorManager(swigCPtr, this, SWIGTYPE_p_Ogre__ScriptTranslatorManager.getCPtr(man));
  }

  public void removeTranslatorManager(SWIGTYPE_p_Ogre__ScriptTranslatorManager man) {
    OgreJNI.ScriptCompilerManager_removeTranslatorManager(swigCPtr, this, SWIGTYPE_p_Ogre__ScriptTranslatorManager.getCPtr(man));
  }

  public void clearTranslatorManagers() {
    OgreJNI.ScriptCompilerManager_clearTranslatorManagers(swigCPtr, this);
  }

  public SWIGTYPE_p_Ogre__ScriptTranslator getTranslator(SWIGTYPE_p_Ogre__SharedPtrT_Ogre__AbstractNode_t node) {
    long cPtr = OgreJNI.ScriptCompilerManager_getTranslator(swigCPtr, this, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__AbstractNode_t.getCPtr(node));
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__ScriptTranslator(cPtr, false);
  }

  public long registerCustomWordId(String word) {
    return OgreJNI.ScriptCompilerManager_registerCustomWordId(swigCPtr, this, word);
  }

  public void addScriptPattern(String pattern) {
    OgreJNI.ScriptCompilerManager_addScriptPattern(swigCPtr, this, pattern);
  }

  public StringVector getScriptPatterns() {
    return new StringVector(OgreJNI.ScriptCompilerManager_getScriptPatterns(swigCPtr, this), false);
  }

  public void parseScript(DataStreamPtr stream, String groupName) {
    OgreJNI.ScriptCompilerManager_parseScript(swigCPtr, this, DataStreamPtr.getCPtr(stream), stream, groupName);
  }

  public float getLoadingOrder() {
    return OgreJNI.ScriptCompilerManager_getLoadingOrder(swigCPtr, this);
  }

  public static ScriptCompilerManager getSingleton() {
    return new ScriptCompilerManager(OgreJNI.ScriptCompilerManager_getSingleton(), false);
  }

}
