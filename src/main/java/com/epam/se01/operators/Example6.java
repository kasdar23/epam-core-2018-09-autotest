package com.epam.se01.operators;

import java.util.ArrayList;

public class Example6 {

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
//
//        for (int i = 0; i < strings.length; ++i) {
//            String curr = strings[i];
//            System.out.println(curr);
//        }
//
//        for (String curr : strings) {
//            System.out.println(curr);
//        }

        boolean isFound = false;
        for (int i = 0; !isFound  && i < 100; ++i) {
            for (int j = 0; !isFound && j < 100; ++j) {
                for (int k = 0; k < 100; ++k) {
                    if (i + j + k > 3) {
                        System.out.println(i + " " + " " + j + " " + k);
                        isFound = true;
                    }
                    if (isFound) {
                        break;
                    }
                }
            }
        }

        loop: for (int i = 0; i < 100; ++i) {
            for (int j = 0; j < 100; ++j) {
                for (int k = 0; k < 100; ++k) {
                    if (i + j + k > 3) {
                        System.out.println(i + " " + " " + j + " " + k);
                        continue loop;
                    }
                }
            }
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
            if (i > 5) {
//                continue loop;
                continue;
            }
            System.out.println(i + 1);
        }
    }
}
