package com.company;

/**
 * @ClassName LazySingleTon
 * @Description TODO
 * @Author 杨添成
 * @Date 2022/3/17 18:45
 * @Version 1.0
 */
//双重检查锁
public class LazySingleTon {
    //声明LazySingleTon类型的变量
    private volatile static LazySingleTon instance;
    //构造方法私有化、防止被
    private LazySingleTon(){}
    //创建提供对访问的方法
    public static LazySingleTon getInstance(){
        if (null==instance){
            synchronized(LazySingleTon.class){
                if (null==instance){
                    instance=new LazySingleTon();
                }
            }
        }
        return instance;
    }
}
