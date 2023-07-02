package day04;

/**
 * 双重for循环的使用演示类：
 */
public class ForDemo02 {
    public static void main(String[] args) {
        //实现需求：九九乘法表
        //分解需求:  3的乘法表
        //格式：  1 * 3 = 3    2 * 3 = 6   3 * 3 = 9
        for(int num = 1; num <=9; num++){ //控制轮数

            for(int i = 1; i <= num; i++){//控制次数               //tab
               // System.out.print(i +" * " + num +" = " +(i * num)+"\t");
            }
            //System.out.println();//换行
        }

        //需求: 打印5行5列的☆
        //需求: 打印5行5列的☆
        for(int i = 1; i <= 5; i++){//控制行数
            for(int j = 1; j <= 5; j++){//控制列数
                System.out.print("★");
            }
            System.out.println();//换行
        }
    }



}
