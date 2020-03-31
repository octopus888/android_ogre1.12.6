/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class RenderTexture extends RenderTarget {
  private transient long swigCPtr;

  protected RenderTexture(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.RenderTexture_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RenderTexture obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_RenderTexture(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void copyContentsToMemory(Box src, PixelBox dst, RenderTarget.FrameBuffer buffer) {
    OgreJNI.RenderTexture_copyContentsToMemory__SWIG_0_0(swigCPtr, this, Box.getCPtr(src), src, PixelBox.getCPtr(dst), dst, buffer.swigValue());
  }

  public void copyContentsToMemory(Box src, PixelBox dst) {
    OgreJNI.RenderTexture_copyContentsToMemory__SWIG_0_1(swigCPtr, this, Box.getCPtr(src), src, PixelBox.getCPtr(dst), dst);
  }

  public PixelFormat suggestPixelFormat() {
    return PixelFormat.swigToEnum(OgreJNI.RenderTexture_suggestPixelFormat(swigCPtr, this));
  }

}