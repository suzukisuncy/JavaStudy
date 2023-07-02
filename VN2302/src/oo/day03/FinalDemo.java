package oo.day03;

import java.util.Scanner;

/**
 * final 测试使用类:
 */
public  class FinalDemo {
    public final int a = 100;//final修饰变量 需要声明时初始化

    void test() {
        System.out.println(a);
//        a = 200; final修饰的变量不可二次修改!
    }
}
final class Aoo { //被final修饰的类不能被继承
    protected final void show() {//被final修饰的方法子类无法重写

    }
}
//class Boo extends Aoo{
////    protected void show(){
////
////    }
//}