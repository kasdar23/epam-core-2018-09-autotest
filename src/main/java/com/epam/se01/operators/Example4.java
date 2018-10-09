package com.epam.se01.operators;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class Example4 {

    public static void main(String[] args) {
        Float val1 = 0f / 0f;
        Float val2 = 0f / 0f;
        Float val3 = Float.NaN;
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val1 == val2);
        System.out.println(val2.equals(val3));


        System.out.println(val1.equals(Float.NaN));
        System.out.println(Float.isNaN(val1));
        System.out.println(Float.isInfinite(val1));
        System.out.println(val1 > 0);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(abs(PI * 3 - PI));
    }
}
