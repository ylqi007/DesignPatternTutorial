package com.ylqi007.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("8-3=" + a.func1(8, 3));

        System.out.println("====================");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));   // 这里本意是11-3，但是由于func1被重写了,造成原用功能错误
        System.out.println("8-3=" + b.func1(8, 3));

    }
}

class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {
    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1, num2) + 1;
    }
}
