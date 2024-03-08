package com.atguigu.template.hook;

public class RedBeanSoyMilk extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("加入红豆");
    }
}
