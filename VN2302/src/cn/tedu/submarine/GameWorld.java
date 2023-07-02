package cn.tedu.submarine;

import javax.swing.*;
import java.awt.*;

import java.util.Arrays;
import java.util.TimerTask;//任务模板类
import java.util.Timer;//定时器类

import java.awt.event.KeyEvent;//键盘事件
import java.awt.event.KeyAdapter;//键盘侦听器

/**
 * 游戏窗口(运行)类:
 */
public class GameWorld extends JPanel {

    public static final int WIDTH = 641;
    public static final int HEIGHT = 479;
    public static final int GAME_START = 0;//开始状态
    public static final int GAME_RUNNING = 1;//运行状态
    public static final int GAME_OVER = 2;//结束状态

    public int currentGameStates = GAME_START;//默认就是开始状态

    //全局变量
    private Battleship ship = new Battleship();
    private Bomb[] bombs = {};
    private SeaObject[] submarine = {};//代表三种不同的潜艇
    private SeaObject[] thunder = {};//代表两种不同的雷
    //为数组赋值一个{} 则表示为该数组创建对应的数组对象,但是该数组对象长度为0

    /**
     * 创建潜艇对象的方法,该方法由潜艇入场的方法调用
     * 因为这个方法可以能随机返回某一种潜艇对象
     * 返回值类型写父类型
     */
    private SeaObject createSubmarine() {
        //1.产生 0 ~ 20 区间的随机整数 并接收
        //2.判断该随机数是否小于10  若满足 则返回侦察潜艇对象
        //  否则如果判断该随机数是否小于15 若满足 则返回鱼雷察潜艇对象
        //  否则 返回水雷察潜艇对象
        int type = (int) (Math.random() * 20);//1.
        if (type < 10) {//判断该随机数是否小于10
            return new ObserverSubmarine();//则返回侦察潜艇对象
        } else if (type < 15) {//判断该随机数是否小于15
            return new TorpedoSubmarine();//返回鱼雷察潜艇对象
        } else {
            return new MineSubmarine();//返回水雷潜艇对象
        }
    }

    private int submarineEnterIndex = 0;//控制潜艇生成速度的变量

    /**
     * 潜艇入场的方法  ------在run中调用
     */
    private void submarineEnterAction() { //10ms被调用一次
        /**
         *用创建潜艇的方法  获取到一个潜艇对象(随机)1.
         *将submarine潜艇数组扩1个容量
         *将获取到的潜艇对象赋值给扩容后的数组位置
         */
        submarineEnterIndex++;
        if (submarineEnterIndex % 40 == 0) {//每隔400毫秒执行一次生成
            SeaObject obj = createSubmarine();//1
            submarine = Arrays.copyOf(submarine, submarine.length + 1);//2
            submarine[submarine.length - 1] = obj;//3
        }
    }

    private int thunderEnterIndex = 0;//控制雷生成速度的变量

    /**
     * 雷入场的方法  ----在run中调用
     */
    private void thunderEnterAction() {//每10ms每调用一次
        /**
         *1循环遍历潜艇数组并调用数组中的每个对象的shootThunder方法 接收 获取一个雷对象
         * 如果雷对象不为空,则执行2,3
         *2 将thunder数组扩1个容量
         *3将雷对象赋值给扩容后的位置
         */
        thunderEnterIndex++;
        if (thunderEnterIndex % 100 == 0) {//每隔1000毫秒执行一次：遍历潜艇数组并发射雷的逻辑
            for (int i = 0; i < submarine.length; i++) {
                SeaObject obj = submarine[i].shootThunder();
                if (obj != null) {
                    thunder = Arrays.copyOf(thunder, thunder.length + 1);
                    thunder[thunder.length - 1] = obj;
                }
            }
        }
    }

