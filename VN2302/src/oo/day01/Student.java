package oo.day01;

/**
 * 学生模板类  ---放所有学生对象共有的数据和行为
 * 注意：模板类不需要添加main方法！
 */
public class Student {
    //共有的数据      全局变量:作用范围在整个类中
    String name; //姓名
    int age;//年龄
    int stuId;//学号

    Student(String name, int age, int stuId) {
        this.name = name;
        this.age = age;
        this.stuId = stuId;
    }

    Student() {//无参构造方法

    }

//    Student(){ //无参数构造方法
//        this.name = "张三";
//        this.age  = 18;
//        this.stuId = 1001;
//    }

    //共有的行为
    void study() {
        // int a = 1;  //局部变量:作用范围在当前方法中
        //方法中使用全局变量,默认有个this.的写法!
        //this代表是当前调用方法的这个对象!!
        System.out.println(name + "在学习");
    }

    void sayHi() {
        System.out.println("你好,我叫：" + name + "今年:" + age + "岁了,我的学号是:" + stuId);
    }
}
