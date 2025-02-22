package com.ylqi007.template;

public abstract class SoyMilk {
    // 模板方法，make()，
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    // 1. 选材
    void select() {
        System.out.println("Step1: 选材");
    }

    // 2. 添加配料
    abstract void addCondiments();

    // 3. 浸泡
    void soak() {
        System.out.println("Step3: 浸泡原材料");
    }

    // 4. 打豆浆
    void beat() {
        System.out.println("Step4: 打豆浆");
    }
}