    /**
     * 用来处理所有自动移动的操作  -----在run中调用
     */
    private void stepAction() {
        /**循环遍历潜艇数组中每个对象,并调用每个对象的step方法
         - 循环遍历雷数组中每个对象,并调用每个对象的step方法
         - 循环遍历炸弹数组中每个对象,并调用每个对象的step方法
         */
        for (int i = 0; i < submarine.length; i++) {
            submarine[i].step();
        }
        for (int i = 0; i < thunder.length; i++) {
            thunder[i].step();
        }
        for (int i = 0; i < bombs.length; i++) {
            bombs[i].step();
        }
    }

    /**
     * 炸弹入场的方法  -----在按下空格键的if语句中调用
     */
    private void bombEnterAction() {
        /**
         *1 通过战舰对象调用shootBomb方法,接收炸弹对象
         *2为bomb数组扩1容量
         *3将炸弹对象装载到bomb数组扩容后的位置
         */
        Bomb obj = ship.shootBomb();//1.
        bombs = Arrays.copyOf(bombs, bombs.length + 1);//2
        bombs[bombs.length - 1] = obj;//3
    }

    public SeaObject[] deleteObjectByArray(SeaObject[] seaObjects) { //在数组中删除对象的方法
        for (int i = 0; i < seaObjects.length; i++) {
            if (seaObjects[i].isOutBounds() || seaObjects[i].isDead()) {//判断当前潜艇对象是否越界
                seaObjects[i] = seaObjects[seaObjects.length - 1];//将数组最后一个元素覆盖赋值给当前越界对象
                seaObjects = Arrays.copyOf(seaObjects, seaObjects.length - 1);//缩容
            }
        }
        return seaObjects;//将缩容后的数组对象 返回出去
    }

    private void deleteOfOutBounds() {
        /**
         *1.循环遍历潜艇数组中每个对象,并调用每个对象的isOutBounds方法, if(submarine[i].isOutBounds)
         * {  需要处理删除当前越界对象的逻辑}
         *2.循环遍历雷数组中每个对象,并调用每个对象的isOutBounds方法,
         * if(thunder[i].isOutBounds){  需要处理删除当前越界对象的逻辑}
         *3.循环遍历炸弹数组中每个对象,并调用每个对象的isOutBounds方法,
         *if(bombs[i].isOutBounds){  需要处理删除当前越界对象的逻辑}
         * 缩容逻辑,将当前越界对象与当前数组最后一个元素交换,然后实现缩容。
         */
//        for (int i = 0; i < submarine.length; i++) {
//            if (submarine[i].isOutBounds() || submarine[i].isDead()) {//判断当前潜艇对象是否越界
//                submarine[i] = submarine[submarine.length - 1];//将数组最后一个元素覆盖赋值给当前越界对象
//                submarine = Arrays.copyOf(submarine, submarine.length - 1);//缩容
//            }
//        }
//        for (int i = 0; i < thunder.length; i++) {
//            if (thunder[i].isOutBounds() || thunder[i].isDead()) {
//                thunder[i] = thunder[thunder.length - 1];
//                thunder = Arrays.copyOf(thunder, thunder.length - 1);
//            }
//        }
//        for (int i = 0; i < bombs.length; i++) {
//            if (bombs[i].isOutBounds() || bombs[i].isDead()) {
//                bombs[i] = bombs[bombs.length - 1];
//                bombs = Arrays.copyOf(bombs, bombs.length - 1);
//            }
//        }
        //接收该方法产生的新的数组对象赋值给源数组
        submarine = deleteObjectByArray(submarine);//调用在数组中删除对象的方法,传入潜艇数组
        thunder = deleteObjectByArray(thunder);//调用在数组中删除对象的方法,传入雷数组
        bombs = (Bomb[]) deleteObjectByArray(bombs);//调用在数组中删除对象的方法,传入炸弹数组
    }

