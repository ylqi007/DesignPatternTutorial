package com.ylqi007.principle.segregation.improve;

public class Segretation1 {
    public static void main(String[] args) {
        A a = new A();
        a.method1(new B());
        a.method2(new B());
        a.method3(new B());

        C c = new C();
        c.method1(new D());
        c.method4(new D());
        c.method5(new D());
    }
}

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
    void method3();
}

interface Interface3 {
    void method4();
    void method5();
}


class A {
    public void method1(Interface1 interface1) {
        interface1.method1();
    }

    public void method2(Interface2 interface2) {
        interface2.method2();
    }

    public void method3(Interface2 interface2) {
        interface2.method3();
    }
}

class C {
    public void method1(Interface1 interface1) {
        interface1.method1();
    }

    public void method4(Interface3 interface3) {
        interface3.method4();
    }

    public void method5(Interface3 interface3) {
        interface3.method5();
    }
}

class B implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("B --> Interface1.method1()");
    }

    @Override
    public void method2() {
        System.out.println("B --> Interface2.method2()");
    }

    @Override
    public void method3() {
        System.out.println("B --> Interface2.method3()");
    }
}

class D implements Interface1, Interface3 {
    @Override
    public void method1() {
        System.out.println("D --> Interface1.method1()");
    }

    @Override
    public void method4() {
        System.out.println("D --> Interface3.method4()");
    }

    @Override
    public void method5() {
        System.out.println("D --> Interface3.method5()");
    }
}
