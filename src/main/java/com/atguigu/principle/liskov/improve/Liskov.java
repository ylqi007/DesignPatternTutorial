package com.atguigu.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        // 因为B类不再继承A类，因此调用者，不会再以为func1是求减法
        B b = new B();
        System.out.println("11+3=" + b.func1(11, 3));

        // 使用组合仍然可以使用到A类的方法
        System.out.println("11-3=" + b.func3(11, 3));
    }
}

class Base {
    // 把更加基础的成员写到Base
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class A extends Base {}

class B extends Base {
    private A a = new A();

    @Override
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 1;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
