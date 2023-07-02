package regexdemo;

import java.util.Scanner;

/**
 * 正则表达式的使用演示类：
 */
public class RegexDemo {
    public static void main(String[] args) {
//        String mail = "bjzhangpeng_@tedu.cn";//邮箱
//        String mailRegex ="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
//        if( mail.matches(mailRegex)){//判断邮箱的内容是否与正则格式内容匹配
//            System.out.println("邮箱格式正确");
//        }else {
//            System.out.println("格式错误!请注意修改!");
//        }
//        //身份证号码的正则                或
//        /**         身份证号码位数  15 位 |  18位
//         * 123456789012345        15位
//         * 123456789012345678     18位
//         * 12345678901234567x     前17位数字18位x
//         * 12345678901234567X     前17位数字18位X
//         *  \d{15}      -----15位数字
//         *  \d{17}[\dXx] ----前面是17位的数字,第18位可以是数字或x或X字母
//         *  完整格式: \d{15}|\d{17}[\dXx]
//         */
//        Scanner s = new Scanner(System.in);
//        String number = s.next();//next接受用户输入的字符串内容
//        String regex = "\\d{15}|\\d{17}[\\dXx]";
//        if(number.matches(regex)){
//            System.out.println("输入的身份证号码格式正确!");
//        }else {
//            System.out.println("输入的身份证号码有误!");
//        }
        /**座机号码正则格式:
         *      1234567     7位
         *      12345678    8位
         *  010-  1234567     3位区号-7位电话号码
         *  010-  12345678    3位区号-8位电话号码
         *  0101- 1234567    4位区号-7位电话号码
         *  0101- 12345678   4位区号-8位电话号码
         *  (010)  1234567    (3位区号)7位电话号码
         *  (010)  12345678   (3位区号)8位电话号码
         *  (0101) 1234567   (4位区号)7位电话号码
         *  (0101) 12345678   (4位区号)8位电话号码
         *  \d{7,8}     ---7或8位数字
         *  第一种区号:  \d{3,4}-
         *  第二种区号:  (\d{3,4})
         *  完全的格式:   (\d{3,4}- | (\d{3,4}))?\d{7,8}
         *      Scanner s = new Scanner(System.in);
         * //        String number = s.next();//next接受用户输入的字符串内容
         * //        String regex = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";
         * //        if(number.matches(regex)){
         * //            System.out.println("座机号码格式正确");
         * //        }else {
         * //            System.out.println("格式错误!");
         * //        }
         */
//        //split();分割的方法 可以根据传入的正则内容,来匹配当做分割点,将分割的内容以数组形式返回
//        String str = "abc123def456ghi";
//        String[] strArr= str.split("[0-9]+");
////        System.out.println(strArr.length);
//        for (int i = 0; i < strArr.length; i++) {
////            System.out.println(strArr[i]);
//        }
//        String userName = "username=123=password=456";
//        strArr = userName.split("=");
//        for (int i = 0; i < strArr.length; i++) {
//            System.out.println(strArr[i]);
//        }

        String message = "wr!你这个sb,tmd行不行!";
        String regex = "(wr|sb|tmd)"; //敏感词汇..
        //replaceAll:支持正则  1.正则格式   2.替换的内容
        message = message.replaceAll(regex,"***");
        System.out.println(message);


        String str = "abc123def123ghi123";
        //replace :替换 不支持正则  1.匹配的具体内容  2.替换的内容
        str = str.replace("123","NUMBER");
        System.out.println(str);

    }
}
