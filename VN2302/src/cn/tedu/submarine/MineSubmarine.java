package cn.tedu.submarine;

import javax.swing.*;

/**
 * 水雷潜艇类
 */
public class MineSubmarine extends SeaObject implements EnemyLife{
    public MineSubmarine() {
        super(63, 19);
    }
    @Override
    public void step() {
        x += speed;
    }
    @Override
    protected ImageIcon getImage() {
        if (isLive()) {//判断的是当前调用方法的水雷潜艇对象 是否是活着的状态
            return ImageResources.minesubm;//满足返回水雷潜艇图片
        }
        return null;//代码若能执行到这一行,则return null
    }
    @Override
    public int getLife() {//重写加命的行为具体逻辑
        return 1;
    }
}
