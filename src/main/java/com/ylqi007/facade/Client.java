package com.ylqi007.facade;

public class Client {
    public static void main(String[] args) {
        // 直接在client中调用子系统很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
