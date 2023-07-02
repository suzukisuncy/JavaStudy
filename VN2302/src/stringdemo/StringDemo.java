package stringdemo;

/**
 * String类的使用演示类:
 */
public class StringDemo {
    static final String STR = "ABC";//字符串常量
    public static void main(String[] args) {
//        String str1 = "ABC";
//        String str2 = str1;//str1 的地址 赋值给 str2  此时str1和str2共享同一个内存地址
//        str1 = str1+"DEF";//此行产生了新的String对象 地址赋值给了str1
//        System.out.println(str1);//ABCDEF
//        System.out.println(str2);//ABC
        String str1 = "ABC";
        String str2 = "ABC";
        String str22 = "A"+"BC";
        System.out.println(str1 == str2);//引用类型的变量用双等 比较的是地址是否相同!
        System.out.println(str1 == STR);//true
        System.out.println(str1 == str22);//true
        //不可复用的形式如下:
        String str33 = "A";
        str33 += "BC";//等价于 str33 = str33 + "BC";
        String str3 = new String("ABC");
        System.out.println(str1 == str33);//false
        System.out.println(str1 == str3);//false

//        int a = 1;
//        int b = 1;
//        System.out.println(a == b);//值类型的变量用双等 比较的是值是否相同!

    }
}
