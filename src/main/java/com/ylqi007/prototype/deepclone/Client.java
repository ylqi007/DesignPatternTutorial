package com.ylqi007.prototype.deepclone;


public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("使用原型模式完成对象克隆");

        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setName("宋江");
        deepPrototype.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "AAA"));

        // 方式1: 深拷贝
        //DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.clone();
        //System.out.println("deepPrototype.deepCloneableTarget.hashCode()==" + deepPrototype.getDeepCloneableTarget().hashCode());
        //System.out.println("deepPrototype1.deepCloneableTarget.hashCode()==" + deepPrototype1.getDeepCloneableTarget().hashCode());


        // 方式2完成深拷贝
        DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.deepClone();
        System.out.println(deepPrototype.getName());
        System.out.println("deepPrototype.deepCloneableTarget.hashCode()==" + deepPrototype.getDeepCloneableTarget().hashCode());
        System.out.println(deepPrototype1.getName());
        System.out.println("deepPrototype1.deepCloneableTarget.hashCode()==" + deepPrototype1.getDeepCloneableTarget().hashCode());
    }
}
