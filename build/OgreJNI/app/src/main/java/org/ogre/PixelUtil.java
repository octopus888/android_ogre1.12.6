/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class PixelUtil {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PixelUtil(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PixelUtil obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_PixelUtil(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static long getNumElemBytes(PixelFormat format) {
    return OgreJNI.PixelUtil_getNumElemBytes(format.swigValue());
  }

  public static long getNumElemBits(PixelFormat format) {
    return OgreJNI.PixelUtil_getNumElemBits(format.swigValue());
  }

  public static long getMemorySize(long width, long height, long depth, PixelFormat format) {
    return OgreJNI.PixelUtil_getMemorySize(width, height, depth, format.swigValue());
  }

  public static long getFlags(PixelFormat format) {
    return OgreJNI.PixelUtil_getFlags(format.swigValue());
  }

  public static boolean hasAlpha(PixelFormat format) {
    return OgreJNI.PixelUtil_hasAlpha(format.swigValue());
  }

  public static boolean isFloatingPoint(PixelFormat format) {
    return OgreJNI.PixelUtil_isFloatingPoint(format.swigValue());
  }

  public static boolean isInteger(PixelFormat format) {
    return OgreJNI.PixelUtil_isInteger(format.swigValue());
  }

  public static boolean isCompressed(PixelFormat format) {
    return OgreJNI.PixelUtil_isCompressed(format.swigValue());
  }

  public static boolean isDepth(PixelFormat format) {
    return OgreJNI.PixelUtil_isDepth(format.swigValue());
  }

  public static boolean isNativeEndian(PixelFormat format) {
    return OgreJNI.PixelUtil_isNativeEndian(format.swigValue());
  }

  public static boolean isLuminance(PixelFormat format) {
    return OgreJNI.PixelUtil_isLuminance(format.swigValue());
  }

  public static void getBitDepths(PixelFormat format, SWIGTYPE_p_int rgba) {
    OgreJNI.PixelUtil_getBitDepths(format.swigValue(), SWIGTYPE_p_int.getCPtr(rgba));
  }

  public static void getBitMasks(PixelFormat format, SWIGTYPE_p_unsigned_long_long rgba) {
    OgreJNI.PixelUtil_getBitMasks(format.swigValue(), SWIGTYPE_p_unsigned_long_long.getCPtr(rgba));
  }

  public static void getBitShifts(PixelFormat format, SWIGTYPE_p_unsigned_char rgba) {
    OgreJNI.PixelUtil_getBitShifts(format.swigValue(), SWIGTYPE_p_unsigned_char.getCPtr(rgba));
  }

  public static String getFormatName(PixelFormat srcformat) {
    return OgreJNI.PixelUtil_getFormatName(srcformat.swigValue());
  }

  public static boolean isAccessible(PixelFormat srcformat) {
    return OgreJNI.PixelUtil_isAccessible(srcformat.swigValue());
  }

  public static PixelComponentType getComponentType(PixelFormat fmt) {
    return PixelComponentType.swigToEnum(OgreJNI.PixelUtil_getComponentType(fmt.swigValue()));
  }

  public static long getComponentCount(PixelFormat fmt) {
    return OgreJNI.PixelUtil_getComponentCount(fmt.swigValue());
  }

  public static PixelFormat getFormatFromName(String name, boolean accessibleOnly, boolean caseSensitive) {
    return PixelFormat.swigToEnum(OgreJNI.PixelUtil_getFormatFromName__SWIG_0(name, accessibleOnly, caseSensitive));
  }

  public static PixelFormat getFormatFromName(String name, boolean accessibleOnly) {
    return PixelFormat.swigToEnum(OgreJNI.PixelUtil_getFormatFromName__SWIG_1(name, accessibleOnly));
  }

  public static PixelFormat getFormatFromName(String name) {
    return PixelFormat.swigToEnum(OgreJNI.PixelUtil_getFormatFromName__SWIG_2(name));
  }

  public static PixelFormat getFormatForBitDepths(PixelFormat fmt, int integerBits, int floatBits) {
    return PixelFormat.swigToEnum(OgreJNI.PixelUtil_getFormatForBitDepths(fmt.swigValue(), integerBits, floatBits));
  }

  public static void packColour(ColourValue colour, PixelFormat pf, SWIGTYPE_p_void dest) {
    OgreJNI.PixelUtil_packColour__SWIG_0(ColourValue.getCPtr(colour), colour, pf.swigValue(), SWIGTYPE_p_void.getCPtr(dest));
  }

  public static void packColour(short r, short g, short b, short a, PixelFormat pf, SWIGTYPE_p_void dest) {
    OgreJNI.PixelUtil_packColour__SWIG_1(r, g, b, a, pf.swigValue(), SWIGTYPE_p_void.getCPtr(dest));
  }

  public static void packColour(float r, float g, float b, float a, PixelFormat pf, SWIGTYPE_p_void dest) {
    OgreJNI.PixelUtil_packColour__SWIG_2(r, g, b, a, pf.swigValue(), SWIGTYPE_p_void.getCPtr(dest));
  }

  public static void unpackColour(ColourValue colour, PixelFormat pf, SWIGTYPE_p_void src) {
    OgreJNI.PixelUtil_unpackColour__SWIG_0(ColourValue.getCPtr(colour), colour, pf.swigValue(), SWIGTYPE_p_void.getCPtr(src));
  }

  public static void unpackColour(SWIGTYPE_p_unsigned_char r, SWIGTYPE_p_unsigned_char g, SWIGTYPE_p_unsigned_char b, SWIGTYPE_p_unsigned_char a, PixelFormat pf, SWIGTYPE_p_void src) {
    OgreJNI.PixelUtil_unpackColour__SWIG_1(SWIGTYPE_p_unsigned_char.getCPtr(r), SWIGTYPE_p_unsigned_char.getCPtr(g), SWIGTYPE_p_unsigned_char.getCPtr(b), SWIGTYPE_p_unsigned_char.getCPtr(a), pf.swigValue(), SWIGTYPE_p_void.getCPtr(src));
  }

  public static void unpackColour(SWIGTYPE_p_float r, SWIGTYPE_p_float g, SWIGTYPE_p_float b, SWIGTYPE_p_float a, PixelFormat pf, SWIGTYPE_p_void src) {
    OgreJNI.PixelUtil_unpackColour__SWIG_2(SWIGTYPE_p_float.getCPtr(r), SWIGTYPE_p_float.getCPtr(g), SWIGTYPE_p_float.getCPtr(b), SWIGTYPE_p_float.getCPtr(a), pf.swigValue(), SWIGTYPE_p_void.getCPtr(src));
  }

  public static void bulkPixelConversion(SWIGTYPE_p_void src, PixelFormat srcFormat, SWIGTYPE_p_void dst, PixelFormat dstFormat, long count) {
    OgreJNI.PixelUtil_bulkPixelConversion__SWIG_0(SWIGTYPE_p_void.getCPtr(src), srcFormat.swigValue(), SWIGTYPE_p_void.getCPtr(dst), dstFormat.swigValue(), count);
  }

  public static void bulkPixelConversion(PixelBox src, PixelBox dst) {
    OgreJNI.PixelUtil_bulkPixelConversion__SWIG_1(PixelBox.getCPtr(src), src, PixelBox.getCPtr(dst), dst);
  }

  public static void bulkPixelVerticalFlip(PixelBox box) {
    OgreJNI.PixelUtil_bulkPixelVerticalFlip(PixelBox.getCPtr(box), box);
  }

  public PixelUtil() {
    this(OgreJNI.new_PixelUtil(), true);
  }

}
