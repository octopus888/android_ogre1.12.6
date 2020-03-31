/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class FileHandleDataStreamPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FileHandleDataStreamPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FileHandleDataStreamPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_FileHandleDataStreamPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FileHandleDataStreamPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreJNI.new_FileHandleDataStreamPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public FileHandleDataStreamPtr() {
    this(OgreJNI.new_FileHandleDataStreamPtr__SWIG_1(), true);
  }

  public FileHandleDataStreamPtr(FileHandleDataStreamPtr r) {
    this(OgreJNI.new_FileHandleDataStreamPtr__SWIG_2(FileHandleDataStreamPtr.getCPtr(r), r), true);
  }

  public FileHandleDataStream __deref__() {
    long cPtr = OgreJNI.FileHandleDataStreamPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new FileHandleDataStream(cPtr, false);
  }

  public long read(SWIGTYPE_p_void buf, long count) {
    return OgreJNI.FileHandleDataStreamPtr_read(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buf), count);
  }

  public long write(SWIGTYPE_p_void buf, long count) {
    return OgreJNI.FileHandleDataStreamPtr_write(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buf), count);
  }

  public void skip(int count) {
    OgreJNI.FileHandleDataStreamPtr_skip(swigCPtr, this, count);
  }

  public void seek(long pos) {
    OgreJNI.FileHandleDataStreamPtr_seek(swigCPtr, this, pos);
  }

  public long tell() {
    return OgreJNI.FileHandleDataStreamPtr_tell(swigCPtr, this);
  }

  public boolean eof() {
    return OgreJNI.FileHandleDataStreamPtr_eof(swigCPtr, this);
  }

  public void close() {
    OgreJNI.FileHandleDataStreamPtr_close(swigCPtr, this);
  }

  public String getName() {
    return OgreJNI.FileHandleDataStreamPtr_getName(swigCPtr, this);
  }

  public int getAccessMode() {
    return OgreJNI.FileHandleDataStreamPtr_getAccessMode(swigCPtr, this);
  }

  public boolean isReadable() {
    return OgreJNI.FileHandleDataStreamPtr_isReadable(swigCPtr, this);
  }

  public boolean isWriteable() {
    return OgreJNI.FileHandleDataStreamPtr_isWriteable(swigCPtr, this);
  }

  public long readLine(String buf, long maxCount, String delim) {
    return OgreJNI.FileHandleDataStreamPtr_readLine__SWIG_0(swigCPtr, this, buf, maxCount, delim);
  }

  public long readLine(String buf, long maxCount) {
    return OgreJNI.FileHandleDataStreamPtr_readLine__SWIG_1(swigCPtr, this, buf, maxCount);
  }

  public String getLine(boolean trimAfter) {
    return OgreJNI.FileHandleDataStreamPtr_getLine__SWIG_0(swigCPtr, this, trimAfter);
  }

  public String getLine() {
    return OgreJNI.FileHandleDataStreamPtr_getLine__SWIG_1(swigCPtr, this);
  }

  public String getAsString() {
    return OgreJNI.FileHandleDataStreamPtr_getAsString(swigCPtr, this);
  }

  public long skipLine(String delim) {
    return OgreJNI.FileHandleDataStreamPtr_skipLine__SWIG_0(swigCPtr, this, delim);
  }

  public long skipLine() {
    return OgreJNI.FileHandleDataStreamPtr_skipLine__SWIG_1(swigCPtr, this);
  }

  public long size() {
    return OgreJNI.FileHandleDataStreamPtr_size(swigCPtr, this);
  }

}
