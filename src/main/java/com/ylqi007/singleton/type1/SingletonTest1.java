package com.ylqi007.singleton.type1;

/**
 * 饿汉式(静态变量 static)
 * 优点：写法简单，在类加载的时候就完成了实例化。避免了线程同步的问题。
 * 缺点：类加载时就完成实例化，没有达到Lazy Loading的效果。如果从始至终都为用到这个实例，则会造成内存浪费。
 * 结论：这种单例模式可用，“可能”会造成内存浪费。
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode() = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode() = " + singleton2.hashCode());
    }
}


class Singleton1 {
    // 1. 私有化构造器
    private Singleton1() {}

    // 2. 在本类内部创建对象实例
    private final static Singleton1 instance = new Singleton1();

    // 3. 提供一个公开的静态方法，返回实例
    public static Singleton1 getInstance() {
        return instance;
    }
}
