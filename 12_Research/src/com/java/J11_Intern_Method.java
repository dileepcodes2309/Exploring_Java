package com.java;

public class J11_Intern_Method {
    public static void main(String[] args) {

        String internMethod = """
                The intern() puts the string in the string pool.
                """;

        String s1 = new String("hello");// Creates a new string object in the heap
        String s2 = s1.intern(); // Adds "hello" to the pool and returns a reference to it
        String s3 = "hello";

        System.out.println(s1 == s2); // false (s1 is in heap, s2 is in pool)
        System.out.println(s2 == s3); // true (both refer to the same object in the pool)
    }
}
