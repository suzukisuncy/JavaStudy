package oo.day02;

/**
 * 学生模板类
 */
public class Student extends Person{
    int stuId;//特有 学号

    Student(String name,int age,char sex,int stuId){
        super(name, age, sex);
        this.stuId = stuId;
    }
    void study(){

    }

    @Override
    void sayHi() {//学生类重写父类中的sayHi
        System.out.println("你好,我叫：" + name + "今年:" + age + "岁了,我的性别是:" + sex+"我的学号是:"+stuId);
    }
}
