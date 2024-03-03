package com.atguigu.proxy.dynamicproxy;


public class Client {
    public static void main(String[] args) {
        // 1. 创建目标对象，即被代理对象
        TeacherDao teacherDao = new TeacherDao();   // 即target

        // 2. 给target对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();

        System.out.println(proxyInstance);  // com.atguigu.proxy.dynamicproxy.TeacherDao@681a9515
        System.out.println(proxyInstance.getClass());   // class jdk.proxy1.$Proxy0, 内存中动态生成的代理对象

        // 3. 通过代理对象，调用目标对象的方法
        System.out.println("===== 开始测试动态代理 =====");
        proxyInstance.teach();

        proxyInstance.sayHello("Tom");
    }
}
