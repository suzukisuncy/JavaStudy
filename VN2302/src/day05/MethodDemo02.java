package day05;

/**
 * 有参数无返回值方法的使用：
 */
public class MethodDemo02 {
    public static void main(String[] args) {
//        //调用方法时：要根据方法语法来使用该方法的规则：  传递对应参数类型的值 为实际参数
//        String name = "金磊";
//        int age = 33;
//        sayHi(name,age);//调用方法
//        sayHi("步挺",33);//调用方法
//        //s.next(); //接收键入String类型的数据
//        int[] arr1 = {1,2,3,4,5,6,7};
//        for (int i = 0; i < arr1.length; i++){
//            System.out.print(arr1[i]+"\t");
//        }
//        System.out.println();
//        int[] arr2 = {5,6,7,8,9,10};
//        for (int i = 0; i < arr2.length; i++){
//            System.out.print(arr2[i]+"\t");
//        }
//        System.out.println();
//        int[] arr3 = {40,50,60,70,80};
//        for (int i = 0; i < arr3.length; i++){
//            System.out.print(arr3[i]+"\t");
//        }
        int[] arr1 = {1,2,3,4,5,6,7};
        printArray(arr1);

        int[] arr2 = {5,6,7,8,9,10};
        printArray(arr2);
    }
    //方法语法： 返回值类型  方法名(){   方法体  }\
    //形式参数： 参数类型 变量名(提示外部使用方法时传递过来的数据内容)
    //形式参数好处：1.无法确定方法逻辑的数据时,可以将方法的内容完整 2.形式参数的内容是什么由调用者决定！(灵活)
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();//换行
    }

    /**做一个打印数组中数据的功能的方法    方法名：printArray
     *  当方法中定义逻辑时,有些数据无法确定下来,那么我们可以将这个数据 作为形式参数
     *  形式参数的好处:1.可以将方法的内部逻辑定义完整 2.参数内容具体是什么 由使用功能的人来决定
     *  形式参数格式：  数据类型  变量名
     *  有参数无返回的方法
     *
     */

    //方法表示的是功能！
    //需求：做一个问好的功能  sayHi   功能需要通用的！
    //方法的语法：  返回值类型  方法名(){   方法体  }
    //目的：希望谁调用sayHi 谁决定问谁好！
    /**方法参数又叫做：形式参数,当方法中处理的业务逻辑过程有一些无法确定的数据,
     * 可以通过外部调用方法的时候,传递过来具体的内容。
     * 形式参数： 参数类型 变量名(提示外部使用方法时传递过来的数据内容)
     * 形式参数好处：1.无法确定方法逻辑的数据时,可以将方法的内容完整 2.形式参数的内容是什么由调用者决定！(灵活)
     * 原则：方法尽可能定义的灵活一些！不能因为需求发生改变 导致方法频繁被修改！
     */
    static void sayHi(String name,int age){ //自定义方法需要调用才能执行！
        System.out.println( name + "同学你好！,我的年龄是:"+age);
    }




}
