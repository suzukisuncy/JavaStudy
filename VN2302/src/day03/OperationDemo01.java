package day03;

/**
 * 数学运算符 and 自增自减运算符 的使用演示类
 */
public class OperationDemo01 {
    public static void main(String[] args) {
        /** 数学运算符
         *         int a = 10;
         *         int b = 5;
         *         int c = a + b;//常规写法
         *         System.out.println(c);//15
         *         //测试写法
         *         System.out.println(a - b);//5
         *         System.out.println(a * b);//50
         *         System.out.println(a / b);//2
         *         //取余 取得是余数  例如： a % b  则表示 取 a / b 的余数
         *         System.out.println(a % b);//0
         *         //取余的使用场景： 1.想判断一个数 是否被 另一个数 整除 2.想判断一个数是否是偶数..
         *         //快速取余运算,取余操作时,若左边的数据 小于右边数据的  余数还是左边的数据
         *         System.out.println(1 % 3);//1
         *         System.out.println(2 % 3);//2
         *         System.out.println(3 % 3);//0
         */
        /** 自增自减运算符:
         * 单独(元)运算：符号在前后都一样,执行该行后都会完成对应的自增或自减的操作。
         *         int a = 5;
         *         ++a;//a自身基础增加1
         *         System.out.println(a);//6
         *         --a;//a自身基础减少1
         *         System.out.println(a);//5
         */
        /** 参与运算(赋值号也是运算)：符号在前在后不一样
         * 符号在前,先去执行符号对应的自增或自减操作,然后再参与其它运算.
         * 符号在后,先去参与其它运算,最后再执行符号对应的自增或自减操作.
         */
//         int a = 5;
//         int b = 5;
//         int c = a++;
//         int d = ++b;
//        System.out.println(a);//6
//        System.out.println(b);//6
//        System.out.println(c);//5
//        System.out.println(d);//6

//        int a = 5;
//        int b = 5;
//        int c = a--;
//        int d = --b;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        int a = 5;
//        System.out.println(a++);//5
//        System.out.println(a);//6
//
//        System.out.println(--a);//5
//        System.out.println(a);//5

        /** 面试题：考察的是自增或自减的底层的运算规则
         *
         */
        int a = 1;
        /**符号在后:
         *  (1) 先将变量中内容赋值给 临时变量  temp = a
         *  (2) 在进行变量的自增             a = a + 1;
         *  (3) 将临时变量中的内容赋值给a      a = temp;
         */
        a = a++;
        System.out.println(a);//1


        int b = 1;
        /**符号在前:
         *  (1) 在进行变量的自增             b = b + 1;
         *  (2) 先将变量中内容赋值给 临时变量  temp = b
         *  (3) 将临时变量中的内容赋值给a      b = temp;
         */
        b  = ++b;
        System.out.println(b);//2

    }
}
