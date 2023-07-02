package day03;

import java.util.Scanner;

/**
 * 关系运算符
 * 逻辑运算符
 */
public class OperationDemo02 {
    public static void main(String[] args) {
        /**关系运算符：大于,小于,大于等于,小于等于,等于,不等于
         *
         *         int a = 50;
         *         int b = 40;
         *         boolean c = a > b;//常规写法
         *         System.out.println(c);//true
         *         System.out.println(a <= b);//false
         *         System.out.println(10 >= 10);//true
         *         System.out.println(5 != 4);//true
         *         System.out.println(2 == 2);//true
         *         System.out.println(100 != 100);//false
         */

        /**逻辑运算符: 逻辑与(&&)   逻辑或(||)   逻辑非(!)
         * 逻辑与(&&),见false 即 false
         * 逻辑或(||),见true  即 true
         * //        int a = 5;
         * //        int b = 10;
         * //        int c = 5;
         * //        boolean result = a > b && b > c;// false && true ----- false
         * //        System.out.println(result);//false
         * //        System.out.println(a > b || b > c);// false || true -----true
         * //        System.out.println(a == ++c && c > 5);//false && true ----- false
         * //        System.out.println(c > a && b == 10);//true && true   -----true
         * //        System.out.println(!(c == 6) && a == 5);//false && true ----- false
         */

        /** 判断年份是否是闰年?  year 表示年份
         *     是闰年条件：
         *              条件1：年份能被4整除 并且 年份不能被100整除
         *              或者
         *              条件2: 年份能被400整除
         *           //Scanner  扫描器功能: 提供了可以在控制台接收键入的数据(整数,小数....)
         * //        Scanner s = new Scanner(System.in);//创建一个扫描器
         * //        System.out.println("请输入要判断的年份,回车即可！");
         * //        int year = s.nextInt();//nextInt() 用来接收控制台中键入的整数的数据
         * //        boolean r1 = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
         * //        System.out.println(r1);
         */


        /** 短路现象：
         * 短路与现象：两个或多个条件,若前面的条件有不成立的,则立刻返回不成立结果.
         * 短路或现象：两个或多个条件,若前面的条件成立,则立刻返回成立结果.
         *         int a = 5;
         *         int b = 20;
         *         System.out.println(a > b && ++b > a);//false    发生了短路与
         *         System.out.println(b);//20
         *
         *         System.out.println(a < b && ++b >a);//true      未发生短路
         *         System.out.println(b);//21
         *
         *         System.out.println(++a < b || ++b >= 21);//true  发生了短路或
         *         System.out.println(b);//21
         */


    }
}
