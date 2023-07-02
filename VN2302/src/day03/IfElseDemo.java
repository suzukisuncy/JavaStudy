package day03;

import java.util.Scanner;

/**
 * 双路分支的使用演示类：
 */
public class IfElseDemo {
    public static void main(String[] args) {
        /**双路分支的语法演示：
         *  if(判断的条件){
         *      条件成立所执行的代码块
         *  }else{//否则
         *      条件不成立所执行的代码块
         *  }
         *  执行过程:
         *         先去判断小括号中的条件是否成立
         *         若成立 则执行成立对应的代码块
         *         若不成立 则执行不成立对应代码块
         */
        //购物满500 打8折    不满  打9折
        double price = 499;//金额
        if (price >= 500) {//如果金额大于等于500
            price *= 0.8;//打8折
            System.out.println("打完8折后应付:" + price);
        } else {//否则
            price *= 0.9;//打9折
            System.out.println("打完9折后应付:" + price);
        }
        System.out.println("已付款:" + price);

        // 用双路分支 判断a是否是偶数  是偶数 打印偶数  是奇数打印 奇数
        int  a = 15;
        if(a % 2 == 0){
            System.out.println(a + "是偶数");
        }else {
            System.out.println(a + "是奇数");
        }
        //简单的返回某个数据 用分支或三元都可以 ,如果成立/不成立需要执行代码逻辑 则需要使用双路分支。
       String  r =   a % 2 == 0 ? "是偶数":"是奇数";
    }
}
