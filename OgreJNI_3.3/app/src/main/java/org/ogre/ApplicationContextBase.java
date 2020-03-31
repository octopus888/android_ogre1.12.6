/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ApplicationContextBase extends FrameListener {
  private transient long swigCPtr;

  protected ApplicationContextBase(long cPtr, boolean cMemoryOwn) {
    super(BitesJNI.ApplicationContextBase_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ApplicationContextBase obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BitesJNI.delete_ApplicationContextBase(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    BitesJNI.ApplicationContextBase_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    BitesJNI.ApplicationContextBase_change_ownership(this, swigCPtr, true);
  }

  public ApplicationContextBase(String appName) {
    this(BitesJNI.new_ApplicationContextBase__SWIG_0(appName), true);
    BitesJNI.ApplicationContextBase_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public ApplicationContextBase() {
    this(BitesJNI.new_ApplicationContextBase__SWIG_1(), true);
    BitesJNI.ApplicationContextBase_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public RenderWindow getRenderWindow() {
    long cPtr = BitesJNI.ApplicationContextBase_getRenderWindow(swigCPtr, this);
    return (cPtr == 0) ? null : new RenderWindow(cPtr, false);
  }

  public Root getRoot() {
    long cPtr = BitesJNI.ApplicationContextBase_getRoot(swigCPtr, this);
    return (cPtr == 0) ? null : new Root(cPtr, false);
  }

  public SWIGTYPE_p_Ogre__OverlaySystem getOverlaySystem() {
    long cPtr = BitesJNI.ApplicationContextBase_getOverlaySystem(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Ogre__OverlaySystem(cPtr, false);
  }

  public void initApp() {
    BitesJNI.ApplicationContextBase_initApp(swigCPtr, this);
  }

  public void closeApp() {
    BitesJNI.ApplicationContextBase_closeApp(swigCPtr, this);
  }

  public boolean frameStarted(FrameEvent evt) {
    return (getClass() == ApplicationContextBase.class) ? BitesJNI.ApplicationContextBase_frameStarted(swigCPtr, this, FrameEvent.getCPtr(evt), evt) : BitesJNI.ApplicationContextBase_frameStartedSwigExplicitApplicationContextBase(swigCPtr, this, FrameEvent.getCPtr(evt), evt);
  }

  public boolean frameRenderingQueued(FrameEvent evt) {
    return (getClass() == ApplicationContextBase.class) ? BitesJNI.ApplicationContextBase_frameRenderingQueued(swigCPtr, this, FrameEvent.getCPtr(evt), evt) : BitesJNI.ApplicationContextBase_frameRenderingQueuedSwigExplicitApplicationContextBase(swigCPtr, this, FrameEvent.getCPtr(evt), evt);
  }

  public boolean frameEnded(FrameEvent evt) {
    return (getClass() == ApplicationContextBase.class) ? BitesJNI.ApplicationContextBase_frameEnded(swigCPtr, this, FrameEvent.getCPtr(evt), evt) : BitesJNI.ApplicationContextBase_frameEndedSwigExplicitApplicationContextBase(swigCPtr, this, FrameEvent.getCPtr(evt), evt);
  }

  public void windowMoved(RenderWindow rw) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_windowMoved(swigCPtr, this, RenderWindow.getCPtr(rw), rw); else BitesJNI.ApplicationContextBase_windowMovedSwigExplicitApplicationContextBase(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public void windowResized(RenderWindow rw) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_windowResized(swigCPtr, this, RenderWindow.getCPtr(rw), rw); else BitesJNI.ApplicationContextBase_windowResizedSwigExplicitApplicationContextBase(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public boolean windowClosing(RenderWindow rw) {
    return (getClass() == ApplicationContextBase.class) ? BitesJNI.ApplicationContextBase_windowClosing(swigCPtr, this, RenderWindow.getCPtr(rw), rw) : BitesJNI.ApplicationContextBase_windowClosingSwigExplicitApplicationContextBase(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public void windowClosed(RenderWindow rw) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_windowClosed(swigCPtr, this, RenderWindow.getCPtr(rw), rw); else BitesJNI.ApplicationContextBase_windowClosedSwigExplicitApplicationContextBase(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public void windowFocusChange(RenderWindow rw) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_windowFocusChange(swigCPtr, this, RenderWindow.getCPtr(rw), rw); else BitesJNI.ApplicationContextBase_windowFocusChangeSwigExplicitApplicationContextBase(swigCPtr, this, RenderWindow.getCPtr(rw), rw);
  }

  public void _fireInputEvent(Event event, long windowID) {
    BitesJNI.ApplicationContextBase__fireInputEvent(swigCPtr, this, Event.getCPtr(event), event, windowID);
  }

  public boolean initialiseRTShaderSystem() {
    return BitesJNI.ApplicationContextBase_initialiseRTShaderSystem(swigCPtr, this);
  }

  public void setRTSSWriteShadersToDisk(boolean write) {
    BitesJNI.ApplicationContextBase_setRTSSWriteShadersToDisk(swigCPtr, this, write);
  }

  public void destroyRTShaderSystem() {
    BitesJNI.ApplicationContextBase_destroyRTShaderSystem(swigCPtr, this);
  }

  public void setup() {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_setup(swigCPtr, this); else BitesJNI.ApplicationContextBase_setupSwigExplicitApplicationContextBase(swigCPtr, this);
  }

  public void createRoot() {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_createRoot(swigCPtr, this); else BitesJNI.ApplicationContextBase_createRootSwigExplicitApplicationContextBase(swigCPtr, this);
  }

  public boolean oneTimeConfig() {
    return (getClass() == ApplicationContextBase.class) ? BitesJNI.ApplicationContextBase_oneTimeConfig(swigCPtr, this) : BitesJNI.ApplicationContextBase_oneTimeConfigSwigExplicitApplicationContextBase(swigCPtr, this);
  }

  public void setWindowGrab(SWIGTYPE_p_ANativeWindow win, boolean grab) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_setWindowGrab__SWIG_0(swigCPtr, this, SWIGTYPE_p_ANativeWindow.getCPtr(win), grab); else BitesJNI.ApplicationContextBase_setWindowGrabSwigExplicitApplicationContextBase__SWIG_0(swigCPtr, this, SWIGTYPE_p_ANativeWindow.getCPtr(win), grab);
  }

  public void setWindowGrab(SWIGTYPE_p_ANativeWindow win) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_setWindowGrab__SWIG_1(swigCPtr, this, SWIGTYPE_p_ANativeWindow.getCPtr(win)); else BitesJNI.ApplicationContextBase_setWindowGrabSwigExplicitApplicationContextBase__SWIG_1(swigCPtr, this, SWIGTYPE_p_ANativeWindow.getCPtr(win));
  }

  public void setWindowGrab(boolean grab) {
    BitesJNI.ApplicationContextBase_setWindowGrab__SWIG_2(swigCPtr, this, grab);
  }

  public void setWindowGrab() {
    BitesJNI.ApplicationContextBase_setWindowGrab__SWIG_3(swigCPtr, this);
  }

  public void locateResources() {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_locateResources(swigCPtr, this); else BitesJNI.ApplicationContextBase_locateResourcesSwigExplicitApplicationContextBase(swigCPtr, this);
  }

  public void loadResources() {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_loadResources(swigCPtr, this); else BitesJNI.ApplicationContextBase_loadResourcesSwigExplicitApplicationContextBase(swigCPtr, this);
  }

  public void reconfigure(String renderer, NameValuePairList options) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_reconfigure(swigCPtr, this, renderer, NameValuePairList.getCPtr(options), options); else BitesJNI.ApplicationContextBase_reconfigureSwigExplicitApplicationContextBase(swigCPtr, this, renderer, NameValuePairList.getCPtr(options), options);
  }

  public void shutdown() {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_shutdown(swigCPtr, this); else BitesJNI.ApplicationContextBase_shutdownSwigExplicitApplicationContextBase(swigCPtr, this);
  }

  public void pollEvents() {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_pollEvents(swigCPtr, this); else BitesJNI.ApplicationContextBase_pollEventsSwigExplicitApplicationContextBase(swigCPtr, this);
  }

  public void createDummyScene() {
    BitesJNI.ApplicationContextBase_createDummyScene(swigCPtr, this);
  }

  public void destroyDummyScene() {
    BitesJNI.ApplicationContextBase_destroyDummyScene(swigCPtr, this);
  }

  public void enableShaderCache() {
    BitesJNI.ApplicationContextBase_enableShaderCache(swigCPtr, this);
  }

  public void addInputListener(SWIGTYPE_p_ANativeWindow win, InputListener lis) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_addInputListener__SWIG_0(swigCPtr, this, SWIGTYPE_p_ANativeWindow.getCPtr(win), InputListener.getCPtr(lis), lis); else BitesJNI.ApplicationContextBase_addInputListenerSwigExplicitApplicationContextBase__SWIG_0(swigCPtr, this, SWIGTYPE_p_ANativeWindow.getCPtr(win), InputListener.getCPtr(lis), lis);
  }

  public void addInputListener(InputListener lis) {
    BitesJNI.ApplicationContextBase_addInputListener__SWIG_1(swigCPtr, this, InputListener.getCPtr(lis), lis);
  }

  public void removeInputListener(SWIGTYPE_p_ANativeWindow win, InputListener lis) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase_removeInputListener__SWIG_0(swigCPtr, this, SWIGTYPE_p_ANativeWindow.getCPtr(win), InputListener.getCPtr(lis), lis); else BitesJNI.ApplicationContextBase_removeInputListenerSwigExplicitApplicationContextBase__SWIG_0(swigCPtr, this, SWIGTYPE_p_ANativeWindow.getCPtr(win), InputListener.getCPtr(lis), lis);
  }

  public void removeInputListener(InputListener lis) {
    BitesJNI.ApplicationContextBase_removeInputListener__SWIG_1(swigCPtr, this, InputListener.getCPtr(lis), lis);
  }

  public NativeWindowPair createWindow(String name, long w, long h, NameValuePairList miscParams) {
    return new NativeWindowPair((getClass() == ApplicationContextBase.class) ? BitesJNI.ApplicationContextBase_createWindow__SWIG_0(swigCPtr, this, name, w, h, NameValuePairList.getCPtr(miscParams), miscParams) : BitesJNI.ApplicationContextBase_createWindowSwigExplicitApplicationContextBase__SWIG_0(swigCPtr, this, name, w, h, NameValuePairList.getCPtr(miscParams), miscParams), true);
  }

  public NativeWindowPair createWindow(String name, long w, long h) {
    return new NativeWindowPair((getClass() == ApplicationContextBase.class) ? BitesJNI.ApplicationContextBase_createWindow__SWIG_1(swigCPtr, this, name, w, h) : BitesJNI.ApplicationContextBase_createWindowSwigExplicitApplicationContextBase__SWIG_1(swigCPtr, this, name, w, h), true);
  }

  public NativeWindowPair createWindow(String name, long w) {
    return new NativeWindowPair((getClass() == ApplicationContextBase.class) ? BitesJNI.ApplicationContextBase_createWindow__SWIG_2(swigCPtr, this, name, w) : BitesJNI.ApplicationContextBase_createWindowSwigExplicitApplicationContextBase__SWIG_2(swigCPtr, this, name, w), true);
  }

  public NativeWindowPair createWindow(String name) {
    return new NativeWindowPair((getClass() == ApplicationContextBase.class) ? BitesJNI.ApplicationContextBase_createWindow__SWIG_3(swigCPtr, this, name) : BitesJNI.ApplicationContextBase_createWindowSwigExplicitApplicationContextBase__SWIG_3(swigCPtr, this, name), true);
  }

  public void destroyWindow(String name) {
    BitesJNI.ApplicationContextBase_destroyWindow(swigCPtr, this, name);
  }

  public FileSystemLayer getFSLayer() {
    return new FileSystemLayer(BitesJNI.ApplicationContextBase_getFSLayer(swigCPtr, this), false);
  }

  public static String getDefaultMediaDir() {
    return BitesJNI.ApplicationContextBase_getDefaultMediaDir();
  }

  protected void _destroyWindow(NativeWindowPair win) {
    if (getClass() == ApplicationContextBase.class) BitesJNI.ApplicationContextBase__destroyWindow(swigCPtr, this, NativeWindowPair.getCPtr(win), win); else BitesJNI.ApplicationContextBase__destroyWindowSwigExplicitApplicationContextBase(swigCPtr, this, NativeWindowPair.getCPtr(win), win);
  }

}
