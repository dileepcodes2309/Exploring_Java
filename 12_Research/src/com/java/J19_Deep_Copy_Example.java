package com.java;

public class J19_Deep_Copy_Example {
    public static void main(String[] args) {

        String meaning = """
                -> A deep copy makes a new object and also makes new copies of everything inside it.
                -> If it is a simple value (like an int), it copies the value itself.
                -> If it is a complex object, it creates a new object in memory with the same data,
                   so nothing is shared between the original and the copy.
                -> We can achieve deep copy using “cloneable” marker interface.
                """;

        System.out.println(meaning);
    }
}
