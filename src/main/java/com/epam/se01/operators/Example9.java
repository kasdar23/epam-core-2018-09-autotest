package com.epam.se01.operators;

public class Example9 {

    public static void main(String[] args) {
        String stringValue = "10";

        double doubleValue = Double.valueOf(stringValue);
        float floatValue = Float.valueOf(stringValue);
        int intValue = Integer.valueOf(stringValue);
        System.out.println(intValue);
        System.out.println(Integer.parseInt(stringValue, 16));

        String anotherStringVal = String.valueOf(intValue);
        System.out.println(stringValue.equals(anotherStringVal));

//        String str = "" + intValue;
        String str = "" + 10;
        System.out.println(str);
//        str = String.valueOf(10) + String.valueOf(20);
        str = "1" + 10 + 20;
        System.out.println(str);
        str = 10 + 20 + "1";
        System.out.println(str);

        str = String.valueOf('a') + 10 + "bc";
        System.out.println(str);
    }
}
