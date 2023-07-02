package oo.day02;

/**
 * super 关键字的使用演示类：
 */
public class SuperDemo {
    public static void main(String[] args) {
        /**
         * 如果实现了继承,当子类被创建对象时
         * 子类的构造方法中会先去调用父类的构造方法,再执行自己的构造方法内容。
         */
        Boo b = new Boo();
        /**
         * 如果父类添加了有参数的构造方法,而没有写无参数的构造方法,子类一旦实现继承则会报错!
         */
    }
}//类的结束花括号

class Aoo { //父类 / 超类
    Aoo(int a){
        System.out.println("Aoo类有参构造方法");
    }
}
class Boo extends Aoo{//子类 / 派生类
    Boo(){
        super(10);
    }
}

