package com.ylqi007.template;

public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        RedBeanSoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println("制作Peanut豆浆");
        PeanutSoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
    }
}
