package oo.test02;

import oo.test01.Aoo;
public class Coo {
    void test(){
        Aoo aoo = new Aoo();
        aoo.a = 1; //公开的非同包可访问
//        aoo.b = 2; 保护的 非同包类不可访问
//        aoo.c = 3; 默认的 非同包类不可访问
//        aoo.d = 4; 私有的 非同包类不可访问
    }
}

class Doo extends Aoo{
    void test(){
        a = 1;//非同包子类 可以访问 公开权限
        b = 2;//非同包子类 可以访问 保护权限
//        c = 3;非同包子类 不可访问 默认权限
//        d = 4;非同包子类 不可访问 私有权限
    }
}