    /**
     * 实现炸弹与潜艇的碰撞检测
     */
    private void bombBangAction() {
        for (int i = 0; i < bombs.length; i++) {//轮数的循环
            Bomb b = bombs[i];//存储当前轮的炸弹对象
            for (int j = 0; j < submarine.length; j++) {//次数的循环
                if (b.isHit(submarine[j])) {//拿当前轮的炸弹对象依次与潜艇数组的每个对象去检测
                    b.goDead();  //标记死亡状态
                    submarine[j].goDead();//标记死亡状态
                    //加分加命
                    //依赖倒置原则: 核心逻辑代码,尽可能依赖抽象(抽象类,接口)而非实现(具体子类)!
                    if (submarine[j] instanceof EnemyScore) {//如果当前潜艇对象实现了加分的接口!
                        EnemyScore obj = (EnemyScore) submarine[j];//将当前类型转换为接口类型
                        score += obj.getScore();//调用父执行子
                    } else if (submarine[j] instanceof EnemyLife) {//如果当前潜艇对象实现了加命的接口!
                        EnemyLife obj = (EnemyLife) submarine[j];//将当前类型转换为接口类型
                        ship.setLife(obj.getLife());//调用父执行子
                    }
//                    //1.判断当前潜艇对象是哪个类型?  侦查潜艇,鱼雷潜艇加分   水雷潜艇加命
//                    if(submarine[j] instanceof  ObserverSubmarine){//判断对象是否是侦查潜艇
//                        //代表submarine[j] 这个对象是侦查潜艇类型
//                        //但是submarine[j] 这个类型现在SeaObject,需要转换成具体的侦查潜艇类型才能调用getScore方法
//                        ObserverSubmarine os = (ObserverSubmarine) submarine[j];
//                        score += os.getScore();//加10分
//                    }else if(submarine[j] instanceof TorpedoSubmarine ){//判断对象是否是鱼雷
//                        TorpedoSubmarine ts = (TorpedoSubmarine) submarine[j];
//                        score += ts.getScore();//加40分
//                    }else if(submarine[j] instanceof MineSubmarine ){//判断对象是否是鱼雷
//                        MineSubmarine ms = (MineSubmarine) submarine[j];
//                        ship.setLife(ms.getLife()); //加1命
//                    } //如果项目需要扩展:又来了三种潜艇, 2种加分,1种加命的,此时该位置代码的是否需要变???
//                    else if(submarine[j] instanceof XXSubmarine ){
//                        XXSubmarine ms = (XXSubmarine) submarine[j];
//                        ship.setLife(ms.??()); //加1命
//                    }
//                    //如果项目需要扩展:又来了三种潜艇, 2种加分,1种加命的,此时该位置代码的是否需要变???
                }
            }
        }
    }

    /**
     * 雷与战舰的碰撞检测方法
     */
    private void thunderBangAction() {
        for (int i = 0; i < thunder.length; i++) {
            if (thunder[i].isHit(ship)) {//如果当前雷对象与战舰对象撞上了
                thunder[i].goDead();//将当前雷对象标记为死亡状态
                ship.subtractLife();//战舰减命
                checkGameOver();//检测游戏是否结束
            }
        }
    }

    private void checkGameOver() {
        if (ship.getLife() <= 0) {//如果战舰命数小于或等于0
            currentGameStates = GAME_OVER;//切换游戏结束状态
        }
    }

