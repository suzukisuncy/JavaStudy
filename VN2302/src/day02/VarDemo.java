package day02;

/**
 * 变量的使用演示类
 */
public class VarDemo { //类 ---- 房子
    public static void main(String[] args) { // 大门 ---程序的主入口
        /** 变量的相关内容
         *         //变量的声明
         *         int a;//声明了一个存储整数的变量  变量名为a
         * //        int b,c,d;//声明了三个存整数的变量 变量名分别为 b c d
         *         //int a;编译错误：重复声明变量 a
         *         //变量的初始化
         *         int e = 300;//声明了一个存储整数的变量 名为e  并为e存储了300这个整数
         *         int f; //声明一个存储整数的变量 名为 f
         *         f = 300;//为f这个变量存储300这个数据
         *         f = 500;//变量第二次赋值称为改变。
         *         System.out.println(f);
         *         //变量的使用
         *         int b = 5;
         *         int c = b + 10;
         *         System.out.println("c");//c
         *         //System.out.println(C);编译错误：使用未声明的变量 C
         *         System.out.println(c);//15
         *         c = 25;              //使用变量时,以变量当前使用前最后一次赋值为准
         *         System.out.println(c);
         */

        //整理代码的格式快捷键:   ctrl +  alt +  L
        //注释的快捷 :  ctrl  + /
        //撤销快捷: ctrl + z
        //复制 粘贴 : ctrl + C     ctrl+V
        //快速复制当前选中行:ctrl +D
        //变量的命名规范  变量名允许包含数字,字母,_和$,且不能以数字开头
        int a1_$;
//        int 1a_$;不能以数字开头
        int _abc;
//        int void; 变量名不能跟关键字一样
//        int int;

//        int 年龄; 不建议
//          int nianling; 不建议
        int age;//建议英文单词的见名知意
        int myAge;//多个单词之间 变量命名遵循小驼峰命名法

        //类的命名规范 大驼峰   例如: VarDemo
        //包的命名规范 纯小写


    }
}
