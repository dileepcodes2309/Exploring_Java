package com.java;

public class J03_Encapsulation {
    public static void main(String[] args) {
        String whatISEncapsulation = """
                Encapsulation is process wrapping variable and methods in a single class.
                With encapsulation, we can achieve direct access to our data.
                """;

        String howToAchieve = """
                -> Make variables private.
                -> Provide getter and setter methods to access the data.
                """;

        String whyGetterSetter = """
                -> Encapsulation means hiding data.
                -> We need a way to modify or access our data safely so we need
                   getter and setter method.
                """;

        System.out.println(whatISEncapsulation);
        System.out.println(howToAchieve);
        System.out.println(whyGetterSetter);
    }
}
