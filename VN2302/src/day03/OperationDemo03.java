package day03;

/**
 * 扩展赋值运算符:
 * 三元表达式:
 * 字符串拼接符:
 */
public class OperationDemo03 {
    public static void main(String[] args) {
        /** 扩展赋值运算符: 可以在变量自身基础进行运算,并将运算结果赋值给自身
         *   int a = 10;
         *         a += 10; // 等价于:  a = a + 10;
         *         System.out.println(a);//20
         *
         *         a -= 10; // 等价于:  a = a - 10;
         *         System.out.println(a);//10
         *
         *         a *= 2;//   等价于:  a = a * 2;
         *         System.out.println(a);//20
         *
         *         a /= 5; //  等价于:  a = a / 5;
         *         System.out.println(a);//4
         *
         *         a %= 2; //  等价于:  a = a % 2;
         *         System.out.println(a);//0
         *
         *         //面试题：
         *         /**
         *          *         byte b = 5;
         *          *         b = b + 5;//编译错误: byte运算 结果是int  赋值给b 则报错误
         *          *         System.out.println(b);
         *
         byte b = 5;
         b += 5;// 实际上 做了强转 -->  b = (byte)(b + 5);
         System.out.println(b);//10
         */

        /**格式 :   判断的条件 ?  值1 :  值2
         * 判断的条件若成立,则将值1的数据返回
         * 判断的条件若不成立,则将值2的数据返回
         *        int a = 10;
         *         int b = 20;
         *         //需求:求a和b之间最大值。
         *         int max = a > b ? a : b;
         *         System.out.println(max);//20
         *         //值1 和 值2 类型要匹配或可以自动转换,否则编译错误
         *         //需求：判断c是否是偶数 用三元表达式 返回 true  或 false 表示是与不是.
         *         int c  = 8;
         *         boolean r = c % 2 == 0 ? true:false;
         *         System.out.println(r);
         *         System.out.println(c > 8 ? 9.9 : 9);//9.0
         */

        /**字符串拼接符:
         *使用+号,如果有一端是String类型,则进行拼接操作,变成一个完整的字符串!
         */
        String name = "李浩文";
        System.out.println("这位同学的名字叫做:" + name);
        System.out.println(10+10+""+30); //"2030"
        System.out.println(""+6+6+6);//"666"
        System.out.println(10+10+30+"");//"50"




    }
}
