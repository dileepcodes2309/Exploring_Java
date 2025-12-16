package com.java;

public class J17_Object_Class {
    public static void main(String[] args) {

        String whatIs = """
                It is the super class of all the class.
                It is present in lang package.
                Its important methods are hashCode(), equals(), clone(),
                toString(), getClass() etc.
                All objects in Java inherit methods from Object class.
                """;

        String why = """
                Because it provides common behavior to all Java objects.
                
                Every object (String, Integer, ArrayList, custom class) has:
                
                hashCode
                
                equals
                
                toString
                
                clone
                
                wait, notify, notifyAll
                
                getClass
                
                finalize (deprecated)
                """;

        System.out.println(whatIs);
        System.out.println(why);
    }
}
