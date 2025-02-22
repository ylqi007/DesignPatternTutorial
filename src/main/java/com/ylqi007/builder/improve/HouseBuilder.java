package com.ylqi007.builder.improve;

// 抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    // 将建造流程写好
    public abstract void buildBase();

    public abstract void buildWalls();

    public abstract void buildRoof();

    // 建造房子，将产品返回
    public House buildHouse() {
        return house;
    }
}
