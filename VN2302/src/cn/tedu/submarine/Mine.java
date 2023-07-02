package cn.tedu.submarine;

import javax.swing.*;

/**
 * 水雷类
 */
public class Mine extends SeaObject {

    public Mine(int x, int y) {//水雷类的构造方法
        super(11, 11, x, y, 2);
    }

    @Override
    public void step() {
        y -= speed;
    }

    @Override
    protected ImageIcon getImage() {
        if (isLive()) {//判断的是当前调用方法的水雷对象是否是活着的状态
            return ImageResources.mine;//满足水雷图片
        }
        return null;//代码若能执行到这一行,则return null

    }

    @Override
    public boolean isOutBounds() {//水雷类的重写
        return this.y <= 150 - this.height;//水雷的越界标准  ---出水平面的标准
    }
}
