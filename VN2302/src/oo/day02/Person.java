package oo.day02;

/**
 * 人类
 * 学生类,老师类,医生类中共有的属性和行为
 */
public class Person {
    String name;
    int age;
    char sex;

    Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void eat() {//吃的行为

    }

    void sayHi() {
        System.out.println("你好,我叫：" + name + "今年:" + age + "岁了,我的性别是:" + sex);
    }
}
