package com.lx;

/**
 * @author Werdio丶
 * @since 2020-06-11 15:42:48
 */
@SuppressWarnings("all")
public class 与或 implements Runnable {

    public static void main(String[] args) {
        final String b = new String("3333");
        float a = 1;
        a = a + 1;
        System.out.println(a);

        if (1 == 7 && 3 == 3){
            System.out.println("ggggg");
        }
    }

    @Override
    public void run() {

    }
}
