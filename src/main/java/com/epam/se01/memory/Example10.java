package com.epam.se01.memory;

public class Example10 {

    public static void main(String[] args) {
        String[] str = {"123"};
        System.out.println("Before:" + str[0]);
        changeDate(str);
        System.out.println("After:" + str[0]);
    }

    public static void changeDate(String[] str) {
        System.out.println("	- before change: "+ str[0]);
        str[0] = "aaa";
        System.out.println("	- after change: " + str[0]);
    }
}
