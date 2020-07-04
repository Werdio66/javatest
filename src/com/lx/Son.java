package com.lx;

/**
 * @author Werdio丶
 * @since 2020-07-04 10:39:01
 */
public class Son extends Father {

    public int num = test2();
    public static int age = test1();

    public Son(){
        System.out.println("子类构造器");
    }

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类普通代码块");
    }

    public int test2() {
        System.out.println("子类普通方法");
        return 0;
    }

    public static int test1() {
        System.out.println("子类静态方法");
        return 0;
    }

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("---------------------------------");
        Son son1 = new Son();
    }
}
