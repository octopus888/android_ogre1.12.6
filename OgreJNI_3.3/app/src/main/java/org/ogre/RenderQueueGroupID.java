/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum RenderQueueGroupID {
  RENDER_QUEUE_BACKGROUND(OgreJNI.RENDER_QUEUE_BACKGROUND_get()),
  RENDER_QUEUE_SKIES_EARLY(OgreJNI.RENDER_QUEUE_SKIES_EARLY_get()),
  RENDER_QUEUE_1(OgreJNI.RENDER_QUEUE_1_get()),
  RENDER_QUEUE_2(OgreJNI.RENDER_QUEUE_2_get()),
  RENDER_QUEUE_WORLD_GEOMETRY_1(OgreJNI.RENDER_QUEUE_WORLD_GEOMETRY_1_get()),
  RENDER_QUEUE_3(OgreJNI.RENDER_QUEUE_3_get()),
  RENDER_QUEUE_4(OgreJNI.RENDER_QUEUE_4_get()),
  RENDER_QUEUE_MAIN(OgreJNI.RENDER_QUEUE_MAIN_get()),
  RENDER_QUEUE_6(OgreJNI.RENDER_QUEUE_6_get()),
  RENDER_QUEUE_7(OgreJNI.RENDER_QUEUE_7_get()),
  RENDER_QUEUE_WORLD_GEOMETRY_2(OgreJNI.RENDER_QUEUE_WORLD_GEOMETRY_2_get()),
  RENDER_QUEUE_8(OgreJNI.RENDER_QUEUE_8_get()),
  RENDER_QUEUE_9(OgreJNI.RENDER_QUEUE_9_get()),
  RENDER_QUEUE_SKIES_LATE(OgreJNI.RENDER_QUEUE_SKIES_LATE_get()),
  RENDER_QUEUE_OVERLAY(OgreJNI.RENDER_QUEUE_OVERLAY_get()),
  RENDER_QUEUE_MAX(OgreJNI.RENDER_QUEUE_MAX_get());

  public final int swigValue() {
    return swigValue;
  }

  public static RenderQueueGroupID swigToEnum(int swigValue) {
    RenderQueueGroupID[] swigValues = RenderQueueGroupID.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (RenderQueueGroupID swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + RenderQueueGroupID.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private RenderQueueGroupID() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private RenderQueueGroupID(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private RenderQueueGroupID(RenderQueueGroupID swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

