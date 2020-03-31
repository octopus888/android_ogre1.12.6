/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum GPUVendor {
  GPU_UNKNOWN(OgreJNI.GPU_UNKNOWN_get()),
  GPU_NVIDIA,
  GPU_AMD,
  GPU_INTEL,
  GPU_IMAGINATION_TECHNOLOGIES,
  GPU_APPLE,
  GPU_NOKIA,
  GPU_MS_SOFTWARE,
  GPU_MS_WARP,
  GPU_ARM,
  GPU_QUALCOMM,
  GPU_MOZILLA,
  GPU_WEBKIT,
  GPU_VENDOR_COUNT;

  public final int swigValue() {
    return swigValue;
  }

  public static GPUVendor swigToEnum(int swigValue) {
    GPUVendor[] swigValues = GPUVendor.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GPUVendor swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GPUVendor.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GPUVendor() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GPUVendor(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GPUVendor(GPUVendor swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

