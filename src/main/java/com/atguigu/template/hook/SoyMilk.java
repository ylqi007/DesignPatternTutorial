package com.atguigu.template.hook;

public abstract class SoyMilk {
    // 模板方法，make()，
    final void make() {
        select();
        if(customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    // 钩子方法
    boolean customerWantCondiments() {
        return true;
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
