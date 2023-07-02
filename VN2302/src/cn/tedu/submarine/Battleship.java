package cn.tedu.submarine;

import javax.swing.*;

/**
 * 战舰类:
 */
public class Battleship extends SeaObject {
    private int life;//战舰特有

    public int getLife() { //对外提供可以获取生命值的方法
        return life;
    }

    public void setLife(int life) {//对外提供可以累加生命值的方法
        if (life > 0) {
            this.life += life;
        }
    }

    public void subtractLife(){//减命的方法
        life--;
    }

    public Battleship() {//因为战舰只会存在一个对象,且一开始战舰各种数据 都是确定好的  所以做无参构造方法
        super(66, 26, 270, 124, 20);
        life = 5;
    }

    @Override
    public void step() {
        System.out.println("战舰类通过键盘左右运动...");
    }

    @Override       //战舰类的重写获取图片的方法
    protected ImageIcon getImage() {//因为战舰是玩家,如果玩家失败,游戏结束!没有必要判断是否是活着再决定返回图片操作.
        return ImageResources.battleship;
    }

    /**
     * 战舰类提供发射炸弹的行为方法
     */
    public Bomb shootBomb() {
        return new Bomb(x, y);//返回炸弹对象  位置在战舰对象的位置
    }

    public void moveLeft() { //左移
        x -= speed;
    }

    public void moveRight() {//右移
        x += speed;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "life=" + life +
                ", currentState=" + currentState +
                ", width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", speed=" + speed +
                '}';
    }
}
