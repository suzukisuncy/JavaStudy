package cn.tedu.submarine;

/**
 * 加分的接口
 * 提供加分的行为  -----由侦察潜艇,鱼雷潜艇实现
 */
public interface EnemyScore {
    int getScore();//由具体实现类来重写该返回的分数
}
