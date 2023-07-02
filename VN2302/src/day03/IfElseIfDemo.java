package day03;

import java.util.Scanner;

/**
 * 多路分支的使用演示类：
 */
public class IfElseIfDemo {
    public static void main(String[] args) {
        /** 多路分支的使用演示类:
         *  if(条件1){
         *      条件1成立所执行的代码块
         *  }else if(条件2){
         *      条件2成立所执行的代码块
         *  }else if(条件3){
         *      条件3成立所执行的代码块
         *  }
         *  sout(其他代码...); ----顺序结构代码
         *  执行过程：
         *         先判断条件1的结果是否成立 ,若为 true则执行条件1对应的代码块
         *    否则如果判断条件2的结果是否成立 ,若为 true则执行条件2对应的代码块
         *    否则如果判断条件3的结果是否成立 ,若为 true则执行条件3对应的代码块
         *    如果都没成立 代码顺序向下执行了....
         */
        //当对一份数据有多种判断条件时使用
        /**需求: 通过用户输入的分数,来判断用户成绩等级
         * 例如: int score = ?;
         *    A.如果分数 大于等于90            输出优秀
         *    B.如果分数 小于90&&大于等于80      输出良好
         *    C.如果分数 小于80&&大于等于70      输出一般
         *    D.如果分数 小于70&&大于等于60      输出及格
         *    E.如果分数 小于60              输出不及格
         */
//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入分数:回车即可");
//        int score = s.nextInt();//接受控制台中键入的数据
//        if(score > 100 || score < 0){
//            System.out.println("分数不合法");
//        }else if (score >= 90) { //如果分数 大于等于90
//            System.out.println("优秀");
//        } else if (score >= 80) {
//            System.out.println("良好");
//        } else if (score >= 70) {
//            System.out.println("一般");
//        } else if (score >= 60) {
//            System.out.println("及格");
//        } else{//否则  代码若执行到改行,则表示上述条件没有一个成立的！
//            System.out.println("不及格");
//        }
//        System.out.println("代码继续向下执行....");
        /**  课堂练习： 通过控制台的方式 获取用户输入的年龄 根据年龄判断人生阶段
         *      int age = ?;
         *      A. 如果    age  大于等于 0 并且小于 5     输出幼年！
         *      B. 否则如果 age 大于等于 5  并且小于18    输出青年！
         *      C. 否则如果 age 大于等于 18 并且小于 35   输出成年！
         *      D. 否则如果 age 大于等于 35 并且小于 50   输出中年！
         *      E. 否则如果 age 大于等于 50 并且小于 65   输出中老年！
         *      F. 否则如果 age 大于等于 65 并且小于 150  输出老年！
         *         否则               输出年龄不合法！
         * */
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年龄,判断人生阶段..");
        int age =s.nextInt();
        if(age >= 0 && age < 5){
            System.out.println("幼年");
        }else if(age >= 5 && age < 18){
            System.out.println("青年");
        }else if(age >= 18 && age < 35){
            System.out.println("成年");
        }else if(age >= 35 && age < 50){
            System.out.println("中年");
        }else if(age >= 50 && age < 65){
            System.out.println("中老年");
        }else if(age >= 65 && age < 150){
            System.out.println("老年");
        }else{
            System.out.println("年龄输入不合法！！！");
        }

    }
}
