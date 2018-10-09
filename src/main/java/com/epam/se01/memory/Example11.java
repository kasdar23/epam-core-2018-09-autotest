package com.epam.se01.memory;

public class Example11 {

    // STRING_POOL
    // "abc"          <- str1 <- str2



    // HEAP
    // "abc"

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());


        String str1 = "abc";

        String str2 = "a" + "bc";

        System.out.println(str1 == str2);


        int[] values = {1, 2, 3};

    }
}
