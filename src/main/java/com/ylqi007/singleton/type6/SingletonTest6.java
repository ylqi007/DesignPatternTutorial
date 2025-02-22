package com.ylqi007.singleton.type6;

/**
 * 懒汉式(双重检查)
 * 优缺点说明
 *  1. Double-Check概念是多线程开发中常使用到的。在代码中进行了两次if(instance==null)检查，这样可以保证线程安全。
 *  2. 实例化代码只用执行一次，后面在访问的时候，判断if(instance==null)，直接return实例化对象，也避免了反复进行方法同步。
 *  3. 线程安全；延迟加载；效率高。
 * 结论: 在实际开发中，推荐使用这种单例设计模式。
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton6 instance1 = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode()=" + instance1.hashCode());
        System.out.println("instance2.hashCode()=" + instance2.hashCode());
    }
}

class Singleton6 {
    private static volatile Singleton6 instance;

    private Singleton6() {}

    // 加入双重代码检查，解决线程安全问题，解决懒加载问题，同时保证了效率。推荐使用
    public static Singleton6 getInstance() {
        if(instance == null) {
            synchronized (Singleton6.class) {
                if(instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
