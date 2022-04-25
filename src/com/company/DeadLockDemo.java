package com.company;

/**
 * @ClassName DeadLockDemo
 * @Description TODO
 * @Author 杨添成
 * @Date 2022/3/21 20:50
 * @Version 1.0
 */
public class DeadLockDemo {
    private static Object resource1 = new Object();//资源1
    private static Object resource2 = new Object();//资源2

    public static void main(String[] args) {
        new Thread(()->{
            synchronized(resource1){
                System.out.println(Thread.currentThread()+"get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+"wait resource2");
                synchronized (resource2){
                    System.out.println(Thread.currentThread()+"get resource2");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (resource2){
                System.out.println(Thread.currentThread()+"get resource2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+"wait resource1");
                synchronized(resource1){
                    System.out.println(Thread.currentThread()+"get resource1");
                }
            }
        }).start();
    }
}
