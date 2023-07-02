package oo.day02;

/**
 * 老师模板类
 */
public class Teacher  extends Person{ //继承Person类中的内容
    double salary;//工资

    Teacher(String name,int age,char sex,double salary){
        super(name, age, sex);
       this.salary = salary;
    }

    void teach(){

    }
    @Override
    void sayHi() {//老师类重写父类中的sayHi
        System.out.println("你好,我叫：" + name + "今年:" + age + "岁了,我的性别是:" + sex+"我的工资是:"+salary);
    }
}
