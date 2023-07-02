package oo.day06;
/**
 * 引用类型强制类型转换的演示：
 */
public class ClassCastDemo {
    public static void main(String[] args) {
        Aoo a1 = new Boo();//向上造型
        if(a1 instanceof Boo){//判断a1 是否是Boo这个类型
            System.out.println("a1是Boo这个类型");
            Boo b1 = (Boo)a1;//强转成功,符合条件一 强转语法,在需要强转的变量前方小括号里加上要强转的类型
        }
        if(a1 instanceof Inter1){//判断a1 是否实现了 Inter1接口
            System.out.println("a1是实现了Inter1这个接口");
            Inter1 i1 = (Inter1)a1;//强转成功,符合条件二
        }
        if(a1 instanceof Coo){//判断a1 是否是Coo这个类型
            Coo c1 = (Coo)a1; //运行时异常: class cast Exception 类型转换异常
        }else {
            System.out.println("a1不是Coo类型");
        }
    }
}

class Aoo{   }
class Coo extends Aoo{   }
interface Inter1{    }
class Boo extends Aoo implements Inter1{
}