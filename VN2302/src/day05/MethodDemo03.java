package day05;

import java.util.Scanner;

/**
 * 无参数有返回值的方法使用演示：
 */
public class MethodDemo03 {
    public static void main(String[] args) {
        //调用的方法如果有返回值的话,若只是想要输出该方法返回的数据,我们可以将调用的方法套在打印语句中
        System.out.println(getPi()); //3.1415926
        double p = getPi();
        System.out.println(p);
        double ran = Math.random();//获取随机数的功能 返回0~1 的随机小数 double
//        Scanner s = new Scanner(System.in);
//        double user= s.nextDouble();
        System.out.println(Math.PI);
    }
    /**
     * 需求：做一个获取PI值的功能方法
     * 目的: 让调用者可以通过该功能,获取到一份数据PI: 3.1415926
     */
    //方法语法： 返回值类型  方法名(){   方法体  }
    //注意:一旦方法有返回值类型,那么在方法体的结束花括号之前要写return 语句 返回要返回的数据才可以!
    //return  需要返回的具体数据；   return -----表示退出方法并返回后面数据。
    static double getPi() {
        return 3.1415926;
    }

}
