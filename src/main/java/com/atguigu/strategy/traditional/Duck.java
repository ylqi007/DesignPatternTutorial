package com.atguigu.strategy.traditional;

/**
 * Description: 在抽象Duck类中定了quack(), swim(), fly()的默认行为。
 *  子类可以视情况再进行覆盖。
 *
 * @Author: ylqi007
 * @Create: 3/13/24 17:10
 */
public abstract class Duck {
    public Duck() {
    }

    public abstract void display(); // 显示鸭子信息

    public void quack() {
        System.out.println("鸭子叫。。。");
    }

    public void swim() {
        System.out.println("鸭子游泳。。。");
    }

    public void fly() {
        System.out.println("鸭子飞。。。");
    }
}
