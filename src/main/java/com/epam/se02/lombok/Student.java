package com.epam.se02.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class Student {

    int id;
    String name;
    String surname;
    int age;
}

class Launcher {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Ivan", "Ivanov", 23);
        Student student2 = new Student(1, "123", "33", 23);
        System.out.println(student1.equals(student2));
    }
}
