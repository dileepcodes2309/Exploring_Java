package com.conceptual;

public class J25_Transient {
    public static void main(String[] args) {
        String whyWeUse = """
                ->Transient is a keyword in Java.
                ->We use this keyword to tell the JVM that to do not save this variable
                  during serialization which means JVM will ignore all the variable declared as
                  transient.
                """;
    }
}
