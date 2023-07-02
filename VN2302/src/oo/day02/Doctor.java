package oo.day02;

/**
 * 医生类
 */
public class Doctor  extends Person{
    int level;//职级

    Doctor(String name,int age,char sex,int level){
        super(name, age, sex);
        this.level = level;
    }

    void cut(){

    }
    @Override
    void sayHi() {//医生类重写父类中的sayHi
        System.out.println("你好,我叫：" + name + "今年:" + age + "岁了,我的性别是:" + sex+"我的职级是:"+level);
    }

}
