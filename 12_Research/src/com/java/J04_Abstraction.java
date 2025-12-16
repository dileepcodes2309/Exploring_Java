package com.java;

public class J04_Abstraction {
    public static void main(String[] args) {
        String whatISAbstraction = """
                Abstraction means hiding the internal implementation and show only
                essentials details to the user.
                """;

        String howToAchieve = """
                -> We can use abstract keyword to achieve abstraction.
                -> Inside abstract class, it contain only method declaration.
                -> Its method implementation is hidden in child class.
                """;

        String ifCase = """
                -> If a class contain abstract method then we need to declare that
                method as abstract otherwise we will get compile time error.
                """;

        System.out.println(whatISAbstraction);
        System.out.println(howToAchieve);
        System.out.println(ifCase);
    }
}
