package com.java;

public class J06_Constructor {
    int age;

    public static void main(String[] args) {
        J06_Constructor obj = new J06_Constructor();
        System.out.println(obj.age);

        String whyConstructor = """
                -> We need a constructor to initialize a newly created object.
                -> Initialization means assigning initial values to the object's
                   variables so that the object is in a valid and usable state.
                -> If we don't provide any constructor, JVM will create a default
                   constructor having no argument.
                -> If we create a constructor then JVM will not create any constructor.
                -> Constructor has no return type.
                """;

        System.out.println(whyConstructor);
    }
}
