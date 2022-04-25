package com.company;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author 杨添成
 * @Date 2022/3/21 21:02
 * @Version 1.0
 */
//双重检查锁实现单例模式
public class Singleton {
    //声明SingleTon类型的变量
    private volatile static Singleton instance;

    //私有化构造
    private Singleton(){}

    //创建提供对访问的方法
    public static Singleton getInstance(){
        if (null==instance){
            synchronized (Singleton.class){
                if (null==instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
