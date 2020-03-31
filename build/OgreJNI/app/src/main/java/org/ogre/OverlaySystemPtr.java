/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class OverlaySystemPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OverlaySystemPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OverlaySystemPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreOverlayJNI.delete_OverlaySystemPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OverlaySystemPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreOverlayJNI.new_OverlaySystemPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public OverlaySystemPtr() {
    this(OgreOverlayJNI.new_OverlaySystemPtr__SWIG_1(), true);
  }

  public OverlaySystemPtr(OverlaySystemPtr r) {
    this(OgreOverlayJNI.new_OverlaySystemPtr__SWIG_2(OverlaySystemPtr.getCPtr(r), r), true);
  }

  public OverlaySystem __deref__() {
    long cPtr = OgreOverlayJNI.OverlaySystemPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new OverlaySystem(cPtr, false);
  }

  public void renderQueueStarted(short queueGroupId, String invocation, SWIGTYPE_p_bool skipThisInvocation) {
    OgreOverlayJNI.OverlaySystemPtr_renderQueueStarted(swigCPtr, this, queueGroupId, invocation, SWIGTYPE_p_bool.getCPtr(skipThisInvocation));
  }

  public void eventOccurred(String eventName, NameValuePairList parameters) {
    OgreOverlayJNI.OverlaySystemPtr_eventOccurred(swigCPtr, this, eventName, NameValuePairList.getCPtr(parameters), parameters);
  }

  public void preRenderQueues() {
    OgreOverlayJNI.OverlaySystemPtr_preRenderQueues(swigCPtr, this);
  }

  public void postRenderQueues() {
    OgreOverlayJNI.OverlaySystemPtr_postRenderQueues(swigCPtr, this);
  }

  public void renderQueueEnded(short queueGroupId, String invocation, SWIGTYPE_p_bool repeatThisInvocation) {
    OgreOverlayJNI.OverlaySystemPtr_renderQueueEnded(swigCPtr, this, queueGroupId, invocation, SWIGTYPE_p_bool.getCPtr(repeatThisInvocation));
  }

}