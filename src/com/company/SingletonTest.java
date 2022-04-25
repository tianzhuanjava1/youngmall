package com.company;

/**
 * @ClassName Singleton1
 * @Author 杨添成
 * @Date 2022/3/17 17:46
 * @Version 1.0
 */

//餓漢式
public class SingletonTest {
    private static SingletonTest instance = new SingletonTest();
    //私有構造方法
    private SingletonTest(){

    }
    public static SingletonTest getInstance(){
        return instance;
    }
}
