package com.java;

public class J13_Immutable_Class_Rules {
    public static void main(String[] args) {
        String rules = """
                -> Make the class final
                -> Make all fields private and final
                -> No setters, only getters
                -> If any field is an object, return a copy, not the original
                """;

        System.out.println(rules);
    }
}
