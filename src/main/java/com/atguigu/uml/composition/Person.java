package com.atguigu.uml.composition;

// 组合关系
public class Person {
    private Head head = new Head(); // 组合关系，composition
    private IDCard idCard;  // 聚合关系, aggregation
}

class IDCard {}

class Head {}