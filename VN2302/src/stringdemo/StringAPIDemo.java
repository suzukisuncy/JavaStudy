package stringdemo;

import java.util.Locale;

/**
 * StringAPI的使用演示类：
 */
public class StringAPIDemo {
    public static void main(String[] args) {
        /** length() 与 charAt()的使用
         * String str = "Thinking in java是一本好书";
         * int length = str.length();//方法
         * System.out.println(length);//21
         * char t= str.charAt(length-1);//charAt 根据传入的下标值,返回对应下标的字符内容
         * System.out.println(t);
         *  请编写一段程序:
         *  将str字符串对象中的"Thinking in java是一本好书"中i所存在的次数统计打印出来!
         *          int count = 0;
         *         String str = "Thinking in java是一本好书";
         *         for (int i = 0; i < str.length(); i++) {
         *              if( str.charAt(i) == 'i'){ //依次判断字符串对象中每个字符 是否等于字符 i
         *                 count++;//自增
         *              }
         *         }
         *         System.out.println("i存在的次数为:"+ count);
         */
        /** indexOf(); lastIndexOf();
         *          String str = "Thinking in java是一本好书";
         *         int index = str.indexOf('i');
         *         System.out.println(index);//2
         *         index= str.indexOf('i',3);
         *         System.out.println(index);//5
         *         index= str.indexOf("java");
         *         System.out.println(index);//12
         *         index= str.lastIndexOf('书');
         *         System.out.println(index);//20
         */
        /**toUpperCase();    toLowerCase();
         * trim();   startsWith();  endsWith();
         *  String str = "Thinking in java是一本好书";
         *         str = str.toUpperCase();//转大写
         *         System.out.println(str);
         *         str = str.toLowerCase();//转小写
         *         System.out.println(str);
         *         str = " Tom";
         *         System.out.println(str);
         *         str = str.trim();//去除字符串两端空白行的方法
         *         System.out.println(str);
         *         boolean r = str.startsWith("T");//根据传入的内容,判断字符串对象是否以该内容开头
         *         System.out.println(r);
         *         r = str.endsWith("m");//根据传入的内容,判断字符串对象是否以该内容结尾
         *         System.out.println(r);
         */

        /**substring 截取字符串的使用
         * String mail = "bjzhangpeng@tedu.cn";
         *         //substring： 1.开始截取的下标 2.结束截取的下标(不包尾)
         *         String userName = mail.substring(0, 11);
         *         System.out.println(userName);
         *         mail = "liucs@tedu.cn";
         *         userName = mail.substring(0, mail.indexOf("@"));
         *         System.out.println(userName);
         */

//        String str = "OOP";
//        boolean r = str.contains("oo");//判断传入的字符串内容,是否包含在当前字符串对象中
//        System.out.println(r);//false   严格区分大小写,判断时同样如此。
//        int a = 123456;
//        String str1= String.valueOf(a);//valueOf可以将传入的类型转换为String对象
//        System.out.println(str1);
//        String name = "佳良";
//        r = name.isEmpty();//判断当前字符串对象长度是否为0的方法
//        System.out.println(r);//false
//        name = "";
//        System.out.println(name.isEmpty());//true
//        name = "黄步挺";
//        char[] chars =  name.toCharArray();//将字符串对象的内容转换为char数组来存储
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }

        /**1.练习：
         *  有以下字符串内容：
         *  String str = "上海自来水来自海上";
         *  请编写一段程序,判断str对象中的内容是否是回文数！
         *          "123321"  正读倒读 都没差别
         *  思路： 依次判断数组中的元素,例如：第一个下标 与最后一个下标 元素判断是否相等 ,若相等依次继续
         *                               第二个下标 与最后二个下标 元素判断是否相等 ,若相等.......
         *  思考? 9个内容需要循环几次可以判断完。 ---->循环条件
         *    String str = "上海自来水来自海上";
         *         boolean result = true;//默认是true
         *         for (int i = 0; i < str.length() / 2; i++) {
         *             if(str.charAt(i) != str.charAt(str.length()-1 -i)){//依次判断前面的字符是否不等于后面的字符
         *                 result = false;//如果满足 则将result赋值为false 代表不是回文数
         *                 break;//退出循环
         *             }
         *         }
         *         System.out.println("是否是回文数:"+result);
         */

        /**2.练习
         *  有以下字符串内容
         *  String str = "1,永远年轻2,永远热泪盈眶3,永远在路上4,向阳而生！";
         *  请编写一段程序,将该字符串对象中,是数值的内容的数据,进行累加求和
         *  最后输出-----10
         *      String str = "1,永远年轻2,永远热泪盈眶3,永远在路上4,向阳而生！";
         *         int sum = 0;
         *         for (int i = 0; i < str.length(); i++) {
         *                  // '1' >= '0'  并且  '1' <= '9'
         *                 //  49  >= 48   并且   49 <=  57
         *             if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){//循环遍历判断当前的字符是否在字符0~字符9之间
         *                  sum += str.charAt(i) - 48;//将字符 - 48 拿到对应的数值 累加给sum
         *             }
         *         }
         *         System.out.println("数值的累加和为："+ sum);
         */

        //如果遍历到的字符 >= '0'  并且 字符  <= '9'      ----本质上比较的就是字符码
        //  字符            码           如何拿到对应的     数值
        /**  0             48              字符 - 48 =    0
         *   1             49              字符 - 48 =    1
         *   2             50              字符 - 48 =    2
         *   ....
         *   9             57              字符 - 48 =    9
         */

//        name = null;
//        name.isEmpty(); 判断长度为0的前提是有对象,否则报空指针异常。

    }
}
