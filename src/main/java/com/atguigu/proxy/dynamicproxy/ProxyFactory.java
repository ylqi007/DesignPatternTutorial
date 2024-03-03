package com.atguigu.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    // 维护一个目标对象，object
    private Object target;

    // 构造器, 对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成一个代理对象
    public Object getProxyInstance() {
        /*
        public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h) {
         1. loader: 指定当前目标对象使用的类加载器，获取类加载器的方法固定
         2. Class<?>[] interfaces: 目标对象实现的接口类型，使用范型方法确认类型
         3. InvocationHandler h: 事情处理，执行目标对象的方法时，会出发事件处理器方法，会把当前执行的目标对象方法作为参数传入
         */

        // 说明
        // 1. loader:
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始。。。");
                        // 反射机制调用目标对象的方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("JDK代理结束。。。");
                        return returnValue;
                    }
                });
    }
}
