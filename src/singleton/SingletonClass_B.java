package singleton;

/**
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/24.
 */
public class SingletonClass_B {
    private static SingletonClass_B instance = null;
    /**
     * 私有化构造方法
     */
    private SingletonClass_B() {
    }

    public static SingletonClass_B getInstance() {
        if (instance == null) {
            synchronized (SingletonClass_B.class) {
                if (instance == null) {
                    instance = new SingletonClass_B();
                }
            }
        }
        return instance;
    }

}
