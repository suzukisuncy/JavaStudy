package day05;

import java.util.Scanner;

/**
 * 方法的作业：
 */
public class MethodTest {
    public static void main(String[] args) {
        /**需求:写一个功能,根据外部传入的两个整数数据,以及一个操作数char值来实现运算并返回结果.
         -例如:   调用方法:    operation(10,20,'+')   那么方法返回的结果则是30
         -操作数就是char类型, 分别有'+'   '-'   '*'   '/'  实现四则运算.   if(操作数 == '+') {  返回相加结果 }
         int result = operation(10, 20, '%');
         System.out.println(result);
         */

        /**-需求:有以下数组 array, 通过实现一个反序功能,可以将该数组的内容实现反序.
         -int[] array = { 1 ,2 ,3 ,4, 5, 6 ,7}
         -例如: 调用方法: reversalArray( array)   那么方法执行完以后
         -array数组中的数据 则 array 中数据为 7  6  5  4  3  2  1
         *思路:
         * 已知下标0是第一个元素,  数组名.length-1 是数组最后一次元素
         * 我们将第1个与倒数第一个交换,然后依次第二个和倒数第二个交换,第三个与倒数第三个交换...
         *数组7个数那这个过程需要执行几次?则表示需要几次循环.
         *思考?两个变量如何交换?   可以借助第三个变量 int  temp ; 来完成.
         */
        int[] array = { 1 ,2 ,3 ,4, 5, 6 ,7,8,9,10 };
        reversalArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    static void reversalArray(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int temp  = array[i];
            array[i]  =  array[array.length-1- i];
            array[array.length-1- i] =  temp;
        }
    }
    static int operation(int a, int b, char c) {
        if (c == '+') {
            return a + b;
        } else if (c == '-') {
            return a - b;
        } else if (c == '*') {
            return a * b;
        } else if (c == '/') {
            return a / b;
        }
        System.out.println("不合法");
        return  -1;
    }


}
