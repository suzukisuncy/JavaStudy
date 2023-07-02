package day02;

/**
 *int和long类型的使用演示类：
 */
public class DataTypeDemo01 {
    public static void main(String[] args) {
//            //100 就是整数直接量 默认就是int类型
//        int a = 100;
//        //int存储范围 最大值：2147483647   最小值:   -2147483648
////        int b = 2147483648;
//        int c = 5;
//        int d = 2;
//        System.out.println( c / d );//2
//
//        int e = 2147483647;
//        int f = e + 3;
//        System.out.println(f);//溢出的数据...
//
//        /**
//         *  +1  --------------(-2147483648)
//         *  +1+1--------------(-2147483647)
//         *  +2+1--------------(-2147483646)
//         */

        //long 类型的直接量 后缀加L

        long a = 2147483648000L;
                //10亿x2 是int结果没超过int所容纳的范围
        long b = 1000000000 * 2 * 10L;
        System.out.println(b);//200亿
               //10亿x3 是int类型结果超过int所容纳的范围 就溢出了,再运算也是不准确的数据
        long c = 1000000000 * 3 * 10L;
        System.out.println(c);//溢出的数据

        long d = 1000000000L * 3 * 10;//long类型在进行运算时,建议在第一个数据后缀L
        System.out.println(d);//300亿



    }
}
