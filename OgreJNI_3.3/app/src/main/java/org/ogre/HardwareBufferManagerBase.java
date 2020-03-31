/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class HardwareBufferManagerBase {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HardwareBufferManagerBase(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HardwareBufferManagerBase obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_HardwareBufferManagerBase(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HardwareVertexBufferPtr createVertexBuffer(long vertexSize, long numVerts, HardwareBuffer.Usage usage, boolean useShadowBuffer) {
    return new HardwareVertexBufferPtr(OgreJNI.HardwareBufferManagerBase_createVertexBuffer__SWIG_0(swigCPtr, this, vertexSize, numVerts, usage.swigValue(), useShadowBuffer), true);
  }

  public HardwareVertexBufferPtr createVertexBuffer(long vertexSize, long numVerts, HardwareBuffer.Usage usage) {
    return new HardwareVertexBufferPtr(OgreJNI.HardwareBufferManagerBase_createVertexBuffer__SWIG_1(swigCPtr, this, vertexSize, numVerts, usage.swigValue()), true);
  }

  public HardwareIndexBufferPtr createIndexBuffer(HardwareIndexBuffer.IndexType itype, long numIndexes, HardwareBuffer.Usage usage, boolean useShadowBuffer) {
    return new HardwareIndexBufferPtr(OgreJNI.HardwareBufferManagerBase_createIndexBuffer__SWIG_0(swigCPtr, this, itype.swigValue(), numIndexes, usage.swigValue(), useShadowBuffer), true);
  }

  public HardwareIndexBufferPtr createIndexBuffer(HardwareIndexBuffer.IndexType itype, long numIndexes, HardwareBuffer.Usage usage) {
    return new HardwareIndexBufferPtr(OgreJNI.HardwareBufferManagerBase_createIndexBuffer__SWIG_1(swigCPtr, this, itype.swigValue(), numIndexes, usage.swigValue()), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_Ogre__RenderToVertexBuffer_t createRenderToVertexBuffer() {
    return new SWIGTYPE_p_Ogre__SharedPtrT_Ogre__RenderToVertexBuffer_t(OgreJNI.HardwareBufferManagerBase_createRenderToVertexBuffer(swigCPtr, this), true);
  }

  public HardwareUniformBufferPtr createUniformBuffer(long sizeBytes, HardwareBuffer.Usage usage, boolean useShadowBuffer, String name) {
    return new HardwareUniformBufferPtr(OgreJNI.HardwareBufferManagerBase_createUniformBuffer__SWIG_0(swigCPtr, this, sizeBytes, usage.swigValue(), useShadowBuffer, name), true);
  }

  public HardwareUniformBufferPtr createUniformBuffer(long sizeBytes, HardwareBuffer.Usage usage, boolean useShadowBuffer) {
    return new HardwareUniformBufferPtr(OgreJNI.HardwareBufferManagerBase_createUniformBuffer__SWIG_1(swigCPtr, this, sizeBytes, usage.swigValue(), useShadowBuffer), true);
  }

  public HardwareUniformBufferPtr createUniformBuffer(long sizeBytes, HardwareBuffer.Usage usage) {
    return new HardwareUniformBufferPtr(OgreJNI.HardwareBufferManagerBase_createUniformBuffer__SWIG_2(swigCPtr, this, sizeBytes, usage.swigValue()), true);
  }

  public HardwareUniformBufferPtr createUniformBuffer(long sizeBytes) {
    return new HardwareUniformBufferPtr(OgreJNI.HardwareBufferManagerBase_createUniformBuffer__SWIG_3(swigCPtr, this, sizeBytes), true);
  }

  public HardwareUniformBufferPtr createCounterBuffer(long sizeBytes, HardwareBuffer.Usage usage, boolean useShadowBuffer, String name) {
    return new HardwareUniformBufferPtr(OgreJNI.HardwareBufferManagerBase_createCounterBuffer__SWIG_0(swigCPtr, this, sizeBytes, usage.swigValue(), useShadowBuffer, name), true);
  }

  public HardwareUniformBufferPtr createCounterBuffer(long sizeBytes, HardwareBuffer.Usage usage, boolean useShadowBuffer) {
    return new HardwareUniformBufferPtr(OgreJNI.HardwareBufferManagerBase_createCounterBuffer__SWIG_1(swigCPtr, this, sizeBytes, usage.swigValue(), useShadowBuffer), true);
  }

  public HardwareUniformBufferPtr createCounterBuffer(long sizeBytes, HardwareBuffer.Usage usage) {
    return new HardwareUniformBufferPtr(OgreJNI.HardwareBufferManagerBase_createCounterBuffer__SWIG_2(swigCPtr, this, sizeBytes, usage.swigValue()), true);
  }

  public HardwareUniformBufferPtr createCounterBuffer(long sizeBytes) {
    return new HardwareUniformBufferPtr(OgreJNI.HardwareBufferManagerBase_createCounterBuffer__SWIG_3(swigCPtr, this, sizeBytes), true);
  }

  public VertexDeclaration createVertexDeclaration() {
    long cPtr = OgreJNI.HardwareBufferManagerBase_createVertexDeclaration(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexDeclaration(cPtr, false);
  }

  public void destroyVertexDeclaration(VertexDeclaration decl) {
    OgreJNI.HardwareBufferManagerBase_destroyVertexDeclaration(swigCPtr, this, VertexDeclaration.getCPtr(decl), decl);
  }

  public VertexBufferBinding createVertexBufferBinding() {
    long cPtr = OgreJNI.HardwareBufferManagerBase_createVertexBufferBinding(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexBufferBinding(cPtr, false);
  }

  public void destroyVertexBufferBinding(VertexBufferBinding binding) {
    OgreJNI.HardwareBufferManagerBase_destroyVertexBufferBinding(swigCPtr, this, VertexBufferBinding.getCPtr(binding), binding);
  }

  public void registerVertexBufferSourceAndCopy(HardwareVertexBufferPtr sourceBuffer, HardwareVertexBufferPtr copy) {
    OgreJNI.HardwareBufferManagerBase_registerVertexBufferSourceAndCopy(swigCPtr, this, HardwareVertexBufferPtr.getCPtr(sourceBuffer), sourceBuffer, HardwareVertexBufferPtr.getCPtr(copy), copy);
  }

  public HardwareVertexBufferPtr allocateVertexBufferCopy(HardwareVertexBufferPtr sourceBuffer, HardwareBufferManagerBase.BufferLicenseType licenseType, HardwareBufferLicensee licensee, boolean copyData) {
    return new HardwareVertexBufferPtr(OgreJNI.HardwareBufferManagerBase_allocateVertexBufferCopy__SWIG_0(swigCPtr, this, HardwareVertexBufferPtr.getCPtr(sourceBuffer), sourceBuffer, licenseType.swigValue(), HardwareBufferLicensee.getCPtr(licensee), licensee, copyData), true);
  }

  public HardwareVertexBufferPtr allocateVertexBufferCopy(HardwareVertexBufferPtr sourceBuffer, HardwareBufferManagerBase.BufferLicenseType licenseType, HardwareBufferLicensee licensee) {
    return new HardwareVertexBufferPtr(OgreJNI.HardwareBufferManagerBase_allocateVertexBufferCopy__SWIG_1(swigCPtr, this, HardwareVertexBufferPtr.getCPtr(sourceBuffer), sourceBuffer, licenseType.swigValue(), HardwareBufferLicensee.getCPtr(licensee), licensee), true);
  }

  public void releaseVertexBufferCopy(HardwareVertexBufferPtr bufferCopy) {
    OgreJNI.HardwareBufferManagerBase_releaseVertexBufferCopy(swigCPtr, this, HardwareVertexBufferPtr.getCPtr(bufferCopy), bufferCopy);
  }

  public void touchVertexBufferCopy(HardwareVertexBufferPtr bufferCopy) {
    OgreJNI.HardwareBufferManagerBase_touchVertexBufferCopy(swigCPtr, this, HardwareVertexBufferPtr.getCPtr(bufferCopy), bufferCopy);
  }

  public void _freeUnusedBufferCopies() {
    OgreJNI.HardwareBufferManagerBase__freeUnusedBufferCopies(swigCPtr, this);
  }

  public void _releaseBufferCopies(boolean forceFreeUnused) {
    OgreJNI.HardwareBufferManagerBase__releaseBufferCopies__SWIG_0(swigCPtr, this, forceFreeUnused);
  }

  public void _releaseBufferCopies() {
    OgreJNI.HardwareBufferManagerBase__releaseBufferCopies__SWIG_1(swigCPtr, this);
  }

  public void _forceReleaseBufferCopies(HardwareVertexBufferPtr sourceBuffer) {
    OgreJNI.HardwareBufferManagerBase__forceReleaseBufferCopies(swigCPtr, this, HardwareVertexBufferPtr.getCPtr(sourceBuffer), sourceBuffer);
  }

  public void _notifyVertexBufferDestroyed(HardwareVertexBuffer buf) {
    OgreJNI.HardwareBufferManagerBase__notifyVertexBufferDestroyed(swigCPtr, this, HardwareVertexBuffer.getCPtr(buf), buf);
  }

  public void _notifyIndexBufferDestroyed(HardwareIndexBuffer buf) {
    OgreJNI.HardwareBufferManagerBase__notifyIndexBufferDestroyed(swigCPtr, this, HardwareIndexBuffer.getCPtr(buf), buf);
  }

  public void _notifyUniformBufferDestroyed(HardwareUniformBuffer buf) {
    OgreJNI.HardwareBufferManagerBase__notifyUniformBufferDestroyed(swigCPtr, this, HardwareUniformBuffer.getCPtr(buf), buf);
  }

  public void _notifyCounterBufferDestroyed(HardwareUniformBuffer buf) {
    OgreJNI.HardwareBufferManagerBase__notifyCounterBufferDestroyed(swigCPtr, this, HardwareUniformBuffer.getCPtr(buf), buf);
  }

  public enum BufferLicenseType {
    BLT_MANUAL_RELEASE,
    BLT_AUTOMATIC_RELEASE;

    public final int swigValue() {
      return swigValue;
    }

    public static BufferLicenseType swigToEnum(int swigValue) {
      BufferLicenseType[] swigValues = BufferLicenseType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (BufferLicenseType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + BufferLicenseType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private BufferLicenseType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private BufferLicenseType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private BufferLicenseType(BufferLicenseType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
