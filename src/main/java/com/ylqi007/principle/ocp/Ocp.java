package com.ylqi007.principle.ocp;

public class Ocp {
    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.draw(new Rectangle());
        graphEditor.draw(new Circle());

        graphEditor.draw(new Triangle());
    }
}

// 用于绘图的类 (使用方)
class GraphEditor {
    // 接收Shape对象，然后根据type来绘制不同的图形
    public void draw(Shape shape) {
        if(shape.shapeType == 1) {
            drawRectangle(shape);
        } else if(shape.shapeType == 2) {
            drawCircle(shape);
        } else if(shape.shapeType == 3) {   // 当新增三角形时，需要增加的
            drawTriangle(shape);
        }
    }

    private void drawRectangle(Shape shape) {
        System.out.println("绘制矩形");
    }

    private void drawCircle(Shape shape) {
        System.out.println("绘制圆形");
    }

    private void drawTriangle(Shape shape) {    // 当新增三角形时，需要增加的
        System.out.println("绘制 三角形");
    }
}

class Shape {
    int shapeType;
}

class Rectangle extends Shape {
    Rectangle() {
        this.shapeType = 1;
    }
}

class Circle extends Shape {
    Circle() {
        this.shapeType = 2;
    }
}

// 当增加一个三角形时
class Triangle extends Shape {
    Triangle() {
        this.shapeType = 3;
    }
}