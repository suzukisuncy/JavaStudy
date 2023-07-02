package oo.day04;

/**
 * 匿名内部类的使用演示类：
 */
public class NMInnerClassDemo {
    public static void main(String[] args) {
//        SuperClass sc = new SubClass();
//        sc.show();
        //匿名内部类的使用：
        //1.创建匿名内部类,该内部类是SuperClass的子类
        //2.创建该匿名内部类的对象,将对象赋值给sub
        //3.该花括号,则是匿名内部类的类体,可以该类体中实现重写,完成逻辑代码。
        SuperClass sub = new SuperClass(){ //该行创建的匿名内部类的外部类是NMInnerClassDemo
                                           //该匿名内部类的父类是SuperClass
            @Override
            public void show() {
                System.out.println("这个通过匿名内部类的方式,创建SuperClass子类并实现重写");
            }
        };
        sub.show();//调用父执行子
    }
}
abstract class SuperClass{ //父类
    public abstract void show();
}
//目的重现实现show方法
//代码实现：1.创建一个子类  2.实现继承   3. 重写show();
class SubClass extends SuperClass{
    @Override
    public void show() {
        System.out.println("SubClass重写了父类的show方法...");
    }
}