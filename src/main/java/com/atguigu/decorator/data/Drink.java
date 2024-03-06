package com.atguigu.decorator.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Drink {
    public String des;
    private float price;

    // 计算费用的抽象方法，由子类继承
    public abstract float cost();
}
