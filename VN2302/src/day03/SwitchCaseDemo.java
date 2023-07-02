package day03;

import java.util.Scanner;

/**
 * switch的使用演示类
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        /** switch的语法演示：
         *  需求:模拟客服电话,提示: 1,中文服务 2,英文服务  0,人工服务
         */
        Scanner s = new Scanner(System.in);//创建一个扫描器
        System.out.println("请输入服务按钮:1,中文服务 2,英文服务   0,人工服务");
        int user = s.nextInt();//接收用户输入的指令
        switch (user) { //判断(变量)
            case 1: //等价于  user == 1
                System.out.println("中文服务开始了...");
                break;//代码遇到break,则退出至switch结束花括号位置..
            case 2://等价于  user == 2
                System.out.println("英文服务开始了...");
                break;//代码遇到break,则退出至switch结束花括号位置..
            case 0://等价于  user == 0
                System.out.println("人工服务开始了...");
                break;//代码遇到break,则退出至switch结束花括号位置..
            default: //可以理解为else  前提是要有break
                System.out.println("输入的指令不合法...");
        }
        System.out.println("程序执行完毕...");
    }
}
