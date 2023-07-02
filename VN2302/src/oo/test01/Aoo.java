package oo.test01;

/**
 * 访问修饰符测试:
 * public   : 当前类/同包类/子类/非同包类
 * protected: 当前类/同包类/子类
 * 默认的    : 当前类/同包类
 * private  : 当前类
 */
public class Aoo {
    public int a; //公开
    protected int b;//保护
    int c;//默认
    private int d;//私有的
    void test() {
        a = 1;//当前类可见
        b = 2;//当前类可见
        c = 3;//当前类可见
        d = 4;//当前类可见
    }
}
class Boo{ //同包类
    void test(){
        Aoo aoo = new Aoo();
        aoo.a = 1;//同包类可见
        aoo.b = 2;//同包类可见
        aoo.c = 3;//同包类可见
//        aoo.d = 4;//私有成员同包类不可见
    }
}
