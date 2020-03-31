/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum TrayLocation {
  TL_TOPLEFT,
  TL_TOP,
  TL_TOPRIGHT,
  TL_LEFT,
  TL_CENTER,
  TL_RIGHT,
  TL_BOTTOMLEFT,
  TL_BOTTOM,
  TL_BOTTOMRIGHT,
  TL_NONE;

  public final int swigValue() {
    return swigValue;
  }

  public static TrayLocation swigToEnum(int swigValue) {
    TrayLocation[] swigValues = TrayLocation.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TrayLocation swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TrayLocation.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TrayLocation() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TrayLocation(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TrayLocation(TrayLocation swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

