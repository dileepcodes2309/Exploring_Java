package com.stopthreadexecution;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        String meaning = """
                If a Thread wants to wait until completing some other Thread then we should go for
                join() method.
                Example: If a Thread t1 executes t2.join() then t1 should go for waiting state until
                completing t2.
                """;

        Join t = new Join();
        t.start();
        t.join();
        for(int i=0;i<=5;i++){
            System.out.println("Main Thread");
        }
    }
}
