/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class RenderOperation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RenderOperation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RenderOperation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_RenderOperation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVertexData(VertexData value) {
    OgreJNI.RenderOperation_vertexData_set(swigCPtr, this, VertexData.getCPtr(value), value);
  }

  public VertexData getVertexData() {
    long cPtr = OgreJNI.RenderOperation_vertexData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VertexData(cPtr, false);
  }

  public void setOperationType(RenderOperation.OperationType value) {
    OgreJNI.RenderOperation_operationType_set(swigCPtr, this, value.swigValue());
  }

  public RenderOperation.OperationType getOperationType() {
    return RenderOperation.OperationType.swigToEnum(OgreJNI.RenderOperation_operationType_get(swigCPtr, this));
  }

  public void setUseIndexes(boolean value) {
    OgreJNI.RenderOperation_useIndexes_set(swigCPtr, this, value);
  }

  public boolean getUseIndexes() {
    return OgreJNI.RenderOperation_useIndexes_get(swigCPtr, this);
  }

  public void setIndexData(IndexData value) {
    OgreJNI.RenderOperation_indexData_set(swigCPtr, this, IndexData.getCPtr(value), value);
  }

  public IndexData getIndexData() {
    long cPtr = OgreJNI.RenderOperation_indexData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IndexData(cPtr, false);
  }

  public void setSrcRenderable(Renderable value) {
    OgreJNI.RenderOperation_srcRenderable_set(swigCPtr, this, Renderable.getCPtr(value), value);
  }

  public Renderable getSrcRenderable() {
    long cPtr = OgreJNI.RenderOperation_srcRenderable_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Renderable(cPtr, false);
  }

  public void setNumberOfInstances(long value) {
    OgreJNI.RenderOperation_numberOfInstances_set(swigCPtr, this, value);
  }

  public long getNumberOfInstances() {
    return OgreJNI.RenderOperation_numberOfInstances_get(swigCPtr, this);
  }

  public void setUseGlobalInstancingVertexBufferIsAvailable(boolean value) {
    OgreJNI.RenderOperation_useGlobalInstancingVertexBufferIsAvailable_set(swigCPtr, this, value);
  }

  public boolean getUseGlobalInstancingVertexBufferIsAvailable() {
    return OgreJNI.RenderOperation_useGlobalInstancingVertexBufferIsAvailable_get(swigCPtr, this);
  }

  public RenderOperation() {
    this(OgreJNI.new_RenderOperation(), true);
  }

  public enum OperationType {
    OT_POINT_LIST(OgreJNI.RenderOperation_OT_POINT_LIST_get()),
    OT_LINE_LIST(OgreJNI.RenderOperation_OT_LINE_LIST_get()),
    OT_LINE_STRIP(OgreJNI.RenderOperation_OT_LINE_STRIP_get()),
    OT_TRIANGLE_LIST(OgreJNI.RenderOperation_OT_TRIANGLE_LIST_get()),
    OT_TRIANGLE_STRIP(OgreJNI.RenderOperation_OT_TRIANGLE_STRIP_get()),
    OT_TRIANGLE_FAN(OgreJNI.RenderOperation_OT_TRIANGLE_FAN_get()),
    OT_PATCH_1_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_1_CONTROL_POINT_get()),
    OT_PATCH_2_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_2_CONTROL_POINT_get()),
    OT_PATCH_3_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_3_CONTROL_POINT_get()),
    OT_PATCH_4_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_4_CONTROL_POINT_get()),
    OT_PATCH_5_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_5_CONTROL_POINT_get()),
    OT_PATCH_6_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_6_CONTROL_POINT_get()),
    OT_PATCH_7_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_7_CONTROL_POINT_get()),
    OT_PATCH_8_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_8_CONTROL_POINT_get()),
    OT_PATCH_9_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_9_CONTROL_POINT_get()),
    OT_PATCH_10_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_10_CONTROL_POINT_get()),
    OT_PATCH_11_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_11_CONTROL_POINT_get()),
    OT_PATCH_12_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_12_CONTROL_POINT_get()),
    OT_PATCH_13_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_13_CONTROL_POINT_get()),
    OT_PATCH_14_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_14_CONTROL_POINT_get()),
    OT_PATCH_15_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_15_CONTROL_POINT_get()),
    OT_PATCH_16_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_16_CONTROL_POINT_get()),
    OT_PATCH_17_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_17_CONTROL_POINT_get()),
    OT_PATCH_18_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_18_CONTROL_POINT_get()),
    OT_PATCH_19_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_19_CONTROL_POINT_get()),
    OT_PATCH_20_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_20_CONTROL_POINT_get()),
    OT_PATCH_21_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_21_CONTROL_POINT_get()),
    OT_PATCH_22_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_22_CONTROL_POINT_get()),
    OT_PATCH_23_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_23_CONTROL_POINT_get()),
    OT_PATCH_24_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_24_CONTROL_POINT_get()),
    OT_PATCH_25_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_25_CONTROL_POINT_get()),
    OT_PATCH_26_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_26_CONTROL_POINT_get()),
    OT_PATCH_27_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_27_CONTROL_POINT_get()),
    OT_PATCH_28_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_28_CONTROL_POINT_get()),
    OT_PATCH_29_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_29_CONTROL_POINT_get()),
    OT_PATCH_30_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_30_CONTROL_POINT_get()),
    OT_PATCH_31_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_31_CONTROL_POINT_get()),
    OT_PATCH_32_CONTROL_POINT(OgreJNI.RenderOperation_OT_PATCH_32_CONTROL_POINT_get()),
    OT_DETAIL_ADJACENCY_BIT(OgreJNI.RenderOperation_OT_DETAIL_ADJACENCY_BIT_get()),
    OT_LINE_LIST_ADJ(OgreJNI.RenderOperation_OT_LINE_LIST_ADJ_get()),
    OT_LINE_STRIP_ADJ(OgreJNI.RenderOperation_OT_LINE_STRIP_ADJ_get()),
    OT_TRIANGLE_LIST_ADJ(OgreJNI.RenderOperation_OT_TRIANGLE_LIST_ADJ_get()),
    OT_TRIANGLE_STRIP_ADJ(OgreJNI.RenderOperation_OT_TRIANGLE_STRIP_ADJ_get());

    public final int swigValue() {
      return swigValue;
    }

    public static OperationType swigToEnum(int swigValue) {
      OperationType[] swigValues = OperationType.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (OperationType swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + OperationType.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private OperationType() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private OperationType(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private OperationType(OperationType swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
