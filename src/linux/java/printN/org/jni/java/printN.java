package org.jni.java;

/**
 * Created by xubo on 2016/6/22.
 */
public class printN {
    public native void print20();
    static {
        try {
            System.loadLibrary("jniTest");
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
    }
}

