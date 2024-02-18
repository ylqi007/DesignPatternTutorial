package com.atguigu.principle.dependencyinversion;

/**
 * 方式1分析：
 *  1. 简单，容易想到
 *  2. 如果我们获取的对象是微信，短信等等，则新增类，同时Person类也要增加相应的接收方法
 *  3. 解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类依赖接口IReceiver
 *      因为Email，微信等等都属于接收的访问，它们各自实现IReceiver接口就OK，这样就符合依赖倒转原则
 */
public class DependencyInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}


class Email {
    public String getInfo() {
        return "Email info: Hello, world!";
    }
}

// 完成Person接收消息的功能
class Person {
    public void receive(Email email) {  // Email是一个类，形成了Person类对Email类的直接依赖
        System.out.println(email.getInfo());
    }
}
