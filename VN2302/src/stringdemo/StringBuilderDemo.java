package stringdemo;
/**
 * StringBuilder的使用演示类:
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
//        String str = "a";
//        StringBuilder builder = new StringBuilder(str);
//        long start = System.currentTimeMillis();//获取当前系统时间(毫秒)
//        for (int i = 0; i < 100000; i++) {
////            str += "a";//每次拼接一个a
//            builder.append("a");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("运行了:"+(end - start) +"ms");
//        //java有GC ,我们不用操心垃圾的回收问题!
//
//
//        //C 语言 ----处理声明变量 过程 需要3个步骤!    1.申请内存空间   2.装数据   3.手动回收!
        String str = "好好学习";
        StringBuilder builder = new StringBuilder(str);//传入要处理的副本
        System.out.println(builder);
        //append:追加 ,在当前的字符串内容后方
        builder.append(",为了找份好工作!");
        System.out.println(builder);
        //replace:替换, 1.开始替换的下标  2.结束替换的下标(不包尾)  3.替换的内容
        builder.replace(5,builder.indexOf("!"),"为了改变世界");
        System.out.println(builder);
        //delete: 删除, 1.开始删除的下标 2.结束删除的下标
        builder.delete(builder.indexOf(","),builder.indexOf("!"));
        System.out.println(builder);
        //insert:插入, 1.开始插入的下标 2.插入的内容
        builder.insert(0,"加油,");
        System.out.println(builder);
        builder.reverse();//反序
//        System.out.println(builder);
        str= builder.toString();//将StringBuilder转化为String类型
        System.out.println(str);
    }
}
