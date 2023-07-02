package day04;

/**
 * while循环的使用演示类：
 */
public class WhileDemo {
    public static void main(String[] args) {
        /** while语法:
         *  while(循环条件){
         *      条件成立所执行的代码块
         *  }
         *  sout(其它的代码...);
         * 执行过程：
         *        程序遇到while ,则判断小括号中的条件是否满足
         *        若满足 则执行条件成立所对应的代码块,执行完后,跳到小括号位置继续判断条件是否满足
         *        若满足 则再次执行条件成立所对应的代码块,执行完后,跳到小括号位置继续判断条件是否满足
         *        ....
         *        直至 循环条件不满足 循环退出 继续向下执行其它代码
         */
        //局部代码需要循环做好多次...
//        System.out.println("今晚大家非常棒！！继续保持！");//x3
        //循环三要素：1. 循环变量初始化  2.基于循环变量的条件  3.循环变量的改变
        int count = 0;//表示执行的次数  循环变量
        while (count < 3){//循环条件：count < 3
            System.out.println("今晚大家非常棒！！继续保持！");
            count++;//循环变量自增
        }
        System.out.println("程序已结束");
    }
}
