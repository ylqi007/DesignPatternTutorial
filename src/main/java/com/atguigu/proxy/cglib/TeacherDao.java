package com.atguigu.proxy.cglib;

/**
 * 此处的TeacherDao并没有实现任何接口
 */
public class TeacherDao  {
    public void teach() {
        System.out.println("老师正在授课 -- Cglib代理，不需要实现接口");
    }

    public String sayHello(String name) {
        System.out.println("In TeacherDao.sayHello(): Hello " + name);
        return "Hello " + name;
    }
}
