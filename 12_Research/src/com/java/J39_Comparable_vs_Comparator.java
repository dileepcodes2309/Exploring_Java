package com.java;

public class J39_Comparable_vs_Comparator {
    public static void main(String[] args) {

        String comparable = """
                -> It is an interface provided by Java to compare two objects of the same type.
                -> Several built in classes like Integer, Double, String,etc provide implementation
                   to Comparable interface.
                -> Comparable is used for sorting objects by natural or default ordering.
                """;

        String comparator = """
                -> The Comparator interface is used to define multiple ways of sorting objects.
                -> It is found in the java.util package and has two primary methods: compare() and equals().
                """;

        //Use Comparable for default sorting. Use Comparator when we need custom sorting
    }
}
