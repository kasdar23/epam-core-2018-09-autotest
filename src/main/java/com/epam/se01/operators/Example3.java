package com.epam.se01.operators;

public class Example3 {

    public static void main(String[] args) {
        if (left() & right()) {
            System.out.println("Here 1");
        }

        if (left() && right()) {
            System.out.println("Here 2");
        }

        if (left()) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }


        Number x = left() ? 1 : 3.5;
        System.out.println(x);
        System.out.println(left() ? "False" : right() ? "True" : "123");
    }

    public static boolean left() {
        System.out.println("Called left");
        return false;
    }

    public static boolean right() {
        System.out.println("Called right");
        return true;
    }
}
