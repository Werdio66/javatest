package com.lx;

/**
 * @author Werdio丶
 * @since 2020-06-26 15:30:34
 */
public class Sington {

    private static Sington instance;

    private Sington(){}

    public static Sington getInstance(){

       /* if (instance == null){
            synchronized (Sington.class){
                if (instance == null){
                    instance = new Sington();
                }
            }
        }*/

        synchronized (Sington.class){
            if (instance == null){
                instance = new Sington();
            }
        }


        return instance;
    }

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        for (int i = 1; i <= 1000; i++) {
            int finalI = i;
            new Thread(() -> {
                System.out.println("线程 " + finalI + " - " + Sington.getInstance().hashCode());
            }).start();
        }

        System.out.println("耗时 ：" + (System.currentTimeMillis() - begin));
    }
}
