package day02;

/**
 * 数据类型转换的使用演示类：
 * 运算规则的演示:
 */
public class DataTypeDemo03 {
    public static void main(String[] args) {
        /**
         * 1.自动类型转换(隐式转换):将小的类型 赋值给 大类型的过程.
         *          int a = 100;//没有发生类型转换
         *         long b = a;//发生自动类型转换
         *         double c = b;//发生自动类型转换
         *
         *         long a1 = 2000000000L;//20亿
         *         int b1 = (int)a1;//使用强转语法：在需要强转的变量前加小括号 ----(写上强转类型即可)
         *         System.out.println(b1);//20亿
         * 2.强制类型转换(显示转换):将大的类型 赋值给 小类型的过程.
         *          long a2 = 3000000000L;//30亿
         *         int b2 = (int)a2;//使用强转语法：在需要强转的变量前加小括号 ----(写上强转类型即可)
         *         System.out.println(b2);//溢出的数据  因为30亿超过int类型的存储范围.
         *
         *         double c1 = 3.14;
         *         int d = (int)c1; //小数强转为整数,结果是不会保留小数位
         *         System.out.println(d);//3
         *         System.out.println(c1);//3.14
         *         c1 = d;//整数赋值给小数类型,则会有小数位.
         *         System.out.println(c1);//3.0
         */

        /**运算规则：
         * 整数直接量是可以直接赋值给byte,short,char类型的,但是直接量不能超过当前类型所容纳的范围.
         * byte,short,char类型如果运算,系统会自动将运算结果转换为int类型.
         * 小类型与大类型在进行运算时,运算结果会自动上升为大类型.
         */
        //byte范围: -128 ~ 127
        byte a = 127;
        //char码范围：0 ~ 65535
        char b = 65535;
        System.out.println(b);

        byte b1 = 120;
        byte b2 = 7;
        byte result = (byte) (b1 + b2);
        System.out.println(result);

        char c1 = 'A';//A的码是65
        char c2 = 'A';
        char r2 = (char)(c1 + c2);//码+码 结果强转成对应的 字符
        System.out.println(r2);

        int i1 = 100;
        long l2 = 200L;
        long r3 = i1 + l2;// int + long ,long大 所以运算结果为long类型
        System.out.println(r3);//300

    }
}
