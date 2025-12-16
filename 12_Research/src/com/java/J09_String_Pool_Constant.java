package com.java;

public class J09_String_Pool_Constant {
    public static void main(String[] args) {
        String whatIsSCP = """
                The String Constant Pool is a special memory inside the JVM Method Area
                where unique string literals are stored and reused to save memory.
                """;

        //example
        String str1 = "Dileep"; //"Dileep" goes into the String Constant Pool.

        System.out.println(whatIsSCP);
    }
}
