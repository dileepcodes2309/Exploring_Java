package com.java;

public class J07_DoubleEqual_vs_Equals {
    public static void main(String[] args) {

        String s1 = "Dileep";
        String s2 = "Dileep";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String doubleEquals = """
                What is ==?
                It checks whether two references point to the same object in memory.
                It does not compare values inside the object.
                """;

        String equals = """
                What is .equals()?
                It is a method used to compare the actual values/content of two objects.
                For most classes (like String), it is overridden to check logical equality.
                """;

        System.out.println(doubleEquals);
        System.out.println(equals);
    }
}
