package com.lx;

/**
 *   0 iconst_1
 *   1 istore_1
 *   2 iload_1
 *   3 iinc 1 by 1
 *   6 istore_1
 *   7 iload_1
 *   8 iinc 1 by 1
 *  11 istore_2
 *  12 iload_1
 *  13 iinc 1 by 1
 *  16 iload_1
 *  17 iload_1
 *  18 iinc 1 by 1
 *  21 imul
 *  22 iadd
 *  23 iload_2
 *  24 iinc 2 by 1
 *  27 iadd
 *  28 istore_3
 *
 * @author Werdio丶
 * @since 2020-07-04 07:18:03
 */
public class 自增 {

    public static void main(String[] args) {

        int i = 1;

        i = i++;        // i = 1
        int j = i++;    // j = 1, i = 2
        int k = i + ++i * i++ + j++;

        System.out.println("i = " + i);     // 4
        System.out.println("j = " + j);     // 2
        System.out.println("k = " + k);     // 12
    }
}
