package ie.agisoft;

/**
 * Created by xubo on 2016/6/22.
 */
public class printN {
    public native void printN();
    static {
        try {
            LibraryLoader.loadLibrary("jniTest");
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
    }
}
