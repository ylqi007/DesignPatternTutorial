package com.ylqi007.facade;

import lombok.Getter;

public class Projector {
    @Getter private static Projector instance = new Projector();

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector ff ");
    }

    public void focus() {
        System.out.println(" Projector is Projector  ");
    }
}
