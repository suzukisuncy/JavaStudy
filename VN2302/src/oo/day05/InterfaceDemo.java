package oo.day05;

/**
 * 接口的语法测试：
 */
public class InterfaceDemo {
    static final int A = 1;
    public static void main(String[] args) {
        Inter1 i1 = new Aoo();//向上造型！
        i1.show();//调用父执行子...
    }
}
interface Inter1 {//接口的定义
    //接口中的访问修饰符默认都是public
    //常量和抽象方法
    int A = 10;//接口中默认写的就是常量  static final int A = 10;
    void show();//接口中方法默认就是抽象方法 abstract
}
interface Inter2{ void test1(); }
interface Inter3{ void test2(); }
interface Inter4 extends Inter2,Inter3{
}
class SuperClass{  }//父类
class Aoo extends SuperClass implements Inter1,Inter4{
    public void show() {
        System.out.println("重写Inter1接口中的show方法");
    }
    public void test1() {
    }
    public void test2() {
    }
}
/**  关系
 *   类     与     类     继承关系  -----单继承
 *   接口   与     接口   继承关系  -----多继承
 *   接口   与     类    实现关系
 */