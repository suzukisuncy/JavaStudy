package oo.day01;

/*
    打印水仙花数
    水仙花数：是指一个三位数，其各位数字立方和等于该数字本身
    例如：153就是一个水仙花数，因为153 = 1³ + 5³ + 3³

 */
public class Demo {
    public static void main(String[] args) {
        int x, y, z;//百位   十位   个位
        for (int i = 100; i < 1000; i++) {
            x = i / 100;
            y = i / 10 % 10;
            z = i % 10;
            //水仙花数:153
            //水仙花数:370
            //水仙花数:371
            //水仙花数:407
            if (i == x * x * x + y * y * y + z * z * z) {
                System.out.print("水仙花数:");
                System.out.println(i);
            }
        }
    }
}
