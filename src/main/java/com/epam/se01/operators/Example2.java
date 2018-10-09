package com.epam.se01.operators;

public class Example2 {

    public static void main(String[] args) {
        int value = 0;

        System.out.println(value | 0b0000001);

        /*
         * |  0  1
         *
         * 0  0  1
         * 1  1  1
         */

        value = 0b000000000000000000000011;
        System.out.println(value &= 0b000000000000000000000010);
        /*
         * &  0  1
         *
         * 0  0  0
         * 1  0  1
         */

        System.out.println(value ^ 0b11);
        /*
         * ^  0  1
         *
         * 0  0  1
         * 1  1  0
         */

        System.out.println(~1);

        System.out.println(1 << 2);

        System.out.println(-8 >> 1);
        System.out.println(-8 >>> 1);


        short i = -1; // 11111111_11111111
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        // 00000000_00111111
        System.out.println(0b00000000_00111111);
        System.out.println(i);
    }
}
