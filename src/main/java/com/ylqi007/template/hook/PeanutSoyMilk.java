package com.ylqi007.template.hook;

public class PeanutSoyMilk extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("加入花生豆");
    }
}
