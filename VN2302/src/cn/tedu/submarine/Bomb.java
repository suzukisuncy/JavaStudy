package cn.tedu.submarine;

import javax.swing.*;

/**
 * 炸弹类
 */
public class Bomb extends SeaObject {

    //宽,高 确定   炸弹对象的xy坐标是多少,谁创建 谁负责
    public Bomb(int x, int y) {
        super(9, 12, x, y, 3);
    }

    @Override
    public void step() {
        y += speed;
    }

    @Override
    protected ImageIcon getImage() {//炸弹类重写getImage方法
        if (isLive()) {//判断当前调用方法的炸弹对象是否是活着的状态
            return ImageResources.bomb;//满足则返回炸弹图片
        }
        return null;//如果代码能执行到这一行,则表示当前对象一定是死亡状态 返回null(空)
    }
    @Override
    public boolean isOutBounds() {//炸弹重写越界标准方法
        return this.y >= GameWorld.HEIGHT; //炸弹的越界标准
    }
}
