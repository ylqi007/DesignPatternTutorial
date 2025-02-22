package com.ylqi007.singleton.type4;

/**
 * 优缺点说明：
 *  1. 解决了线程不安全问题
 *  2. 效率太低，每个线程在获取类的实例时，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，
 *  后面想获得该类实例，直接return就行。方法进行同步效率太低。
 * 结论：在实际开发中，不推荐使用这种方式。
 */
public class SingletonTest4 {
    public static void main(String[] args) {
        System.out.println("懒汉式2: 线程安全，同步方法");
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode()=" + instance1.hashCode());
        System.out.println("instance2.hashCode()=" + instance2.hashCode());
    }
}

class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {}

    // 加入同步处理的代码，解决线程安全问题。
    public static synchronized Singleton4 getInstance() {
        if(instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}