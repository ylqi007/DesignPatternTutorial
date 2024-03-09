package com.atguigu.facade;

import lombok.Getter;

public class Popcorn {
    @Getter private static Popcorn instance = new Popcorn();

    public void on() {
        System.out.println(" popcorn on");
    }

    public void off() {
        System.out.println(" popcorn off");
    }

    public void pop() {
        System.out.println(" popcorn is poping ");
    }
}
