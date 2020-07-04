package com.lx;

/**
 * @author Werdio丶
 * @since 2020-07-04 10:35:17
 */
public class Father {

    public Father(){
        System.out.println("父类构造器");
    }



    public int num = 4;

    public static int age = test1();

    {
        System.out.println("父类普通代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }



    public int test2() {
        System.out.println("父类普通方法");
        return 0;
    }

    public static int test1() {
        System.out.println("父类静态方法");
        return 0;
    }


    public static void main(String[] args) {
        Father father = new Father();
        System.out.println("------------------------------");
        Father father1 = new Father();
    }
}
