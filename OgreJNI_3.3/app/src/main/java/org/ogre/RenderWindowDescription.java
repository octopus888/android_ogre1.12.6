/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class RenderWindowDescription {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RenderWindowDescription(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RenderWindowDescription obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_RenderWindowDescription(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    OgreJNI.RenderWindowDescription_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return OgreJNI.RenderWindowDescription_name_get(swigCPtr, this);
  }

  public void setWidth(long value) {
    OgreJNI.RenderWindowDescription_width_set(swigCPtr, this, value);
  }

  public long getWidth() {
    return OgreJNI.RenderWindowDescription_width_get(swigCPtr, this);
  }

  public void setHeight(long value) {
    OgreJNI.RenderWindowDescription_height_set(swigCPtr, this, value);
  }

  public long getHeight() {
    return OgreJNI.RenderWindowDescription_height_get(swigCPtr, this);
  }

  public void setUseFullScreen(boolean value) {
    OgreJNI.RenderWindowDescription_useFullScreen_set(swigCPtr, this, value);
  }

  public boolean getUseFullScreen() {
    return OgreJNI.RenderWindowDescription_useFullScreen_get(swigCPtr, this);
  }

  public void setMiscParams(NameValuePairList value) {
    OgreJNI.RenderWindowDescription_miscParams_set(swigCPtr, this, NameValuePairList.getCPtr(value), value);
  }

  public NameValuePairList getMiscParams() {
    long cPtr = OgreJNI.RenderWindowDescription_miscParams_get(swigCPtr, this);
    return (cPtr == 0) ? null : new NameValuePairList(cPtr, false);
  }

  public RenderWindowDescription() {
    this(OgreJNI.new_RenderWindowDescription(), true);
  }

}
