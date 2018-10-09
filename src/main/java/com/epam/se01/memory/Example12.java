package com.epam.se01.memory;

import com.epam.se01.main.Student;

import java.util.Arrays;
import java.util.Collections;

public class Example12 {

    /**
     * 123
     */
    private static final String VERSION = "VERSION 1.0";

    /**
     *
     * @param args
     * @throws IllegalStateException
     * @throws IllegalArgumentException
     */
    public static void main(String[] args) throws IllegalStateException, IllegalArgumentException {
//        int[][] arr = {
//                {1, 2, 3},
//                {1, 2, 3}
//        };

        for (int value : getValues()) {
            System.out.println(value);
        }

        int[] values = {1, 2, 3};

        int[] clone = values.clone();

        values[0] = -1;
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(clone));


        Student[] students = {
                new Student("a", "a", 1),
                new Student("b", "b", 2)
        };

        Student[] clone1 = students.clone();
        clone1[0].setAge(3);

        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(clone1));
    }


    /**
     * Version = {@value Example12#VERSION}
     * @return
     */
    private static int[] getValues() {
        return new int[0];
    }

    /**
     * Редактируема ли даннная ячейка.
     * @param column номер колонки для проверки
     * @return true - ячейка редактируема, иначе - false
     */
    public static boolean isCellEditable(int column) {
        return column % 2 == 0;
    }

}
