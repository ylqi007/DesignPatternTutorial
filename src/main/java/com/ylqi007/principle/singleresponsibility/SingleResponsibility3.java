package com.ylqi007.principle.singleresponsibility;

/**
 * 方式3分析：
 *  1. 这种修改方案没有对原有的类做大的修改，只是增加方法
 *  2. 虽然没有在类的级别上遵守单一职责原则，但是在方法级别上，仍然遵守了单一职责。
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("游艇");
    }
}

class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上飞行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中游行");
    }
}
