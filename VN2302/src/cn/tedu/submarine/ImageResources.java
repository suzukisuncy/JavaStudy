package cn.tedu.submarine;


import javax.swing.*;

/**
 * 图片资源类：
 * 存放加载项目中所需要用到的图片资源
 */
public class ImageResources {
    // ImageIcon图片类型  可以存图片资源的一种类型
    public static ImageIcon battleship;  //声明一个用来存战舰图片的 图片类型的变量
    public static ImageIcon bomb;       //声明一个用来存炸弹图片的 图片类型的变量
    public static ImageIcon gameover;   //声明一个用来存游戏结束图片的 图片类型的变量
    public static ImageIcon mine;       //声明一个用来存水雷图片的 图片类型的变量
    public static ImageIcon minesubm;   //声明一个用来存水雷潜艇图片的 图片类型的变量
    public static ImageIcon obsersubm;  //声明一个用来存侦察潜艇图片的 图片类型的变量
    public static ImageIcon sea;        //声明一个用来存海洋图背景图片的 图片类型的变量
    public static ImageIcon start;      //声明一个用来存游戏开始图片的 图片类型的变量
    public static ImageIcon torpedo;    //声明一个用来存鱼雷图片的 图片类型的变量
    public static ImageIcon torpesubm;  //声明一个用来存鱼雷潜艇图片的 图片类型的变量

    static { //静态代码块
        battleship = new ImageIcon("img/battleship.png");
        bomb = new ImageIcon("img/bomb.png");
        gameover = new ImageIcon("img/gameover.png");
        mine = new ImageIcon("img/mine.png");
        minesubm = new ImageIcon("img/minesubm.png");
        obsersubm = new ImageIcon("img/obsersubm.png");
        sea = new ImageIcon("img/sea.png");
        start = new ImageIcon("img/start.png");
        torpedo = new ImageIcon("img/torpedo.png");
        torpesubm = new ImageIcon("img/torpesubm.png");
    }

//    public static void main(String[] args) {
//        //getImageLoadStatus(); 获取图片状态  ---- 8 没问题   ---- 4有问题
//        System.out.println(battleship.getImageLoadStatus());
//        System.out.println(bomb.getImageLoadStatus());
//        System.out.println(gameover.getImageLoadStatus());
//        System.out.println(mine.getImageLoadStatus());
//        System.out.println(minesubm.getImageLoadStatus());
//        System.out.println(obsersubm.getImageLoadStatus());
//        System.out.println(sea.getImageLoadStatus());
//        System.out.println(start.getImageLoadStatus());
//        System.out.println(torpedo.getImageLoadStatus());
//        System.out.println(torpesubm.getImageLoadStatus());
//    }

}
