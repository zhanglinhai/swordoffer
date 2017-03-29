package singleton;

/**
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/24.
 */
public class SingletonClass_A {
    private static final SingletonClass_A instance = new SingletonClass_A();

    /**
     * 私有化构造方法
     */
    private SingletonClass_A() {
    }

    public static SingletonClass_A getInstance() {
        return instance;
    }

}
