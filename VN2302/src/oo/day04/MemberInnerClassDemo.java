package oo.day04;

/**
 * 成员内部类的语法测试：
 */
public class MemberInnerClassDemo {
    public static void main(String[] args) {
//        Boo b1 = new Boo(); 1.内部类对外不具备可访问性
    }
}

class Aoo{//相对于Boo,Aoo是外部类
    private int a;
    void test(){
        Boo b1 = new Boo();//内部类可以在外部类中访问.
    }
    class Boo{ //内部类
        int a ;
        void test01(){
            this.a = 10;// 2.内部类共享外部类的内容
            Aoo.this.a = 20;//明确访问外部类内容的写法：外部类名.this.(属性或方法..)
//            test();
        }
    }
}