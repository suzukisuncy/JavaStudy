package oo.day03;

import oo.test01.Aoo;

/**
 * 静态变量的使用演示类:
 */
public class StaticVarDemo {
    public static void main(String[] args) {
        Boo b1 = new Boo();
        b1.show();
        Boo b2 = new Boo();
        b2.show();
        Boo b3 = new Boo();
        b3.show();
        System.out.println(Boo.b);//访问静态变量 通过类名打点调用
    }
}
class Boo{
    public int a;//实例变量
    public static int b;//静态变量
    Boo(){
        a++;
        b++;
    }
    public void show(){
        System.out.println("实例变量a的值是:"+a+",静态变量b的值是多少"+b);
    }
}


