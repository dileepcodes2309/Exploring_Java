package com.designpattern;

public class P01_Singleton {

    public static void main(String[] args) {

        String meaning = """
                -> A singleton class has only one instance that can be accessible globally through a single
                   entry point.
                """;

        String implementation = """
                -> There are two options for implementing singleton.
                -> Eager and Lazy singleton.
                """;

        String stepsForEager = """
                -> Create a private constructor so that no one can create object.
                -> Create a static final variable holding the object.
                -> Create public getter for global access to that object.
                """;

        String stepsForLazy = """  
                -> Create a private constructor.
                -> Create a static volatile of reference of type of same class so that it read the latest
                   value from main memory not from cache.
                -> Create public getter for global access to that object.
                -> Make sure to make that block synchronized to prevent duplicate object.
                """;
    }
}
