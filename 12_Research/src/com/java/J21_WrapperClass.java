package com.java;

public class J21_WrapperClass {
    public static void main(String[] args) {

        String meaning = """
                In Java, primitive data type like int, float etc are not objects. But Java is an
                Object Oriented Language and sometimes, especially while working with collections or
                frameworks we need objects then the Wrapper class comes into picture.
                """;

        String str = "123";

        //With the help of wrapper class we can convert String to int
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
