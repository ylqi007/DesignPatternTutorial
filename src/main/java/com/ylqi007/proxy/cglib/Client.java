package com.ylqi007.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        // 1. 创建目标对象
        TeacherDao teacherDao = new TeacherDao();

        // 2. 获取目标对象，并传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();

        // 3. 执行代理对象的方法，出发intercept()方法，从而实现对目标对象的调用
        System.out.println("===== 测试proxyInstance.teach() ===== 无返回参数");
        proxyInstance.teach();

        System.out.println("===== 测试proxyInstance.sayHello() ===== 有返回参数");
        String returnValue = proxyInstance.sayHello("Jerry");
        System.out.println(returnValue);
    }
}
