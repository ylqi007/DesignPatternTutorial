package com.ylqi007.principle.singleresponsibility;

/**
 * 方案1分析：
 *  run()方法违反了单一职责原则。
 *  解决方案：根据交通工具运行方法的不同，分解成不同类即可。即将A类拆分成A1类和A2类。
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road.");
    }
}
