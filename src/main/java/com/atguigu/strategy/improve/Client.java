package com.atguigu.strategy.improve;

/**
 * @Author: ylqi007
 * @Create: 3/13/24 17:33
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        // 动态改变某个对象的行为，通过setter设置新的飞行行为
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        System.out.print("PekingDuck的新飞行行为: ");
        pekingDuck.fly();
    }
}
