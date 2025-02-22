package com.ylqi007.singleton.type7;


/**
 * 优缺点说明：
 *  1. 这种方式采用了类加载的机制来保证初始化实例时只有一个线程。
 *  2. 静态内部类方式在Singleton7类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance()方式，
 *  才会装载SingletonInstance类，从而完成Singleton7的实例化。
 *  3. 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助保证了线程的安全性，在类进行初始化时，别的线程时无法进入的。
 *  4. 避免了线程不安全，利用静态内部类特点实现延迟加载，效率高。
 * 结论: 推荐使用
 */
public class SingletonType7 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode()=" + instance1.hashCode());
        System.out.println("instance2.hashCode()=" + instance2.hashCode());
    }
}

class Singleton7 {
    private static Singleton7 instance;

    private Singleton7() {}

    // 写一个静态内部类，该类中有一个静态属性Singleton7
    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    // 公开的静态方法直接返回SingletonInstance.INSTANCE
    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
