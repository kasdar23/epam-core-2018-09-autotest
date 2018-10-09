package com.epam.se01;

import java.lang.reflect.Field;

public class First {

	public static void main(String[] args) throws InterruptedException {
//		for (int i = 0; i < args.length; ++i) {
//            System.out.println(args[i]);
//		}

        for (String arg : args) {
            if (arg.length() > 2) {
                System.out.println(arg);
            }
        }

        Thread.sleep(60_000);
	}
}
