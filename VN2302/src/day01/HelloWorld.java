package day01; // 包  包名 day01     ------- 楼 + 单元

/**
 * Java的第一个运行程序
 */
public class HelloWorld {//类  类名HelloWorld  --------房子
    //main 功能 ： 程序的主入口  运行程序必须要有main功能！
    //main 快捷键：快速生成main功能    在类中空白区域英文状态下 敲 main 有提示回车即可！
    public static void main(String[] args) { //大门 代码需要运行则放在大门里
        /**程序的执行：顺序执行
         * 1, Java是严格区分大小写！
         * 2, 写代码的期间始终保持输入法是英文状态下
         * 3,一行代码结尾加英文分号 ;
         */
        //打印功能：主要负责输出打印的信息(文字,数字,符号.....)
        //sout快捷键：快速生成打印语句
        //注意：文字,字母,符号等特殊内容若须打印,需要放在双引号里面才可以
        //数值的数据,都可以直接放在小括号中进行打印
        System.out.println("hello java!");//双引号中的内容 所见即所得！

    }//程序执行到main的结束花括号 则程序退出

}