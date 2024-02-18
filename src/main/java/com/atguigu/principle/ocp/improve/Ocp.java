package com.atguigu.principle.ocp.improve;


public class Ocp {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawShape(new Rectangle());
        graphEditor.drawShape(new Circle());

        graphEditor.drawShape(new OtherShape());
    }
}

class GraphEditor {
    // 新增其他形状时，此处不需要修改
    public void drawShape(Shape shape) {
        shape.draw();
    }
}


abstract class Shape {
    abstract void draw();    // 绘制的抽象方法
}


class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("drawing 矩形");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("drawing 圆形");
    }
}

class OtherShape extends Shape {

    @Override
    void draw() {
        System.out.println("drawing 其他形状");
    }
}