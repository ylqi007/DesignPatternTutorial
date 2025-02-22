package com.ylqi007.prototype.deepclone;


import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String classes;

    public DeepCloneableTarget(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    // 因为该类的属性都是string，因此使用默认的clone即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
