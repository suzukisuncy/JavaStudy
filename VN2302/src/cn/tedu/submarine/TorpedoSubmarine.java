package cn.tedu.submarine;

import javax.swing.*;

/**
 * 鱼雷潜艇类
 */
public class TorpedoSubmarine  extends SeaObject implements EnemyScore{
    public TorpedoSubmarine() {
        super(64,20);
    }
    @Override
    public void step() {
        x += speed;
    }
    @Override
    protected ImageIcon getImage() {
        if(isLive()){//判断的是当前调用方法的鱼雷潜艇对象 是否是活着的状态
            return ImageResources.torpesubm;//满足返回鱼雷潜艇图片
        }
        return null;//代码若能执行到这一行,则return null
    }

    @Override
    public int getScore() {
        return 40;
    }
}
