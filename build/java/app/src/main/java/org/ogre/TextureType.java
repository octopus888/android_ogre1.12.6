/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum TextureType {
  TEX_TYPE_1D(OgreJNI.TEX_TYPE_1D_get()),
  TEX_TYPE_2D(OgreJNI.TEX_TYPE_2D_get()),
  TEX_TYPE_3D(OgreJNI.TEX_TYPE_3D_get()),
  TEX_TYPE_CUBE_MAP(OgreJNI.TEX_TYPE_CUBE_MAP_get()),
  TEX_TYPE_2D_ARRAY(OgreJNI.TEX_TYPE_2D_ARRAY_get()),
  TEX_TYPE_2D_RECT(OgreJNI.TEX_TYPE_2D_RECT_get()),
  TEX_TYPE_EXTERNAL_OES(OgreJNI.TEX_TYPE_EXTERNAL_OES_get());

  public final int swigValue() {
    return swigValue;
  }

  public static TextureType swigToEnum(int swigValue) {
    TextureType[] swigValues = TextureType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (TextureType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + TextureType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private TextureType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private TextureType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private TextureType(TextureType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
