package com.lx;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Werdio丶
 * @since 2020-06-13 07:15:05
 */
@SuppressWarnings("all")
public class 泛型 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // 类型擦除，编译后，只剩 List
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
//        list1.add("aa");
        // 使用反射可以添加不同类型的数据
        Method add = list1.getClass().getDeclaredMethod("add", Object.class);
        add.invoke(list1, "aaa");

        System.out.println(list1);
    }
}
