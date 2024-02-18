package com.atguigu.principle.dependencyinversion.improve;

import java.util.Optional;

/**
 * 在Dependency Inversion中，进行依赖传递的三种方式
 */
public class DependencyPass {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        // 方式1: 通过接口实现依赖
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

        // 方式2: 通过构造方法依赖传递
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();

        // 方式3. 通过setter方法传递
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}



interface ITV {
    void play();
}

class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开，play()");
    }
}

// 方式1: 通过接口实现依赖
//interface IOpenAndClose {
//    void open(ITV tv);  // 抽象方法，接收接口
//}
//
//class OpenAndClose implements IOpenAndClose {
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}


// 方式2. 通过构造方法依赖传递
//interface IOpenAndClose {
//    void open();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv;  // 成员变量
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}

// 方式3. 通过setter方法传递
interface IOpenAndClose {
    void setTv(ITV tv);
    void open();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}