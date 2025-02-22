package com.ylqi007.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        // 1. 创建目标对象，即被代理对象
        TeacherDao teacherDao = new TeacherDao();

        // 2. 创建代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        // 3. 通过代理对象调用被代理对象的方法
        // teacherDaoProxy.teach() --> teacherDao.teach()
        teacherDaoProxy.teach();
    }
}
