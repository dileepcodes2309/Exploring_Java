package com.scenario;

public class S03_StringBuilder1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");

        System.out.println(sb1.equals(sb2)); // true because StringBuilder does not override equals method of Object class
        System.out.println(sb1 == sb2); // false because its two different object
    }
}
