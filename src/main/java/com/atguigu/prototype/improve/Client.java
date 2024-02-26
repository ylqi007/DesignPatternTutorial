package com.atguigu.prototype.improve;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("使用原型模式完成对象克隆");
        Sheep sheep = new Sheep("Jerry", 1, "Black");
        sheep.setFriend(new Sheep("Jack", 2, "White"));
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println("sheep =" + sheep);
        System.out.println("sheep1=" + sheep1 + "; sheep1.friend=" + sheep1.getFriend().hashCode());
        System.out.println("sheep2=" + sheep2 + "; sheep2.friend=" + sheep2.getFriend().hashCode());
        System.out.println("sheep3=" + sheep3 + "; sheep3.friend=" + sheep3.getFriend().hashCode());
        System.out.println("sheep4=" + sheep4 + "; sheep4.friend=" + sheep4.getFriend().hashCode());
    }
}
