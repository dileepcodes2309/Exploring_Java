package com.java;

public class J32_Throw_vs_Throws {
    public static void main(String[] args) {

        String throwMeaning = """
                The throw keyword is used to manually throw an exception.
                """;

        String throwsMeaning = """
                throws is used in a method's signature to declare the types of checked exceptions
                that the method might throw. This informs calling methods that they need to either handle
                these exceptions (using try-catch) or declare them as well
                """;

        String pointsToRemember = """
                -> We can use throw for unchecked exception.
                -> But for checked exceptions (like IOException), if we throw them,
                   we must declare throws or handle them.
                """;
    }
}
