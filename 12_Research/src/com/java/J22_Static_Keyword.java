package com.java;

public class J22_Static_Keyword {

    //static block run once when class loads
    static {
        System.out.println("Static block");
    }

    static {
        String multipleStaticBlock = """
                A class can have multiple static blocks and each static block is executed in the same
                sequence in which they have been written in a program.
                """;

        System.out.println(multipleStaticBlock);
    }
    public static void main(String[] args) {

        String meaning = """
                If we want the other class to access a method of a class without creating object
                of that class then we need to declare the methods of that class as static.
                """;

        System.out.println(meaning);
    }
}
