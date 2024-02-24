package com.atguigu.singleton.type3;

/**
 * 懒汉式(线程不安全)
 * 优缺点说明：
 *  1. 起到了lazy loading的效果，但是只能在单线程下使用
 *  2. 如果在多线程下，一个线程进入了`if(instance == null)`的判断语句块，还未来得及往下执行，
 *  另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式。
 * 结论：在实际开发中，不要使用这种方式。
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        System.out.println("懒汉式1: 线程不安全");
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode()=" + instance1.hashCode());
        System.out.println("instance2.hashCode()=" + instance2.hashCode());
    }
}


class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {}

    // 懒汉式: 提供一个静态公有方法，当使用到该方法时，才去创建instance
    public static Singleton3 getInstance() {
        if(instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
