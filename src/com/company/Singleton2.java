package com.company;

/**
 * @ClassName Singleton2
 * @Description TODO
 * @Author 杨添成
 * @Date 2022/3/18 0:16
 * @Version 1.0
 */
public class Singleton2 {
    private volatile static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        if (null==instance){
            synchronized (Singleton2.class){
                if (instance == null){
                    instance= new Singleton2();                }
            }
        }return instance;
    }
}
