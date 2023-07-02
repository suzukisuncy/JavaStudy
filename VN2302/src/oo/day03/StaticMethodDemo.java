package oo.day03;

/**
 * 静态方法的使用演示类：
 * 静态代码块：
 * 常量的使用：
 */
public class StaticMethodDemo {

    public static void main(String[] args) {
//        Coo.test02();//访问静态方法 通过类名打点调用
        //1.将Coo.class字节码文件加载到方法区中
        //2.则执行了Coo类的静态代码块
//        System.out.println( Coo.a);//通过类名访问静态成员也叫做使用类,这种使用方式也会被加载.

        //等价于：System.out.println(300);
        //在编译期间使用常量,本质上就已经把常量的数据转换为具体的数据了
        System.out.println(Coo.C);



    }
}
class Coo {
    public static int a;//静态变量
    public final int b = 100;//用final修饰

    public static final int C = 300;//常量的声明语法


    //构造方法存在的目的是为了给实例变量初始化赋值.

    //静态代码块存在的目的是给静态变量初始化赋值.
    static {
        System.out.println("静态代码块执行了...");
    }

//    public int a;//实例变量
//    public static int b;//静态变量

//    void test() { //普通方法 :即可访问实例变量,又可以访问静态变量
//        this.a = 10;//隐式写法的this.
//        Coo.b = 20;//静态的内容 隐式写法 类名.
//    }
//    public static void test02() {//静态方法 ,没有隐式 this 传递
////        this.a = 10; 无法访问实例成员(实例变量,普通方法)
////        this.test();
//
//        b = 20;//可以访问静态成员
//    }
}