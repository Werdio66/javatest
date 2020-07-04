package com.lx;

import java.util.ArrayList;

/**
 * @author Werdio丶
 * @since 2020-07-04 19:23:47
 */
public class GCTest {

    byte[] bytes = new byte[1024 * 1024];

    public static void main(String[] args) {

        ArrayList<GCTest> list = new ArrayList<>();

        while (true){
            list.add(new GCTest());
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
