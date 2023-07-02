package objectdemo;

import java.util.Arrays;

/**
 * Object类的使用演示类:
 */
public class ObjectDemo {
    public static void main(String[] args) {
//        Object o = new Aoo();//声明父 new子

//        System.out.println("x值为:"+ p1.getX() +" y值为:"+p1.getY());
//        Point p2 = new Point(5,6);
//        System.out.println("x值为:"+ p2.getX() +" y值为:"+p2.getY());
//        //p3 ... p4 ... p5 .....

//        //目的：希望以后打印对象的信息更加方便
//        //输出p1对象是一个 类的全包名@内存地址的信息。
//        //只要打印引用类型的变量,默认就是在调用toString方法
//        //希望：打印对象时,是将对象的信息显示出来
//        System.out.println(p1);
//
//        int[] arr = {10,20,30};
//        System.out.println(Arrays.toString(arr));
//        String str ="abcdefghi";
//        System.out.println(str.toString());

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //如果仅仅只是为了看数组中元素信息,我们不用通过遍历的方式就可以查看。

        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        System.out.println(p1 == p2);//false  判断的是内存地址是否相同
        //目的：希望判断p1 对象中的xy 与p2 对象中的xy是否相等
        System.out.println(p1.equals(p2));//ture用于比较引用类型对象中的数据是否相等。


        String str1 = "ABC";
        String str2 = new String("ABC");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);//比较的是地址相等
        System.out.println(str1.equals(str2));//比较的是内容是否相等
        /**
         * 考试目的：查漏补缺！
         */



    }
}

class Aoo {
    int aoo1;
}

class Boo extends Aoo {

}