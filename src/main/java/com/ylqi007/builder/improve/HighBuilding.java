package com.ylqi007.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("HighBuilding 打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("HighBuilding 建墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("HighBuilding 封顶");
    }

    @Override
    public House buildHouse() {
        return super.buildHouse();
    }
}
