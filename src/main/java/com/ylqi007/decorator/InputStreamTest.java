package com.ylqi007.decorator;


import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * 1. InputStream是抽象类，类似前例中的Drink
 *  1.1 FileInputStream是InputStream的子类，类似前例中的DeCaf, LongBlack
 * 2. FilterInputStream是InputStream的子类，作为Decorator
 *  2.1 FilterInputStream中有protected volatile InputStream in，这就是具体的被修饰者
 *  2.2 DataInputStream是FilterInputStream的子类，是具体的Decorator, 类似前例中的Milk, Soy...
 * 3. 分析得出: JDK的IO体系中，使用的就是装饰者模式
 */
public class InputStreamTest {
    public static void main(String[] args) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("abc.txt"));
        System.out.println(dataInputStream.read());
        dataInputStream.close();
    }
}
