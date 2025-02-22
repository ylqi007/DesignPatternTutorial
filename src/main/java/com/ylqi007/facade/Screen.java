package com.ylqi007.facade;

import lombok.Getter;

public class Screen {
    @Getter private static Screen instance = new Screen();

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}
