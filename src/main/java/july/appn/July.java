package july.appn;

/**
 * Created by Administrator on 2016/7/20.
 */
public class July {
    public static native String hello();

    public static void init() {
        System.loadLibrary("hello");
    }
}
