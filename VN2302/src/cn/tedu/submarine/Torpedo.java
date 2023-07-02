package cn.tedu.submarine;

import javax.swing.*;

/**
 *鱼雷类
 */
public class Torpedo  extends SeaObject{


    public Torpedo(int x,int y){
        super(5,18,x,y,2);
    }
    @Override
    public void step() {
        y -= speed;
    }
    @Override
    protected ImageIcon getImage() {
        if(isLive()){//判断的是当前调用方法的鱼雷对象 是否是活着的状态
            return ImageResources.torpedo;//满足返回鱼雷图片
        }
        return null;//代码若能执行到这一行,则return null
    }

    @Override
    public boolean isOutBounds() {//鱼雷的越界方法标准重写。
        return this.y <= -this.height; //鱼雷的判断标准 ---鱼雷升到窗口上方时。
    }

}
