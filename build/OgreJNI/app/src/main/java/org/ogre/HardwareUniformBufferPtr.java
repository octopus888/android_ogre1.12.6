/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class HardwareUniformBufferPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HardwareUniformBufferPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HardwareUniformBufferPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_HardwareUniformBufferPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HardwareUniformBufferPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreJNI.new_HardwareUniformBufferPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public HardwareUniformBufferPtr() {
    this(OgreJNI.new_HardwareUniformBufferPtr__SWIG_1(), true);
  }

  public HardwareUniformBufferPtr(HardwareUniformBufferPtr r) {
    this(OgreJNI.new_HardwareUniformBufferPtr__SWIG_2(HardwareUniformBufferPtr.getCPtr(r), r), true);
  }

  public HardwareUniformBuffer __deref__() {
    long cPtr = OgreJNI.HardwareUniformBufferPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new HardwareUniformBuffer(cPtr, false);
  }

  public HardwareBufferManagerBase getManager() {
    long cPtr = OgreJNI.HardwareUniformBufferPtr_getManager(swigCPtr, this);
    return (cPtr == 0) ? null : new HardwareBufferManagerBase(cPtr, false);
  }

  public String getName() {
    return OgreJNI.HardwareUniformBufferPtr_getName(swigCPtr, this);
  }

  public SWIGTYPE_p_void lock(long offset, long length, HardwareBuffer.LockOptions options) {
    long cPtr = OgreJNI.HardwareUniformBufferPtr_lock__SWIG_0(swigCPtr, this, offset, length, options.swigValue());
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SWIGTYPE_p_void lock(HardwareBuffer.LockOptions options) {
    long cPtr = OgreJNI.HardwareUniformBufferPtr_lock__SWIG_1(swigCPtr, this, options.swigValue());
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void unlock() {
    OgreJNI.HardwareUniformBufferPtr_unlock(swigCPtr, this);
  }

  public void readData(long offset, long length, SWIGTYPE_p_void pDest) {
    OgreJNI.HardwareUniformBufferPtr_readData(swigCPtr, this, offset, length, SWIGTYPE_p_void.getCPtr(pDest));
  }

  public void writeData(long offset, long length, SWIGTYPE_p_void pSource, boolean discardWholeBuffer) {
    OgreJNI.HardwareUniformBufferPtr_writeData__SWIG_0(swigCPtr, this, offset, length, SWIGTYPE_p_void.getCPtr(pSource), discardWholeBuffer);
  }

  public void writeData(long offset, long length, SWIGTYPE_p_void pSource) {
    OgreJNI.HardwareUniformBufferPtr_writeData__SWIG_1(swigCPtr, this, offset, length, SWIGTYPE_p_void.getCPtr(pSource));
  }

  public void copyData(HardwareBuffer srcBuffer, long srcOffset, long dstOffset, long length, boolean discardWholeBuffer) {
    OgreJNI.HardwareUniformBufferPtr_copyData__SWIG_0(swigCPtr, this, HardwareBuffer.getCPtr(srcBuffer), srcBuffer, srcOffset, dstOffset, length, discardWholeBuffer);
  }

  public void copyData(HardwareBuffer srcBuffer, long srcOffset, long dstOffset, long length) {
    OgreJNI.HardwareUniformBufferPtr_copyData__SWIG_1(swigCPtr, this, HardwareBuffer.getCPtr(srcBuffer), srcBuffer, srcOffset, dstOffset, length);
  }

  public void copyData(HardwareBuffer srcBuffer) {
    OgreJNI.HardwareUniformBufferPtr_copyData__SWIG_2(swigCPtr, this, HardwareBuffer.getCPtr(srcBuffer), srcBuffer);
  }

  public void _updateFromShadow() {
    OgreJNI.HardwareUniformBufferPtr__updateFromShadow(swigCPtr, this);
  }

  public long getSizeInBytes() {
    return OgreJNI.HardwareUniformBufferPtr_getSizeInBytes(swigCPtr, this);
  }

  public HardwareBuffer.Usage getUsage() {
    return HardwareBuffer.Usage.swigToEnum(OgreJNI.HardwareUniformBufferPtr_getUsage(swigCPtr, this));
  }

  public boolean isSystemMemory() {
    return OgreJNI.HardwareUniformBufferPtr_isSystemMemory(swigCPtr, this);
  }

  public boolean hasShadowBuffer() {
    return OgreJNI.HardwareUniformBufferPtr_hasShadowBuffer(swigCPtr, this);
  }

  public boolean isLocked() {
    return OgreJNI.HardwareUniformBufferPtr_isLocked(swigCPtr, this);
  }

  public void suppressHardwareUpdate(boolean suppress) {
    OgreJNI.HardwareUniformBufferPtr_suppressHardwareUpdate(swigCPtr, this, suppress);
  }

}
