package day03;

import java.util.Scanner;

/**
 * 单路分支的使用演示类：
 */
public class IfDemo {
    public static void main(String[] args) {
        /** 单路分支的语法演示:
         *  if(条件){
         *      当判断的条件为true时,执行的代码块
         *  }
         *  程序执行:
         *         先判断if小括号中的条件是否成立(true)
         *          若为true则执行对应的代码块区域
         */
        //购物金额满500 打8折
        //金额可以通过Scanner方式通过控制台 键入来获取   nextDouble();
        Scanner s = new Scanner(System.in);//创建一个扫描器
        System.out.println("请输入付款金额:回车即可");
        double price = s.nextDouble();//代表购物金额
        if(price >= 500){ //如果金额大于等于500
            price *= 0.8;//打8折  等价于： price = price *0.8;
            System.out.println("打完8折后,应付："+price);
        }
        System.out.println("已付款:"+price);

    }
}
