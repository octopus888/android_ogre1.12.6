/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class GpuNamedConstantsSerializer extends Serializer {
  private transient long swigCPtr;

  protected GpuNamedConstantsSerializer(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.GpuNamedConstantsSerializer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GpuNamedConstantsSerializer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_GpuNamedConstantsSerializer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GpuNamedConstantsSerializer() {
    this(OgreJNI.new_GpuNamedConstantsSerializer(), true);
  }

  public void exportNamedConstants(GpuNamedConstants pConsts, String filename, Serializer.Endian endianMode) {
    OgreJNI.GpuNamedConstantsSerializer_exportNamedConstants__SWIG_0(swigCPtr, this, GpuNamedConstants.getCPtr(pConsts), pConsts, filename, endianMode.swigValue());
  }

  public void exportNamedConstants(GpuNamedConstants pConsts, String filename) {
    OgreJNI.GpuNamedConstantsSerializer_exportNamedConstants__SWIG_1(swigCPtr, this, GpuNamedConstants.getCPtr(pConsts), pConsts, filename);
  }

  public void exportNamedConstants(GpuNamedConstants pConsts, DataStreamPtr stream, Serializer.Endian endianMode) {
    OgreJNI.GpuNamedConstantsSerializer_exportNamedConstants__SWIG_2(swigCPtr, this, GpuNamedConstants.getCPtr(pConsts), pConsts, DataStreamPtr.getCPtr(stream), stream, endianMode.swigValue());
  }

  public void exportNamedConstants(GpuNamedConstants pConsts, DataStreamPtr stream) {
    OgreJNI.GpuNamedConstantsSerializer_exportNamedConstants__SWIG_3(swigCPtr, this, GpuNamedConstants.getCPtr(pConsts), pConsts, DataStreamPtr.getCPtr(stream), stream);
  }

  public void importNamedConstants(DataStreamPtr stream, GpuNamedConstants pDest) {
    OgreJNI.GpuNamedConstantsSerializer_importNamedConstants(swigCPtr, this, DataStreamPtr.getCPtr(stream), stream, GpuNamedConstants.getCPtr(pDest), pDest);
  }

}
