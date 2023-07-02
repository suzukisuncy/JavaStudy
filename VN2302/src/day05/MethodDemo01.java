package day05;

/**
 * 无参无返回值方法的使用演示：
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        //代码逻辑重复！且一旦需求发生改变,全部都要变！
//        System.out.println("一个右鞭腿");
//        System.out.println("一个左刺拳");
//        System.out.println("一个过肩摔");
//        System.out.println("年轻人！耗子尾汁！");
//        System.out.println("你过来啊！！");
//
//        System.out.println("一个右鞭腿");
//        System.out.println("一个左刺拳");
//        System.out.println("一个过肩摔");
//        System.out.println("年轻人！耗子尾汁！");
//        System.out.println("你过来啊！！");
//
//        System.out.println("一个右鞭腿");
//        System.out.println("一个左刺拳");
//        System.out.println("一个过肩摔");
//        System.out.println("年轻人！耗子尾汁！");
//        System.out.println("你过来啊！！");
        attack();//调用方法
        attack();//调用方法
        attack();//调用方法
    }
    //方法的语法：  返回值类型  方法名(){   方法体  }
    //自定义方法,如果不被调用是不会被执行的！
    //static不是方法的必要语法：目前加static只是为了再main调用测试。
    //好处：一次定义多次调用！实现逻辑复用！且若修改只需要修改一次即可！
    //无参数无返回值方法的定义：当只是仅仅包裹一段重复的业务逻辑代码时,且不需要参数内容和返回值类型的情况下使用。
    static void attack() {//定义方法
        System.out.println("一个右鞭腿");
        System.out.println("一个左刺拳");
        System.out.println("一个过肩摔");
        System.out.println("年轻人！耗子尾汁！");
        System.out.println("你过来啊！！");
        System.out.println("只需要改一次！");
    }


}
