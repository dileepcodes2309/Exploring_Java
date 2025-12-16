package com.java;

public class J27_How_To_Create_Thread {
    public static void main(String[] args) {

        String howToCreate = """
                There are two ways to create thread in Java.
                1.By extending Thread class.
                2.By implementing the Runnable interface.
                """;

        String preferenceInRealWorld = """
                In real project we prefer Runnable interface for creating threads because
                in Java we can extend only class but can implement multiple interfaces.
                """;

        String twoThread = """
                Yes, we can create multiple Thread objects and pass the same Runnable.
                Each thread will run its own run() but share the same object state.
                """;
    }
}
