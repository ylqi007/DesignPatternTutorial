package com.ylqi007.singleton.type8;

/**
 * 优缺点说明：
 *  1. 借助JDK1.5中添加的枚举类来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 *  2. 这种方式时Effective Java作者Josh Bloch提倡的方式。
 * 结论：推荐使用。
 */
public class SingletonType8 {
    public static void main(String[] args) {
        Singleton8 instance1 = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode()=" + instance1.hashCode());
        System.out.println("instance2.hashCode()=" + instance2.hashCode());

        instance1.sayOK();
    }
}

enum Singleton8 {
    INSTANCE;

    public void sayOK() {
        System.out.println("OK~~~");
    }
}
