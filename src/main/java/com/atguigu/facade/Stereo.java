package com.atguigu.facade;

import lombok.Getter;

public class Stereo {
    @Getter private static Stereo instance = new Stereo();

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Screen off ");
    }

    public void up() {
        System.out.println(" Screen up.. ");
    }
}
