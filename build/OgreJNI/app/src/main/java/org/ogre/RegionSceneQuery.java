/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class RegionSceneQuery extends SceneQuery {
  private transient long swigCPtr;

  protected RegionSceneQuery(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.RegionSceneQuery_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RegionSceneQuery obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_RegionSceneQuery(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SceneQueryResult execute() {
    return new SceneQueryResult(OgreJNI.RegionSceneQuery_execute__SWIG_0(swigCPtr, this), false);
  }

  public void execute(SceneQueryListener listener) {
    OgreJNI.RegionSceneQuery_execute__SWIG_1(swigCPtr, this, SceneQueryListener.getCPtr(listener), listener);
  }

  public SceneQueryResult getLastResults() {
    return new SceneQueryResult(OgreJNI.RegionSceneQuery_getLastResults(swigCPtr, this), false);
  }

  public void clearResults() {
    OgreJNI.RegionSceneQuery_clearResults(swigCPtr, this);
  }

  public boolean queryResult(MovableObject first) {
    return OgreJNI.RegionSceneQuery_queryResult__SWIG_0(swigCPtr, this, MovableObject.getCPtr(first), first);
  }

  public boolean queryResult(SceneQuery.WorldFragment fragment) {
    return OgreJNI.RegionSceneQuery_queryResult__SWIG_1(swigCPtr, this, SceneQuery.WorldFragment.getCPtr(fragment), fragment);
  }

}
