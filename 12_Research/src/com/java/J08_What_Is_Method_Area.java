package com.java;

public class J08_What_Is_Method_Area {
    public static void main(String[] args) {

        String whatIsIt = """
                The Method Area is a special memory region inside the JVM where Java stores:
                
                ✔ Class information
                ✔ Static variables
                ✔ Method code (bytecode)
                ✔ String Constant Pool (SCP)
                ✔ Final variables
                ✔ Method data (names, return types, etc.)
                
                It is created when the JVM starts.
                Method Area is a memory space where class-level data is stored.
                """;

        System.out.println(whatIsIt);
    }
}
