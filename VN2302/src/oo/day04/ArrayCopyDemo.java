package oo.day04;

import java.util.Arrays;

/**
 * 数组拷贝方法的使用：
 * 1、Arrays.copyOf();       -----基于源数组的内容基础上进行扩容或缩容的操作.
 * 2、System.arrayCopy();    -----基于已知2个数组,例如 A数组将数据 拷贝给 B数组
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        /**Arrays.copyOf()
         *         int[] array = {};//代表给array存储一个数组对象,但是数组对象长度为0
         *         System.out.println("扩容前数组长度:"+array.length);
         *         int a = 10;
         *         //Arrays.copyOf： 1.处理源数组对象  2.基于源数组的长度增加(扩容)或减少(缩容)
         *         array = Arrays.copyOf(array, array.length + 1);
         *         System.out.println("扩容后数组长度:"+array.length);
         *         array[array.length-1] = a;
         *         for (int i = 0; i < array.length; i++) {
         *             System.out.println(array[i]);
         *         }
         */
        /**System.arrayCopy()
         *
         */
        int[] arrA = {1, 2, 3};
        int[] arrB = {0 ,0, 0};
        /**arraycopy
         * 1.拷贝的源数组
         * 2.从源数组哪个下标进行拷贝
         * 3.拷贝的目标数组
         * 4.从目标数组哪个下标开始装
         * 5.拷贝的长度. 注意,不能超过源数组开始拷贝下标后的长度 并且 不能超过目标数组开始装的下标后的长度
         *          System.arraycopy(arrA,0,arrB,0,3);
         *         for (int i = 0; i < arrB.length; i++) {
         *             System.out.println("arrB数组元素:"+arrB[i]);
         *         }
         */

    }
}
