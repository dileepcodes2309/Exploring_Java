package com.java;

public class J31_ExceptionHandling {
    public static void main(String[] args) {

        String definition = """
                -> Exception is unexcepted event that disturb the normal flow of the program.
                -> We can handle exceptions using a structured mechanism using keyword: try,
                   catch and finally.
                """;

        String tryWithoutCatch = """
                -> We cannot write only try block. Try block must be followed by cath or finally block.
                """;

        String exceptionHierarchy = """
                -> At the top is throwable which is the root of all errors and exception in Java.
                -> Then comes two branch -: Error and Exception
                """;


    }
}
