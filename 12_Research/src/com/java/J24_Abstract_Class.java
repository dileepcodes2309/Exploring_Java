package com.java;

public class J24_Abstract_Class {
    public static void main(String[] args) {
        String meaning = """
                ->In Java, we cannot create the object of abstract class directly.
                  Abstract class also contains method declaration.
                ->The class who extends the abstract class will have to provide implementation
                  to abstract class method.
                ->We can create the object of class who extends the abstract class.
                """;

        System.out.println(meaning);

        String whenToUse = """
                ->You want to provide a common base with some shared implementation.
                ->When we have a common base but not every detail is known in base class.
                """;

        System.out.println(whenToUse);

        //abstract class can concrete method as well.
    }
}
