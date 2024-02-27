package com.atguigu.builder.improve;

public class HouseDirector {
    HouseBuilder houseBuilder = null;

    // 构造器
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // Setter 传入HouseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBase();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        return houseBuilder.buildHouse();
    }
}
