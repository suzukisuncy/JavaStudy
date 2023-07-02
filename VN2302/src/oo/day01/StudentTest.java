package oo.day01;

/**
 * 学生类的测试类:
 * 1.创建对象
 * 2.访问对象
 */
public class StudentTest {
    public static void main(String[] args) {
//        Student zs = new Student();//创建了一个学生对象,将对象存储给 zs中
//        //1. 创建的对象中有什么属性(数据),取决于模板类.
//        //2. 编译期:zs这个变量,能打点调用出什么内容,取决于变量的类型中有什么!
//        //3. 运行期:zs这个变量,打点访问的内容中具体是什么数据,取决于对象!
//        zs.name = "张三";
//        zs.age = 18;
//        zs.stuId = 1001;
//        zs.study();//zs这个对象调用学习的方法
//        zs.sayHi();//zs这个对象调用sayHi的方法
//
//        Student ls = new Student();//创建了一个学生对象,将对象存储给 ls中
//        ls.name = "李四";
//        ls.age = 28;
//        ls.stuId = 1002;
//        ls.study();//ls这个对象调用学习的方法
//        ls.sayHi();//ls这个对象调用sayHi的方法
//
//        //区分: 类与类之间功能上的区分   --   对象跟对象之间数据上的区分

//        System.out.println( zs.name );//张三
//        System.out.println( zs.age);  //18
//        System.out.println( zs.stuId);//1001

//        Student s = null;
//        System.out.println(s.name); //空引用异常

//        Student zs = new Student();
//        zs.name = "张三";
//        zs.age = 18;
//        zs.stuId = 1001;
////        System.out.println(zs); 打印的是对象地址.
//        System.out.println(zs.name);//张三    通过对象地址访问到对象的name
//        System.out.println(zs.age);//18      通过对象地址访问到对象的age
//        System.out.println(zs.stuId);//1001  通过对象地址访问到对象的stuId

        //基本数据类型数组的内存图
        //
//        int[] arr =new int[3];//arr 是int类型数组的变量!
//        arr[0] =  100;
//        arr[1] =  200;
//        arr[2] =  300;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        //引用数据类型数组内存图
//        Student[] students = new Student[3];
//        students[0] = new Student();
//        System.out.println(students[0].name);
//        System.out.println(students[0].age);
//        System.out.println(students[0].stuId);
//        System.out.println(students[0]);//null
//        System.out.println(students[1]);//null
//        System.out.println(students[2]);//null

        Student zs = new Student("张三",18,1001);//创建对象的语法
        System.out.println(zs);
        System.out.println(zs.name);//张三
        System.out.println(zs.age);//18
        System.out.println(zs.stuId);//1001

        Student ls = new Student("李四",28,1002);
        System.out.println(ls.name);//李四
        System.out.println(ls.age);//28
        System.out.println(ls.stuId);//1002

        Student ww = new Student();
        ww.name = "王五";

    }

}
