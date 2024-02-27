package com.atguigu.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBase() {
        System.out.println("CommonHouse 打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("CommonHouse 建墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("CommonHouse 封顶");
    }

    @Override
    public House buildHouse() {
        return super.buildHouse();
    }
}
