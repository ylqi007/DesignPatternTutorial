package com.ylqi007.template.hook;

public class PureSoyMilk extends SoyMilk {
    @Override
    void addCondiments() {
        // 空实现就好
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
