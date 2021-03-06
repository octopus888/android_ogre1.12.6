/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum CompareFunction {
  CMPF_ALWAYS_FAIL,
  CMPF_ALWAYS_PASS,
  CMPF_LESS,
  CMPF_LESS_EQUAL,
  CMPF_EQUAL,
  CMPF_NOT_EQUAL,
  CMPF_GREATER_EQUAL,
  CMPF_GREATER;

  public final int swigValue() {
    return swigValue;
  }

  public static CompareFunction swigToEnum(int swigValue) {
    CompareFunction[] swigValues = CompareFunction.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (CompareFunction swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + CompareFunction.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private CompareFunction() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private CompareFunction(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private CompareFunction(CompareFunction swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

