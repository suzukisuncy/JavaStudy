package day02;

import java.math.BigDecimal;


/**
 * 小数类型 double
 * char类型
 * boolean 类型 演示类：
 */
public class DataTypeDemo02 {
    public static void main(String[] args) {
//        //double类型的演示
//        // 3.14 ---小数直接量 默认就是double类型
//        double a = 3.14;
//
//        double b = 3.0;
//        double c = 2.9;
//        System.out.println( b - c );//结果存在误差  0.10000000000000009
//
//        double e = 6.0;
//        double f = 4.9;
//        System.out.println(e - f);//结果存在误差  1.0999999999999996
//
//        double g = 6.0;
//        double h = 1.9;
//        System.out.println(g - h);//结果存在误差  4.1
//
//        //BigDecimal 类型可以解决不精确的问题   了解即可 不需要写
//        BigDecimal a1 = BigDecimal.valueOf(3.0);
//        BigDecimal b1 = BigDecimal.valueOf(2.9);
//        System.out.println(a1.subtract(b1));//0.1

        //char 类型
        char temp = 'A';
        System.out.println(temp);//打印显示字符
        System.out.println((int)temp);//可以将字符转换成对应的码
        char t1 = '\'';
        System.out.println(t1);
        char t2 = '\\';
        System.out.println(t2);
        char t3 = '男';
        System.out.println(t3);


//        boolean a1 = 1 > 1;
        boolean a = true;//成立
        boolean b = false;//不成立
        System.out.println(a);//true
        System.out.println(b);//false

    }
}