    private void action() {
        //侦听用户是否按下键盘!
        //1.创建侦听器对象  2.侦听当按下键盘的方法
        KeyAdapter adapter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//当按下键盘的方法---在方法中写当按下后响应的逻辑
//                e.getKeyCode() 获取用户当前按下的键盘
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {//获取按下的键盘码 与 KeyEvent.VK_SPACE 判等
                    if (currentGameStates == GAME_START) {//如果当前游戏状态是开始状态
                        currentGameStates = GAME_RUNNING;//切换当前状态为运行状态
                    } else {//否则
                        bombEnterAction();//调用炸弹入场的方法
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {//判断用户是否按下左键  ←
                    ship.moveLeft(); //调用战舰的左移方法
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { //判断用户是否按下右键 →
                    ship.moveRight(); //调用战舰的右移方法
                }
            }
        };
        addKeyListener(adapter);//将侦听器对象 添加在键盘检测当中
        Timer timer = new Timer();//创建定时器对象
        //目的：就是想要重写TimeTask抽象类中的run方法..
        TimerTask task = new TimerTask() {
            @Override
            public void run() {//在run方法中,则是需要执行的代码编写位置
                if (currentGameStates == GAME_RUNNING) {//------判断当前状态是否是运行状态
                    submarineEnterAction();//调用潜艇入场的方法
                    thunderEnterAction();//调用雷入场的方法
                    stepAction();//调用自动移动的方法
                    bombBangAction();//调用炸弹与潜艇碰撞检测的方法
                    thunderBangAction();//调用雷与战舰碰撞检测方法
                    deleteOfOutBounds();//调用删除越界对象的方法
                    repaint();//重新刷新绘制
                }
            }
        };
        //schedule执行方法：1.具体任务 2.延时时间(毫秒) 3.据下次执行的间隔时间(毫秒)
        timer.schedule(task, 3000, 10);//0.01s执行一次
    }

    /**
     * 绘制窗口的方法  ---- 在main中调用
     */
    private void paintWorld() {
        JFrame j = new JFrame();//创建画框对象
        this.setFocusable(true);//窗口可聚焦
        j.add(this);//画框添加底板
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗口关闭并停止程序
        j.setSize(WIDTH + 16, HEIGHT + 39);//窗口大小
        j.setLocationRelativeTo(null);//设置窗口居中
        j.setVisible(true);//启动窗口
    }

    private int score = 0;//分数

    @Override       //重写底板类中提供的绘制的方法,在方法中实现自己的绘制图片的逻辑
    //该方法不需要我们执行
    public void paint(Graphics g) { // g ---理解为画笔
//        //从程序的设计角度讲,不应该在使用地方暴露细节!
//        //绘制战舰图片在窗口中:  1.获取到战舰图片  2.根据战舰对象的坐标绘制在窗口中的位置
//        ImageIcon icon = ImageResources.battleship;//获取战舰图片存给icon变量
//        icon.paintIcon(null,g,270, 124);// null,g,x,y
        switch (currentGameStates) {
            case GAME_START://如果当前状态是开始状态
                ImageResources.start.paintIcon(null, g, 0, 0);//绘制开始图片
                break;
            case GAME_RUNNING://如果当前状态是运行状态
                ImageResources.sea.paintIcon(null, g, 0, 0);//绘制背景图片
                ship.paintImage(g);
                for (int i = 0; i < bombs.length; i++) {
                    bombs[i].paintImage(g);
                }
                for (int i = 0; i < submarine.length; i++) {
                    submarine[i].paintImage(g);
                }
                for (int i = 0; i < thunder.length; i++) {
                    thunder[i].paintImage(g);
                }
                g.setFont(new Font("", Font.BOLD, 20));//设置画笔加粗和大小
                g.drawString("SCORE:" + score, 200, 50);
                g.drawString("LIFE:" + ship.getLife(), 400, 50);
                break;
            case GAME_OVER://如果当前状态是结束状态
                ImageResources.gameover.paintIcon(null, g, 0, 0);//绘制结束图片
                break;
        }
    }


    public static void main(String[] args) {
        GameWorld gw = new GameWorld();
        gw.paintWorld();//调用绘制窗口方法
        gw.action();//通过对象来调用action方法.
    }
}

/**
 * 1.为什么要将各类型变量的声明放在main的外部?
 * 答:因为main是一个方法,在方法中声明的变量只能在该方法中使用,但后期该类中很多功能方法都需要用到这些对象,
 * 所有将各类型变量声明的工作 放在类中,做成全局变量.
 * 2.为什么要单独写一个action方法,来进行创建对象?
 * 答:因为main是static标记的方法,比较特殊,是无法直接访问类中的普通成员(全局变量/普通方法)等,所以单独做一个
 * 普通方法,在普通方法中完成创建对象的工作.
 * 3.为什么要在main中创建GameWorld类对象调用action方法?
 * 答:因为main是static标记的方法,比较特殊,是不能直接访问类中的普通成员(全局变量/普通方法)等,我们通过
 * 创建当前类对象的形式,通过对象打点调用action方法也可以.
 */
