package day05;

import java.util.Scanner;

/**
 * 数组的使用演示类:
 */
public class ArrayDemo {
    public static void main(String[] args) {
//        //1.数组的声明
//        int[] a;//声明了一个int类型的数组
//        //2.数组的初始化,分为两种 ： 静态初始化   动态初始化
//        //静态初始化：当声明数组时,已知存储的元素个数和数据时使用
//        int[] arrA = {5,10,15,20,25};
//        //动态初始化:当声明数组时,已知存储的元素个数时使用。
//        int[] arrB = new int[3];//创建了int数组并开辟了3块空间
//        //3.数组的访问
//        arrB[0] = 100;//为arrB数组下标0区域,赋值数据100
//        arrB[1] = 200;//为arrB数组下标0区域,赋值数据100
//        arrB[2] = 300;//为arrB数组下标0区域,赋值数据100
////        arrB[3] = 1000;//数组下标访问越界异常:ArrayIndexOutOfBoundsException
//        System.out.println(arrB[0]);//100
//        System.out.println(arrB[1]);//200
//        System.out.println(arrB[2]);//300
        //4.数组的遍历:遍历指的是依次访问数组中每个元素的过程
//        int[] array = {10, 20, 30, 40, 50, 60};
//        //数组的长度: 数组名.length
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);
        // 练习: 通过程序 求出array数组中所有元素和
//        int sum = 0;//记录和
//        int[] array = {10, 20, 30, 40, 50, 60};
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];   // array[i]代表数组中的每个元素
//        }
//        System.out.println("sum累加数组中的和为:"+sum);

        //练习：通过运行程序,在控制台中依次录入10名同学的成绩,存到一个数组中
        //数组名 ：  scores
        //思考？数组开辟多少块空间
        //     1.0 完成运行时录入10名同学成绩
        //2.0 求10名同学的平均成绩是多少?  班级总分 / 人数
        //运行过程：
        /**       请输入第1名同学的成绩
         *        88
         *        请输入第2名同学的成绩
         *        90
         *        ...
         *        请输入第10名同学的成绩
         *         60
         *        录入完毕.
         *                Scanner s = new Scanner(System.in);
         *         int[] scores = new int[10];//开辟10个空间
         *         int sum = 0;//用来记录总成绩
         *         for (int i = 0; i < scores.length;i++){
         *             System.out.println("请输入第"+ (i+1) +"名同学成绩");
         *             scores[i] = s.nextInt();//依次接收用户在控制台中的数据 存给数组的每块空间
         *             sum += scores[i];//累加和到sum
         *         }
         *         System.out.println("10名同学的平均成绩为:"+ sum / scores.length);
         */


        /** 练习：
         *      已知数组： int[] arrA = {30,70,20,88,999,50};
         *      需求:通过程序 求出arrA数组中最大值
         *      思路：1.假设数组中第一个元素是最大值, 声明个变量  int max = arrA[0];
         *           2.遍历当前数组,拿max依次与数组中的每个元素比较
         *           3.若max小于arrA[i]  则将 max = arrA[i]; 始终保持max最大
         *           循环结束 输出max 则拿到最大值
         *             int[] arrA = {30, 70, 20, 88, 999, 50};
         *         int max = arrA[0];//假设数组的第一个数据是最大值
         *         int maxIndex = 0;//假设最大值的下标是0
         *         for (int i = 0; i < arrA.length; i++) {
         *             if(max < arrA[i]){
         *                max = arrA[i];//将当前大于max 的数据 赋值给max 始终保持max最大
         *                maxIndex = i;//将最大值下标进行重新赋值。
         *             }
         *         }
         *         System.out.println("arrA数组最大值是:"+max+"对应在数组中的下标是："+maxIndex);
         */


        /**需求 ：随机生成4位验证码。
         *   思路： 1.声明一个char数组开4个空间  用来装随机出来的字符数据。 char[] code = new char[4];
         *         2.获取随机数, 随机范围就是 0 ~ codes.length  (int)(Math.random()*codes.length)
         *         3.codes[随机数] 将对应的字符 依次赋值给code数组
         *      最后遍历输出随机的验证码 ----遍历code数组。
         *
         *      不重复的验证码的情况:
         *      1.可以做一个boolean类型的数组,长度跟codes保持一致  new boolean[codes.length];
         *         boolean0~35的值都是false
         *      2.随机一个整数数据  第一次假设随机到的数据是 0   将随机到的 0   c[i] = codes[0];
         *        同时还要将  boolean[0] 修改为true
         *        下次随机到的数据还是0  判断boolean[0] 若为true 则表示当前已经随机到过了 直接continue
         *      while(true){
         *          //退出的条件  例如当index的数据自增到4  退出循环 break
         *      }
         *       char[] codes = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
         *                 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
         *                 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
         *         char[] c = new char[4];//用来存储随机出的字符
         *         //36
         *         for (int i = 0; i < c.length; i++) {
         *             int ranIndex = (int) (Math.random() * codes.length);//每次循环生成一个随机数
         *             c[i] = codes[ranIndex];//将随机的数据 当做取codes数组中的元素下标,来随机取出数据给c数组依次复制
         *         }
         *         for (int i = 0;i<c.length;i++){
         *             System.out.print(c[i]);
         *         }
         *         System.out.println();
         */

        //以下的业务逻辑功能:求arrA数组中最大值的程序
        int[] arrA = {30, 70, 20, 88, 999, 50};
        int max = arrA[0];//假设数组的第一个数据是最大值
        int maxIndex = 0;//假设最大值的下标是0
        for (int i = 0; i < arrA.length; i++) {
            if(max < arrA[i]){
                max = arrA[i];//将当前大于max 的数据 赋值给max 始终保持max最大
                maxIndex = i;//将最大值下标进行重新赋值。
            }
        }
        System.out.println("arrA数组最大值是:"+max+"对应在数组中的下标是："+maxIndex);

        int[] arrB = {70, 50, 90, 880, 1000, 50};
        int max1 = arrB[0];//假设数组的第一个数据是最大值
        int maxIndex1 = 0;//假设最大值的下标是0
        for (int i = 0; i < arrB.length; i++) {
            if(max < arrB[i]){
                max = arrB[i];//将当前大于max 的数据 赋值给max 始终保持max最大
                maxIndex1 = i;//将最大值下标进行重新赋值。
            }
        }
        System.out.println("arrA数组最大值是:"+max1+"对应在数组中的下标是："+maxIndex1);

        int[] arrC = {90, 600, 190, 880, 1000, 50};
        int max2 = arrB[0];//假设数组的第一个数据是最大值
        int maxIndex2 = 0;//假设最大值的下标是0
        for (int i = 0; i < arrB.length; i++) {
            if(max < arrB[i]){
                max = arrB[i];//将当前大于max 的数据 赋值给max 始终保持max最大
                maxIndex2 = i;//将最大值下标进行重新赋值。
            }
        }
        System.out.println("arrA数组最大值是:"+max1+"对应在数组中的下标是："+maxIndex2);
    }
}
