package com.ylqi007.proxy.staticproxy;

/**
 * 代理对象，使用静态代理
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target; // 目标对象，被代理对象，通过接口耦合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始: 完成某些操作。。。。。");    // 可以是其他方法，安全验证之类的。。。
        target.teach();
        System.out.println("代理结束。。。。。。。");
    }
}
