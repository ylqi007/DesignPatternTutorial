package com.atguigu.principle.segregation;

import lombok.NonNull;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface Interface1 {
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

/*
A类通过依赖B类调用Interface1的method1(), method2(), method3()
 */
class A {
    public void depend1(@NonNull Interface1 interface1) {
        interface1.method1();
    }

    public void depend2(@NonNull Interface1 interface1) {
        interface1.method2();
    }

    public void depend3(@NonNull Interface1 interface1) {
        interface1.method3();
    }
}

/*
C类通过依赖D类调用Interface1的method1(), method2(), method3()
 */
class C {
    public void depend4(@NonNull Interface1 interface1) {
        interface1.method4();
    }

    public void depend5(@NonNull Interface1 interface1) {
        interface1.method5();
    }
}

class B implements Interface1 {
    @Override
    public void method1() {
        System.out.println("B -> method1()");
    }

    @Override
    public void method2() {
        System.out.println("B -> method2()");
    }

    @Override
    public void method3() {
        System.out.println("B -> method3()");
    }

    @Override
    public void method4() {
        System.out.println("B -> method4()");
    }

    @Override
    public void method5() {
        System.out.println("B -> method5()");
    }
}


class D implements Interface1 {
    @Override
    public void method1() {
        System.out.println("D -> method1()");
    }

    @Override
    public void method2() {
        System.out.println("D -> method2()");
    }

    @Override
    public void method3() {
        System.out.println("D -> method3()");
    }

    @Override
    public void method4() {
        System.out.println("D -> method4()");
    }

    @Override
    public void method5() {
        System.out.println("D -> method5()");
    }
}