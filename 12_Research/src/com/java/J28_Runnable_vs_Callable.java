package com.java;

public class J28_Runnable_vs_Callable {
    public static void main(String[] args) {

        String difference = """
                Both the interfaces are used to create threads.
                There is a one main difference between these two is that Runnable does not return
                anything and Callable return something.
                And Runnable does not support Checked exception.
                """;

        String returnThread = """
                Yes, by using Callable with ExecutorService, threads can return values.
                The result is accessed through a Future object.
                """;


    }
}
