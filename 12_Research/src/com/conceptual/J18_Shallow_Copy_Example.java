package com.conceptual;

public class J18_Shallow_Copy_Example {
    public static void main(String[] args) {

        String meaning = """
                -> A shallow copy makes a new object and copies everything from the old one.
                -> If it is a simple value (like an int), it copies the value itself.
                -> If it is a complex object, it just copies the address/reference,
                   so both still point to the same thing in memory.
                """;

        J18_Student originalStudent = new J18_Student(29,new J18_Address("Goa"));

        J18_Student shallowCopy = new J18_Student(originalStudent);

        shallowCopy.setAge(29);
        shallowCopy.getAddress().setStreet("Odisha");

        System.out.println("Original Student:"+originalStudent);
        System.out.println("Shallow copy Student:"+shallowCopy);

    }
}
