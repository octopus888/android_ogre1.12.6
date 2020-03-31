/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum ProjectionType {
  PT_ORTHOGRAPHIC,
  PT_PERSPECTIVE;

  public final int swigValue() {
    return swigValue;
  }

  public static ProjectionType swigToEnum(int swigValue) {
    ProjectionType[] swigValues = ProjectionType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ProjectionType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ProjectionType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ProjectionType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ProjectionType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ProjectionType(ProjectionType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

