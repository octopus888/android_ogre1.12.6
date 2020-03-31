/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum ShadeOptions {
  SO_FLAT,
  SO_GOURAUD,
  SO_PHONG;

  public final int swigValue() {
    return swigValue;
  }

  public static ShadeOptions swigToEnum(int swigValue) {
    ShadeOptions[] swigValues = ShadeOptions.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ShadeOptions swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ShadeOptions.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ShadeOptions() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ShadeOptions(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ShadeOptions(ShadeOptions swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

