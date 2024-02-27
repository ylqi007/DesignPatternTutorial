package com.atguigu.builder.traditional;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBase() {
        System.out.println("CommonHouse 打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("CommonHouse 建墙");
    }

    @Override
    public void roofed() {
        System.out.println("CommonHouse 封顶");
    }
}
