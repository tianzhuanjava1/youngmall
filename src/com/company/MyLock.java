package com.company;

/**
 * @ClassName MyLock
 * @Description TODO
 * @Author 杨添成
 * @Date 2022/3/19 23:14
 * @Version 1.0
 */
public class MyLock{
    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
            System.out.println("线程一");
        }, "Thread1");


        Thread t2 = new Thread(() -> {
            System.out.println("线程二");
        }, "线程二");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread()+"线程三,这不就实现了");
            }
        });
        t2.start();
        t1.start();
        t3.start();
    }
}
