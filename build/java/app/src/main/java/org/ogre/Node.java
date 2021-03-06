/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class Node {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Node(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Node obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_Node(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class Listener {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Listener(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Listener obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_Node_Listener(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    protected void swigDirectorDisconnect() {
      swigCMemOwn = false;
      delete();
    }
  
    public void swigReleaseOwnership() {
      swigCMemOwn = false;
      OgreJNI.Node_Listener_change_ownership(this, swigCPtr, false);
    }
  
    public void swigTakeOwnership() {
      swigCMemOwn = true;
      OgreJNI.Node_Listener_change_ownership(this, swigCPtr, true);
    }
  
    public Listener() {
      this(OgreJNI.new_Node_Listener(), true);
      OgreJNI.Node_Listener_director_connect(this, swigCPtr, swigCMemOwn, true);
    }
  
    public void nodeUpdated(Node arg0) {
      if (getClass() == Listener.class) OgreJNI.Node_Listener_nodeUpdated(swigCPtr, this, Node.getCPtr(arg0), arg0); else OgreJNI.Node_Listener_nodeUpdatedSwigExplicitListener(swigCPtr, this, Node.getCPtr(arg0), arg0);
    }
  
    public void nodeDestroyed(Node arg0) {
      if (getClass() == Listener.class) OgreJNI.Node_Listener_nodeDestroyed(swigCPtr, this, Node.getCPtr(arg0), arg0); else OgreJNI.Node_Listener_nodeDestroyedSwigExplicitListener(swigCPtr, this, Node.getCPtr(arg0), arg0);
    }
  
    public void nodeAttached(Node arg0) {
      if (getClass() == Listener.class) OgreJNI.Node_Listener_nodeAttached(swigCPtr, this, Node.getCPtr(arg0), arg0); else OgreJNI.Node_Listener_nodeAttachedSwigExplicitListener(swigCPtr, this, Node.getCPtr(arg0), arg0);
    }
  
    public void nodeDetached(Node arg0) {
      if (getClass() == Listener.class) OgreJNI.Node_Listener_nodeDetached(swigCPtr, this, Node.getCPtr(arg0), arg0); else OgreJNI.Node_Listener_nodeDetachedSwigExplicitListener(swigCPtr, this, Node.getCPtr(arg0), arg0);
    }
  
  }

  static public class DebugRenderable extends Renderable {
    private transient long swigCPtr;
  
    protected DebugRenderable(long cPtr, boolean cMemoryOwn) {
      super(OgreJNI.Node_DebugRenderable_SWIGUpcast(cPtr), cMemoryOwn);
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(DebugRenderable obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_Node_DebugRenderable(swigCPtr);
        }
        swigCPtr = 0;
      }
      super.delete();
    }
  
    public DebugRenderable(Node parent) {
      this(OgreJNI.new_Node_DebugRenderable(Node.getCPtr(parent), parent), true);
    }
  
    public MaterialPtr getMaterial() {
      return new MaterialPtr(OgreJNI.Node_DebugRenderable_getMaterial(swigCPtr, this), false);
    }
  
    public void getRenderOperation(RenderOperation op) {
      OgreJNI.Node_DebugRenderable_getRenderOperation(swigCPtr, this, RenderOperation.getCPtr(op), op);
    }
  
    public void getWorldTransforms(Matrix4 xform) {
      OgreJNI.Node_DebugRenderable_getWorldTransforms(swigCPtr, this, Matrix4.getCPtr(xform), xform);
    }
  
    public float getSquaredViewDepth(Camera cam) {
      return OgreJNI.Node_DebugRenderable_getSquaredViewDepth(swigCPtr, this, Camera.getCPtr(cam), cam);
    }
  
    public SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t getLights() {
      return new SWIGTYPE_p_Ogre__HashedVectorT_Ogre__Light_p_t(OgreJNI.Node_DebugRenderable_getLights(swigCPtr, this), false);
    }
  
    public void setScaling(float s) {
      OgreJNI.Node_DebugRenderable_setScaling(swigCPtr, this, s);
    }
  
  }

  public String getName() {
    return OgreJNI.Node_getName(swigCPtr, this);
  }

  public Node getParent() {
    long cPtr = OgreJNI.Node_getParent(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Quaternion getOrientation() {
    return new Quaternion(OgreJNI.Node_getOrientation(swigCPtr, this), false);
  }

  public void setOrientation(Quaternion q) {
    OgreJNI.Node_setOrientation__SWIG_0(swigCPtr, this, Quaternion.getCPtr(q), q);
  }

  public void setOrientation(float w, float x, float y, float z) {
    OgreJNI.Node_setOrientation__SWIG_1(swigCPtr, this, w, x, y, z);
  }

  public void resetOrientation() {
    OgreJNI.Node_resetOrientation(swigCPtr, this);
  }

  public void setPosition(Vector3 pos) {
    OgreJNI.Node_setPosition__SWIG_0(swigCPtr, this, Vector3.getCPtr(pos), pos);
  }

  public void setPosition(float x, float y, float z) {
    OgreJNI.Node_setPosition__SWIG_1(swigCPtr, this, x, y, z);
  }

  public Vector3 getPosition() {
    return new Vector3(OgreJNI.Node_getPosition(swigCPtr, this), false);
  }

  public void setScale(Vector3 scale) {
    OgreJNI.Node_setScale__SWIG_0(swigCPtr, this, Vector3.getCPtr(scale), scale);
  }

  public void setScale(float x, float y, float z) {
    OgreJNI.Node_setScale__SWIG_1(swigCPtr, this, x, y, z);
  }

  public Vector3 getScale() {
    return new Vector3(OgreJNI.Node_getScale(swigCPtr, this), false);
  }

  public void setInheritOrientation(boolean inherit) {
    OgreJNI.Node_setInheritOrientation(swigCPtr, this, inherit);
  }

  public boolean getInheritOrientation() {
    return OgreJNI.Node_getInheritOrientation(swigCPtr, this);
  }

  public void setInheritScale(boolean inherit) {
    OgreJNI.Node_setInheritScale(swigCPtr, this, inherit);
  }

  public boolean getInheritScale() {
    return OgreJNI.Node_getInheritScale(swigCPtr, this);
  }

  public void scale(Vector3 scale) {
    OgreJNI.Node_scale__SWIG_0(swigCPtr, this, Vector3.getCPtr(scale), scale);
  }

  public void scale(float x, float y, float z) {
    OgreJNI.Node_scale__SWIG_1(swigCPtr, this, x, y, z);
  }

  public void translate(Vector3 d, Node.TransformSpace relativeTo) {
    OgreJNI.Node_translate__SWIG_0(swigCPtr, this, Vector3.getCPtr(d), d, relativeTo.swigValue());
  }

  public void translate(Vector3 d) {
    OgreJNI.Node_translate__SWIG_1(swigCPtr, this, Vector3.getCPtr(d), d);
  }

  public void translate(float x, float y, float z, Node.TransformSpace relativeTo) {
    OgreJNI.Node_translate__SWIG_2(swigCPtr, this, x, y, z, relativeTo.swigValue());
  }

  public void translate(float x, float y, float z) {
    OgreJNI.Node_translate__SWIG_3(swigCPtr, this, x, y, z);
  }

  public void translate(Matrix3 axes, Vector3 move, Node.TransformSpace relativeTo) {
    OgreJNI.Node_translate__SWIG_4(swigCPtr, this, Matrix3.getCPtr(axes), axes, Vector3.getCPtr(move), move, relativeTo.swigValue());
  }

  public void translate(Matrix3 axes, Vector3 move) {
    OgreJNI.Node_translate__SWIG_5(swigCPtr, this, Matrix3.getCPtr(axes), axes, Vector3.getCPtr(move), move);
  }

  public void translate(Matrix3 axes, float x, float y, float z, Node.TransformSpace relativeTo) {
    OgreJNI.Node_translate__SWIG_6(swigCPtr, this, Matrix3.getCPtr(axes), axes, x, y, z, relativeTo.swigValue());
  }

  public void translate(Matrix3 axes, float x, float y, float z) {
    OgreJNI.Node_translate__SWIG_7(swigCPtr, this, Matrix3.getCPtr(axes), axes, x, y, z);
  }

  public void roll(Radian angle, Node.TransformSpace relativeTo) {
    OgreJNI.Node_roll__SWIG_0(swigCPtr, this, Radian.getCPtr(angle), angle, relativeTo.swigValue());
  }

  public void roll(Radian angle) {
    OgreJNI.Node_roll__SWIG_1(swigCPtr, this, Radian.getCPtr(angle), angle);
  }

  public void pitch(Radian angle, Node.TransformSpace relativeTo) {
    OgreJNI.Node_pitch__SWIG_0(swigCPtr, this, Radian.getCPtr(angle), angle, relativeTo.swigValue());
  }

  public void pitch(Radian angle) {
    OgreJNI.Node_pitch__SWIG_1(swigCPtr, this, Radian.getCPtr(angle), angle);
  }

  public void yaw(Radian angle, Node.TransformSpace relativeTo) {
    OgreJNI.Node_yaw__SWIG_0(swigCPtr, this, Radian.getCPtr(angle), angle, relativeTo.swigValue());
  }

  public void yaw(Radian angle) {
    OgreJNI.Node_yaw__SWIG_1(swigCPtr, this, Radian.getCPtr(angle), angle);
  }

  public void rotate(Vector3 axis, Radian angle, Node.TransformSpace relativeTo) {
    OgreJNI.Node_rotate__SWIG_0(swigCPtr, this, Vector3.getCPtr(axis), axis, Radian.getCPtr(angle), angle, relativeTo.swigValue());
  }

  public void rotate(Vector3 axis, Radian angle) {
    OgreJNI.Node_rotate__SWIG_1(swigCPtr, this, Vector3.getCPtr(axis), axis, Radian.getCPtr(angle), angle);
  }

  public void rotate(Quaternion q, Node.TransformSpace relativeTo) {
    OgreJNI.Node_rotate__SWIG_2(swigCPtr, this, Quaternion.getCPtr(q), q, relativeTo.swigValue());
  }

  public void rotate(Quaternion q) {
    OgreJNI.Node_rotate__SWIG_3(swigCPtr, this, Quaternion.getCPtr(q), q);
  }

  public Matrix3 getLocalAxes() {
    return new Matrix3(OgreJNI.Node_getLocalAxes(swigCPtr, this), true);
  }

  public Node createChild(Vector3 translate, Quaternion rotate) {
    long cPtr = OgreJNI.Node_createChild__SWIG_0(swigCPtr, this, Vector3.getCPtr(translate), translate, Quaternion.getCPtr(rotate), rotate);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node createChild(Vector3 translate) {
    long cPtr = OgreJNI.Node_createChild__SWIG_1(swigCPtr, this, Vector3.getCPtr(translate), translate);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node createChild() {
    long cPtr = OgreJNI.Node_createChild__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node createChild(String name, Vector3 translate, Quaternion rotate) {
    long cPtr = OgreJNI.Node_createChild__SWIG_3(swigCPtr, this, name, Vector3.getCPtr(translate), translate, Quaternion.getCPtr(rotate), rotate);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node createChild(String name, Vector3 translate) {
    long cPtr = OgreJNI.Node_createChild__SWIG_4(swigCPtr, this, name, Vector3.getCPtr(translate), translate);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node createChild(String name) {
    long cPtr = OgreJNI.Node_createChild__SWIG_5(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public void addChild(Node child) {
    OgreJNI.Node_addChild(swigCPtr, this, Node.getCPtr(child), child);
  }

  public int numChildren() {
    return OgreJNI.Node_numChildren(swigCPtr, this);
  }

  public Node getChild(int index) {
    long cPtr = OgreJNI.Node_getChild__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node getChild(String name) {
    long cPtr = OgreJNI.Node_getChild__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_Ogre__Node_p_t getChildren() {
    return new SWIGTYPE_p_std__vectorT_Ogre__Node_p_t(OgreJNI.Node_getChildren(swigCPtr, this), false);
  }

  public Node removeChild(int index) {
    long cPtr = OgreJNI.Node_removeChild__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node removeChild(Node child) {
    long cPtr = OgreJNI.Node_removeChild__SWIG_1(swigCPtr, this, Node.getCPtr(child), child);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node removeChild(String name) {
    long cPtr = OgreJNI.Node_removeChild__SWIG_2(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public void removeAllChildren() {
    OgreJNI.Node_removeAllChildren(swigCPtr, this);
  }

  public void _setDerivedPosition(Vector3 pos) {
    OgreJNI.Node__setDerivedPosition(swigCPtr, this, Vector3.getCPtr(pos), pos);
  }

  public void _setDerivedOrientation(Quaternion q) {
    OgreJNI.Node__setDerivedOrientation(swigCPtr, this, Quaternion.getCPtr(q), q);
  }

  public Quaternion _getDerivedOrientation() {
    return new Quaternion(OgreJNI.Node__getDerivedOrientation(swigCPtr, this), false);
  }

  public Vector3 _getDerivedPosition() {
    return new Vector3(OgreJNI.Node__getDerivedPosition(swigCPtr, this), false);
  }

  public Vector3 _getDerivedScale() {
    return new Vector3(OgreJNI.Node__getDerivedScale(swigCPtr, this), false);
  }

  public Affine3 _getFullTransform() {
    return new Affine3(OgreJNI.Node__getFullTransform(swigCPtr, this), false);
  }

  public void _update(boolean updateChildren, boolean parentHasChanged) {
    OgreJNI.Node__update(swigCPtr, this, updateChildren, parentHasChanged);
  }

  public void setListener(Node.Listener listener) {
    OgreJNI.Node_setListener(swigCPtr, this, Node.Listener.getCPtr(listener), listener);
  }

  public Node.Listener getListener() {
    long cPtr = OgreJNI.Node_getListener(swigCPtr, this);
    return (cPtr == 0) ? null : new Node.Listener(cPtr, false);
  }

  public void setInitialState() {
    OgreJNI.Node_setInitialState(swigCPtr, this);
  }

  public void resetToInitialState() {
    OgreJNI.Node_resetToInitialState(swigCPtr, this);
  }

  public Vector3 getInitialPosition() {
    return new Vector3(OgreJNI.Node_getInitialPosition(swigCPtr, this), false);
  }

  public Vector3 convertWorldToLocalPosition(Vector3 worldPos) {
    return new Vector3(OgreJNI.Node_convertWorldToLocalPosition(swigCPtr, this, Vector3.getCPtr(worldPos), worldPos), true);
  }

  public Vector3 convertLocalToWorldPosition(Vector3 localPos) {
    return new Vector3(OgreJNI.Node_convertLocalToWorldPosition(swigCPtr, this, Vector3.getCPtr(localPos), localPos), true);
  }

  public Vector3 convertWorldToLocalDirection(Vector3 worldDir, boolean useScale) {
    return new Vector3(OgreJNI.Node_convertWorldToLocalDirection(swigCPtr, this, Vector3.getCPtr(worldDir), worldDir, useScale), true);
  }

  public Vector3 convertLocalToWorldDirection(Vector3 localDir, boolean useScale) {
    return new Vector3(OgreJNI.Node_convertLocalToWorldDirection(swigCPtr, this, Vector3.getCPtr(localDir), localDir, useScale), true);
  }

  public Quaternion convertWorldToLocalOrientation(Quaternion worldOrientation) {
    return new Quaternion(OgreJNI.Node_convertWorldToLocalOrientation(swigCPtr, this, Quaternion.getCPtr(worldOrientation), worldOrientation), true);
  }

  public Quaternion convertLocalToWorldOrientation(Quaternion localOrientation) {
    return new Quaternion(OgreJNI.Node_convertLocalToWorldOrientation(swigCPtr, this, Quaternion.getCPtr(localOrientation), localOrientation), true);
  }

  public Quaternion getInitialOrientation() {
    return new Quaternion(OgreJNI.Node_getInitialOrientation(swigCPtr, this), false);
  }

  public Vector3 getInitialScale() {
    return new Vector3(OgreJNI.Node_getInitialScale(swigCPtr, this), false);
  }

  public float getSquaredViewDepth(Camera cam) {
    return OgreJNI.Node_getSquaredViewDepth(swigCPtr, this, Camera.getCPtr(cam), cam);
  }

  public void needUpdate(boolean forceParentUpdate) {
    OgreJNI.Node_needUpdate__SWIG_0(swigCPtr, this, forceParentUpdate);
  }

  public void needUpdate() {
    OgreJNI.Node_needUpdate__SWIG_1(swigCPtr, this);
  }

  public void requestUpdate(Node child, boolean forceParentUpdate) {
    OgreJNI.Node_requestUpdate__SWIG_0(swigCPtr, this, Node.getCPtr(child), child, forceParentUpdate);
  }

  public void requestUpdate(Node child) {
    OgreJNI.Node_requestUpdate__SWIG_1(swigCPtr, this, Node.getCPtr(child), child);
  }

  public void cancelUpdate(Node child) {
    OgreJNI.Node_cancelUpdate(swigCPtr, this, Node.getCPtr(child), child);
  }

  public Node.DebugRenderable getDebugRenderable(float scaling) {
    long cPtr = OgreJNI.Node_getDebugRenderable(swigCPtr, this, scaling);
    return (cPtr == 0) ? null : new Node.DebugRenderable(cPtr, false);
  }

  public static void queueNeedUpdate(Node n) {
    OgreJNI.Node_queueNeedUpdate(Node.getCPtr(n), n);
  }

  public static void processQueuedUpdates() {
    OgreJNI.Node_processQueuedUpdates();
  }

  public UserObjectBindings getUserObjectBindings() {
    return new UserObjectBindings(OgreJNI.Node_getUserObjectBindings__SWIG_0(swigCPtr, this), false);
  }

  public enum TransformSpace {
    TS_LOCAL,
    TS_PARENT,
    TS_WORLD;

    public final int swigValue() {
      return swigValue;
    }

    public static TransformSpace swigToEnum(int swigValue) {
      TransformSpace[] swigValues = TransformSpace.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (TransformSpace swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + TransformSpace.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private TransformSpace() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private TransformSpace(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private TransformSpace(TransformSpace swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
