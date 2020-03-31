/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class HighLevelGpuProgramManager extends ResourceManager {
  private transient long swigCPtr;

  protected HighLevelGpuProgramManager(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.HighLevelGpuProgramManager_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HighLevelGpuProgramManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_HighLevelGpuProgramManager(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HighLevelGpuProgramManager() {
    this(OgreJNI.new_HighLevelGpuProgramManager(), true);
  }

  public void addFactory(HighLevelGpuProgramFactory factory) {
    OgreJNI.HighLevelGpuProgramManager_addFactory(swigCPtr, this, HighLevelGpuProgramFactory.getCPtr(factory), factory);
  }

  public void removeFactory(HighLevelGpuProgramFactory factory) {
    OgreJNI.HighLevelGpuProgramManager_removeFactory(swigCPtr, this, HighLevelGpuProgramFactory.getCPtr(factory), factory);
  }

  public boolean isLanguageSupported(String lang) {
    return OgreJNI.HighLevelGpuProgramManager_isLanguageSupported(swigCPtr, this, lang);
  }

  public HighLevelGpuProgramPtr getByName(String name, String groupName) {
    return new HighLevelGpuProgramPtr(OgreJNI.HighLevelGpuProgramManager_getByName__SWIG_0(swigCPtr, this, name, groupName), true);
  }

  public HighLevelGpuProgramPtr getByName(String name) {
    return new HighLevelGpuProgramPtr(OgreJNI.HighLevelGpuProgramManager_getByName__SWIG_1(swigCPtr, this, name), true);
  }

  public HighLevelGpuProgramPtr createProgram(String name, String groupName, String language, GpuProgramType gptype) {
    return new HighLevelGpuProgramPtr(OgreJNI.HighLevelGpuProgramManager_createProgram(swigCPtr, this, name, groupName, language, gptype.swigValue()), true);
  }

  public static HighLevelGpuProgramManager getSingleton() {
    return new HighLevelGpuProgramManager(OgreJNI.HighLevelGpuProgramManager_getSingleton(), false);
  }

}
