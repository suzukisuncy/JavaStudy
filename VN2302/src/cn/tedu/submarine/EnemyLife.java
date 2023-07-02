package cn.tedu.submarine;

/**
 * 加命的接口：
 *  提供加命的行为    具体实现由水雷潜艇类实现该接口
 */
public interface EnemyLife {
    int getLife(); //由实现类来决定返回的逻辑
}
