package com.atguigu.prototype.improve;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "蒙古"; // 新增field
    private Sheep friend;   // 是对象，克隆时？

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 克隆该实例，使用默认的clone()方法完成
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        return sheep;
    }
}
