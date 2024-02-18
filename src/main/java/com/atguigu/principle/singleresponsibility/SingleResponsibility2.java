package com.atguigu.principle.singleresponsibility;

/**
 * 方案2分析：
 *  1. 遵守了单一职责原则
 *  2. 但是这样做的改动很大，即将类分解了，需要同时修改客户端(即main() method中的内容)
 *  3. 改进：直接修改Vehicle类，改动代码会比较少。
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("游艇");
    }
}

class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上飞行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中游行");
    }
}
