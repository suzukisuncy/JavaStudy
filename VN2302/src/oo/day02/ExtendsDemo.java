package oo.day02;

/**
 * 继承的测试类：
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        //解决：
        //1.创建老师对象,医生对象或学生对象时,需要为依次为对象依次打点赋值比较麻烦！ 构造方法解决！
        //2.实现第1步后,发现医生类 老师类 学生类的构造方法中,存在冗余的赋值过程！ 如何解决?

        Person p1 = new Teacher("小王", 28, '男', 10000000);
        Person p2 =  new Doctor("老李", 38, '男', 10);
        Person p3 = new Student("张三", 18, '男', 1001);
        Person[] pp = new Person[9];
        pp[0] = new Teacher("小王", 28, '男', 10000);
        pp[1] = new Teacher("小李", 28, '男', 10000);
        pp[2] = new Teacher("小张", 28, '男', 10000);
        pp[3] = new Doctor("老李", 38, '男', 10);
        pp[4] = new Doctor("老张", 38, '男', 10);
        pp[5] = new Doctor("老王", 38, '男', 10);
        pp[6] = new Student("张三", 18, '男', 1001);
        pp[7] = new Student("李四", 28, '男', 1001);
        pp[8] = new Student("王五", 28, '男', 1001);
        for (int i = 0; i < pp.length; i++) {
            //编译期间: 调用的是父类型中的sayHi          ---- 调父
            //运行期间: 执行时是谁的sayHi方法要看对象是谁  ----执行子
            pp[i].sayHi();
        }

        Teacher t1 = new Teacher("小王", 28, '男', 10000);
        t1.sayHi();//调用老师 执行老师

        Person ppp = new Student("李四", 28, '男', 1001);
        ppp.sayHi();//调用父 执行子
        //

//        Teacher[] teachers = new Teacher[3];
//        teachers[0] = new Teacher("小王", 28, '男', 10000000);
//        teachers[1] = new Teacher("小李", 28, '男', 10000000);
//        teachers[2] = new Teacher("小张", 28, '男', 10000000);
//        sayHiByArray(teachers);
//        fori...
//        Doctor[] doctors = new Doctor[3];
//        doctors[0] = new Doctor("老李", 38, '男', 10);
//        doctors[1] = new Doctor("老张", 38, '男', 10);
//        doctors[2] = new Doctor("老王", 38, '男', 10);
//        fori..
//        sayHiByArray(doctors);
//        Student[] students = new Student[3];
//        students[0] = new Student("张三", 18, '男', 1001);
//        students[1] = new Student("李四", 28, '男', 1001);
//        students[2] = new Student("王五", 28, '男', 1001);
//        sayHiByArray(students);
            //fori..
//        Teacher t1 = new Teacher("小王",28,'男',10000000);
//        Teacher t2 = new Teacher("大王",28,'男',10000000);
//        Teacher t3 = new Teacher("老王",28,'男',10000000);
//        Teacher t4 = new Teacher("王",28,'男',10000000);
//        Doctor d1 = new Doctor("老李",38,'男',10);
//        Doctor d2 = new Doctor("老李",38,'男',10);
//        Doctor d3 = new Doctor("老李",38,'男',10);
//        Student s1 = new Student("老李",38,'男',1001);
//        Student s2 = new Student("老李",38,'男',1001);
//        Student s3 = new Student("老李",38,'男',1001);
//        System.out.println(s3.name);
//        System.out.println(s3.age);
//        System.out.println(s3.sex);
//        System.out.println(s3.stuId);
//        Teacher t1 = new Teacher(); //创建一个老师对象 赋值给t1
//        t1.name = "";   //继承有
//        t1.age = 18;    //继承有
//        t1.sex = '女';   //继承有
//        t1.salary = 100000; //特有
//        t1.eat();//吃的方法  继承有
//        t1.teach();//教的方法  特有
//        Doctor d1 = new Doctor();//创建一个医生对象
//        d1.name = "";
//        d1.age = 11;
//        d1.sex = 'A';
//        d1.level = 11;
//        t1.eat();
//        t1.teach();
//
//        Person p1 = new Person();
//        p1.name = ""; //父类只能访问自己的内容
//        p1.age = 11;//父类只能访问自己的内容
//        p1.sex = 'B';//父类只能访问自己的内容
////        p1.stuId = 1; 无法访问子类的！
////        p1.salary = 1;
////        p1.level = 1;
    }
   static void sayHiByArray(Person[] pp){
        for (int i = 0; i < pp.length; i++) {
            pp[i].sayHi();
        }
    }
}
