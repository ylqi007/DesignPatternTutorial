package com.atguigu.principle.dependencyinversion.improve;

public class DependencyInversion2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}


// Define interface
interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "(IReceiver) Email info: Hello, world!";
    }
}

// 增加微信
class WinXin implements IReceiver {
    @Override
    public String getInfo() {
        return "微信：Hello!";
    }
}

// 完成Person接收消息的功能
class Person {
    public void receive(IReceiver receiver) {  // 这里Person类对接口IReceiver的形成依赖
        System.out.println(receiver.getInfo());
    }
}
