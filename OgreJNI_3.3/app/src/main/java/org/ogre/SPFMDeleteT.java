/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class SPFMDeleteT {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SPFMDeleteT(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SPFMDeleteT obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_SPFMDeleteT(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SPFMDeleteT() {
    this(OgreJNI.new_SPFMDeleteT(), true);
  }

}
