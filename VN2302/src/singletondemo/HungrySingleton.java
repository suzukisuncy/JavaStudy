package singletondemo;

/**
 *饿汉式单例的使用演示类:
 */
public class HungrySingleton {
    public static void main(String[] args) {
//        HungrySingletonDemo h = new HungrySingletonDemo();
//        h.工具();
        HungrySingletonDemo hungry1 = HungrySingletonDemo.getInstance();
        HungrySingletonDemo hungry2 = HungrySingletonDemo.getInstance();
        System.out.println(hungry1 == hungry2);
        HungrySingletonDemo.getInstance().工具();
    }
}
/**
 * 饿汉式单例实现:
 * 目的:不做静态工具方法,不希望外部创建对象,对外提供全局唯一的访问点
 * 1.私有化构造方法,防止外部创建对象.
 * 2.在类中给自己创建对象.
 * 3.对外提供用户获取当前类对象的静态方法.
 */
class HungrySingletonDemo{
    private HungrySingletonDemo(){}//私有构造
    private static HungrySingletonDemo hungry = new HungrySingletonDemo();//创建对象
    public static HungrySingletonDemo getInstance(){//对外提供获取类实例的方法
        return hungry;//返回实例对象复用.
    }
    public void 工具(){
        System.out.println("工具方法执行了...");
    }
}