package com.lx;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Werdio丶
 * @since 2020-06-21 17:32:56
 */
public class ArrayListTest {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(5);
//
//
//         list.add(1);
//
//        list.forEach(System.out::println);
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 2);

        System.out.println(map.size());
    }
}
