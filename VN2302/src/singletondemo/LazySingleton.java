package singletondemo;

/**
 * 懒汉式单例实现演示:
 */
public class LazySingleton {
    public static void main(String[] args) {
        LazySingletonDemo.getInstance().工具();
    }
}
/**
 * 懒汉式实现:
 * 目的:不做静态工具方法,不希望外部创建对象,对外提供全局唯一的访问点
 * 1.私有化构造方法
 * 2.声明一个静态的当前类类型的变量用于存储该类对象
 * 3.对外提供一个全局的访问点来使用类的工具
 */
class LazySingletonDemo {
    private LazySingletonDemo() {
    } //1.
    private static LazySingletonDemo lazy;//2.
    public static LazySingletonDemo getInstance() { //3.
        if (lazy == null) {//如果lazy == null 说明第一次被使用
            lazy = new LazySingletonDemo();//赋值进去对象
        }
        return lazy;//返回对象
    }
    public void 工具() {
        System.out.println("一个工具执行了...");
    }
}
