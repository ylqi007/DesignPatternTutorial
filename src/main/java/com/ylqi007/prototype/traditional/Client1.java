package com.ylqi007.prototype.traditional;

public class Client1 {
    public static void main(String[] args) {
        //
        Sheep sheep = new Sheep("Tom", 1, "White");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
    }
}
