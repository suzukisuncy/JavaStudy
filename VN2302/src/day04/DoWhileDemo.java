package day04;

import java.util.Scanner;

/**
 * do while循环的使用演示类
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        /** do while 语法:
         *  do{
         *     循环体..放需要循环执行的代码
         *  }while(循环条件);
         *
         *  执行过程：
         *          第一次先去执行循环体代码,在判断循环条件
         *          若条件为true,再次执行循环体,执行完后,再判断循环条件
         *          若条件为true,再次执行循环体,执行完后,再判断循环条件
         *          ...
         *          直至循环条件为false 循环结束
         *                  //System.out.println("行动是成功的阶梯,大家加油！！！");
         *         //循环三要素：1. 循环变量初始化  2.基于循环变量的条件  3.循环变量的改变
         * //        int count = 0;//循环变量初始化
         * //        do{
         * //            System.out.println("行动是成功的阶梯,大家加油！！！");
         * //            count++;//循环变量改变
         * //        }while (count < 3);//循环条件
         * //        System.out.println("程序结束...");
         */
        /**Math.random() 的使用
         *Math.random();获取随机数功能,返回给一个随机小数double类型。
         * 数据范围0~1区间的小数,包头不包尾！包含0 最多到0.9999....
         *         double r1 = Math.random();
         * //        System.out.println(r1);
         *         //0~100的随机小数
         *         double r2 = Math.random() * 100;//0~ 100  包头不包尾！
         * //        System.out.println(r2);
         *         //0~100的整数 -----强转
         *         int r3 = (int) (Math.random() * 100);
         * //        System.out.println(r3);
         *         //区间随机数： 公式  Math.random() *(最大值-最小值)+最小值
         *         //90 ~ 100区间的随机数据
         *         int r4 = (int) (Math.random() * (100 - 90) + 90);
         *         System.out.println(r4);
         */
        /**猜大小案例需求：
         *  1.0运行时产生一个随机数0~100,让用户再控制台中输入一个对应范围数据,接收用户输入的数据并判断
         *     等于. 了 或答对 不等于 答错了
         *  2.0如果答错了,就要让用户一直猜. 循环条件：只要没猜对就一直猜  user != ran
         */
        int ran = (int)(Math.random()*100);//产生一个随机数0~100
        Scanner s = new Scanner(System.in);
        int user;
        do {
            System.out.println("请输入猜的数据,范围0~99");
            //变量的可使用范围：在声明的变量时,从上找离变量最近的开始花括号与对应的结束花括号的区间使用。
            user = s.nextInt();//接收用户输入的数据
            if(user == ran){//判断用户输入的数据 是否等于 系统产生的随机数
                System.out.println("答对了！！");
            }else if(user > ran)  {//如果用户猜的数据大于 ran
                System.out.println("猜大了！！");
            }else {//否则就一定猜小了...
                System.out.println("猜小了！！");
            }
        }while (user != ran);
        //留个作业： 1.将猜大小案例写两遍.看着写一遍 , 删除掉写的代码 根据 需求自己写出来！
          //       2.将代码的执行过程,进行梳理！
        //其它代码..等着
    }
}
