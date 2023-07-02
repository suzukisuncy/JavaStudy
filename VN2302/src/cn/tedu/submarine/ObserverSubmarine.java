package cn.tedu.submarine;

import javax.swing.*;

/**
 * 侦察潜艇类
 */
public class ObserverSubmarine extends SeaObject implements EnemyScore{

    public ObserverSubmarine() {
        super(63, 19);
    }

    @Override
    public void step() {
        x += speed;
    }

    @Override
    protected ImageIcon getImage() {
        if (isLive()) {//判断的是当前调用方法的侦察潜艇对象 是否是活着的状态
            return ImageResources.obsersubm;//满足返回侦察潜艇图片
        }
        return null;//代码若能执行到这一行,则return null
    }
    @Override
    public int getScore() {
        return 10;
    }
}
