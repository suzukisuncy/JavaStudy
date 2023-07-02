package day05;

/**
 * 有参数有返回值的方法演示:
 */
public class MethodDemo04 {
    public static void main(String[] args) {
//        int s = sum(10, 20);
//        System.out.println(s);
//        double s1 = sum(1.5, 6.9);
//        System.out.println(s1);
//        System.out.println( sum(10,20,30));
//        //我们经常用的打印语句也使用的重载!方便使用者只关心打印的数据
//        System.out.println(10);
//        System.out.println(1.235);
//        System.out.println('A');
//        System.out.println(true);
//        System.out.println("abcd!");
        //以下的业务逻辑功能:求arrA数组中最大值的程序
        int[] arrA = {30, 70, 20, 88, 999, 50};
        int max = getMaxByArray(arrA);
//        int max = arrA[0];//假设数组的第一个数据是最大值
//        for (int i = 0; i < arrA.length; i++) {
//            if (max < arrA[i]) {
//                max = arrA[i];//将当前大于max 的数据 赋值给max 始终保持max最大
//            }
//        }
        System.out.println("arrA数组最大值是:" + max);
        int[] arrB = {70, 50, 90, 880, 1000, 50};
        System.out.println( getMaxByArray(arrB));
//        int max1 = arrB[0];//假设数组的第一个数据是最大值
//        for (int i = 0; i < arrB.length; i++) {
//            if (max < arrB[i]) {
//                max = arrB[i];//将当前大于max 的数据 赋值给max 始终保持max最大
//            }
//        }
//        System.out.println("arrA数组最大值是:" + max1);
        int[] arrC = {90, 600, 190, 880, 2000, 50};
        System.out.println( getMaxByArray(arrC));
//        int max2 = arrB[0];//假设数组的第一个数据是最大值
//        for (int i = 0; i < arrB.length; i++) {
//            if (max < arrB[i]) {
//                max = arrB[i];//将当前大于max 的数据 赋值给max 始终保持max最大
//            }
//        }
//        System.out.println("arrA数组最大值是:");
    }
    /** 需求: 做一个求int数组最大值的功能方法
     *  目的: 需要外部传入一个int数组,根据传入的数据求出该数组的最大值,并返回最大值
     *  方法名:  getMaxByArray
     *
     */
    //方法语法: 返回值类型 方法名(){ }
    static int  getMaxByArray(int[] arr){
        int max = arr[0];//假设数组的第一个数据是最大值
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];//将当前大于max 的数据 赋值给max 始终保持max最大
            }
        }
        return max;
    }

    /**
     * 需求1:写一个计算和的功能方法.
     * 目的:通过外部传入两个int类型的数据 ,方法中计算传入进来的数据相加和,并返回给调用者
     * 有参:为了让调用方法的人决定计算什么数据.
     * 有返回值:计算后将结果给调(使)用者
     */
    static int sum(int a, int b) {//满足个数不同
        return a + b;
    }

    /**
     * 需求2:写一个计算和的功能方法
     * 目的：通过外部传入两个double类型的数据 ,方法中计算传入进来的数据相加和,并返回给调用者
     */
    static double sum(double a, double b) {//满足类型不同
        return a + b;
    }

    /**
     * 需求3：写一个计算和的功能方法
     * 通过外部传入的3个数据,计算3个整数的和并返回
     */
    static int sum(int a, int b, int c) {//满足个数不同
        return a + b + c;
    }
    //需求4！5 6  7 ........

    //当我们在定义功能方法时,往往需求是多变的！那么就意味可能同一个功能,要做n多个方法
    //缺点：对于使用者来讲不友好！需要记不同的方法名 使用对应的功能！
    //解决：当多个方法表示的功能是一致时,但是由于参数个数不同或参数类型不同 导致的多个方法时
    //    可以用方法的重载来解决!
    //重载定义: 当多个方法表示的功能是一致时,满足参数个数或参数类型不同 时,可以使用同一个方法名表示!
    //重载好处: 方便调用者无需区分同一个功能的方法名,系统会自动根据调用者传入的参数个数或类型来匹配对应已定义方法
}
