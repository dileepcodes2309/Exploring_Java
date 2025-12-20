package com.java;

public class J30_Synchronization {
    public static void main(String[] args) {

        String scenario = """
                ->In Java, multiple threads can attempt to access the shared resources concurrently.
                ->Without synchronization, this concurrent access can give us incorrect data.
                ->With the help of Synchronization, it ensures that only one thread can execute a
                  critical section of code.
                """;

        String waitForSomeone = """
                -> In multithreading, some threads often wait for some event to happen.
                   Here, wait, notify and notifyAll comes in picture.
                
                Real life analogy:
                Suppose in a phone booth, you are talking to a friend over phone and others are
                waiting outside.
                When you finish your job, you say its done and next person will go in.
                
                That is wait() (someone waiting), and notify() (someone getting informed that they can go in).
                """;

        String wait = """
                -> It causes the current thread to release its lock so that other thread can work on the object.
                """;

        String notify = """
                -> It wakes up one thread that is waiting on the same object
                """;
        String notifyAll = """
                -> wakes up all waiting threads (only one can proceed at a time)
                """;
    }
}
