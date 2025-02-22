package com.ylqi007.singleton.type5;

/**
 * 优缺点说明：
 *  1. 本意是type4的同步效率低的改进。
 *  2. 但是这种同步并不能起到线程同步的作用，跟type3的问题一样。
 * 结论：在实际开发中，“不能”使用这种方式。
 */
public class SingletonTest5 {
}


/**
 * 错误写法：与type3的问题一样，无法保证线程安全。
 */
class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {}

    public static Singleton5 getInstance() {
        if(instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
