package com.lx;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Werdio丶
 * @since 2020-06-15 07:51:05
 */
@SuppressWarnings("all")
public class 死锁 {

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    static class Task1 implements Runnable {

        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("任务1 lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            synchronized (lock2){
                System.out.println("任务1 lock2");
            }
        }
    }

    static class Task2 implements Runnable {

        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("任务2 lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (lock1){
                System.out.println("任务2 lock1");
            }
        }
    }

    public static void main(String[] args) {

        new Thread(new Task1()).start();
        new Thread(new Task2()).start();
    }
}
