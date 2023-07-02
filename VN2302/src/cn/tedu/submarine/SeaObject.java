package cn.tedu.submarine;

import javax.swing.*;
import java.awt.*;

/**
 * 海洋对象类：
 * 放7个模板类中共有的属性和行为
 */
public abstract class SeaObject {
    public static final int LIVE = 0;//活着的状态
    public static final int DEAD = 1;//死亡的状态
    public int currentState = LIVE;//默认是活着的状态

    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;

    /**
     * 该构造方法是为三种潜艇类提供的有参构造方法
     * 因为三种潜艇的宽高各不同,所以做成形式参数,由具体调用该构造方法的潜艇类传递具体的对应的宽高数据！
     */
    protected SeaObject(int width, int height) {
        this.width = width;
        this.height = height;
        this.x = -width;
        this.y = (int) (Math.random() * (GameWorld.HEIGHT - height - 150) + 150);//随机产生y值在海平面 ~ 屏幕内区间 给当前对象
        this.speed = (int) (Math.random() * (3 - 1) + 1); // 随机两种速度
    }

    /**
     * 该构造方法是专门为战舰类/炸弹类/水雷,鱼雷类提供的构造方法
     * 因为这4个类要赋值的内容不同,则做成5个形式参数的构造方法
     * 具体数据由调用的类来传递即可！
     */
    protected SeaObject(int width, int height, int x, int y, int speed) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public boolean isLive() {
        return currentState == LIVE;//判断当前对象的状态是否是活着的状态
    }

    public boolean isDead() {
        return currentState == DEAD;//判断当前对象状态是否是死亡的状态
    }

    protected abstract void step();//抽象方法

    protected abstract ImageIcon getImage();//抽象的获取图片的方法 由子类实现该行为细节

    /**
     * 为所有子类提供的绘制的行为方法,谁需要绘制,谁调用该方法
     */
    public void paintImage(Graphics g) {
        ImageIcon icon = this.getImage();//获取当前调用方法对象的图片
        if (icon != null) {//如果icon中存的图片对象不为空
            icon.paintIcon(null, g, this.x, this.y);//根据对象提供的坐标进行绘制
        }
    }

    /**
     * 发射雷对象的方法,由雷入场的方法进行调用
     * 如果是水雷潜艇对象调用该方法 则返回水雷对象
     * 如果是鱼雷潜艇对象调用该方法 则返回鱼雷对象
     * 如果是侦察潜艇对象调用该方法 则返回null
     */
    public SeaObject shootThunder() {
        int x = this.x + this.width;
        int y = this.y - 5;
        //判断类型的语法：instanceof
        if (this instanceof MineSubmarine) { //判断当前对象是不是 MineSubmarine类型
            return new Mine(x, y);
        } else if (this instanceof TorpedoSubmarine) {//判断当前对象是不是 TorpedoSubmarine类型
            return new Torpedo(x, y);
        } else {
            return null;//代码执行到这行,则表示当前调用方法的对象是侦察潜艇 返回null
        }
    }

    /**
     * 判断对象是否越界的方法
     * 因为三个潜艇类越界标准是一样的,所以也可以做成普通方法让所有潜艇类复用
     * 剩下的炸弹类,鱼雷类,水雷类不适用则 自行进行重写实现！
     */
    public boolean isOutBounds() {
        return this.x >= GameWorld.WIDTH;
    }

    /**
     * 供子类使用的碰撞检测的方法
     */
    public boolean isHit(SeaObject other) {
        int x1 = this.x - other.width;
        int x2 = this.x + this.width;
        int y1 = this.y - other.height;
        int y2 = this.y + this.height;
        int x = other.x;//将传入参与碰撞对象的x 赋值给 x
        int y = other.y;//将传入参与碰撞对象的y 赋值给 y
        return (x >= x1 && x <= x2) &&(y >= y1 && y <= y2);
    }

    public void goDead(){//谁调用我,谁标记为死亡状态
        this.currentState = DEAD;
    }

}
