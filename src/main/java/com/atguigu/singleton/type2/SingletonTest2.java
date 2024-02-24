package com.atguigu.singleton.type2;

/**
 * 饿汉式(静态代码块)
 * 与饿汉式(静态变量 static)的方式其实类似，只不过将实例化的过程放在了静态代码块中，也是在类加载的时候就执行
 * 静态代码块中的代码，初始化类的实例。优缺点与静态变量方式一致。
 *
 * 结论：这种单例模式可用，但是可能造成内存浪费。
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode() = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode() = " + singleton2.hashCode());
    }
}


class Singleton {
    // 2. 在本类内部创建对象实例
    private static Singleton instance;  // final?

    // 在静态代码块中，创建单例对象
    static {
        instance = new Singleton();
    }

    // 1. 私有化构造器，外部不能new
    private Singleton() {}

    // 3. 提供一个公开的静态方法，返回实例
    public static Singleton getInstance() {
        return instance;
    }
}