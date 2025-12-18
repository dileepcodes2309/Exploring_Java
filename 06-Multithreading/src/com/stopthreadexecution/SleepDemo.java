package com.stopthreadexecution;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        String meaning = """
                If a Thread don't want to perform any operation for a particular amount of time then
                we should go for sleep() method.
                """;
        System.out.println(meaning);
        System.out.println("--------------------------------------------------------");
        System.out.println("M");
        Thread.sleep(3000);
        System.out.println("E");
        Thread.sleep(3000);
        System.out.println("G");
        Thread.sleep(3000);
        System.out.println("A");
    }
}
