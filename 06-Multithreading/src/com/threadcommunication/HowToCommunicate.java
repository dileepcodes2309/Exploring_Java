package com.threadcommunication;

public class HowToCommunicate {
    public static void main(String[] args) {
        String howToCommunicate = """
                -> Two Threads can communicate with each other by using wait(), notify() and
                   notifyAll() methods.
                -> The Thread which is required updation it has to call wait() method on the
                   required object then immediately the Thread will entered into waiting state.
                   The Thread which is performing updation of object, it is responsible to give
                   notification by calling notify() method.
                   After getting notification the waiting Thread will get those updations.
                -> wait(), notify() and notifyAll() methods are available in Object class but not in
                   Thread class because Thread can call these methods on any common object.
                
                -> To call wait(), notify() and notifyAll() methods compulsory the current Thread
                   should be owner of that object.
                -> Once a Thread calls wait() method on the given object 1st it releases the lock of
                   that object immediately and entered into waiting state.
                -> Once a Thread calls notify() (or) notifyAll() methods it releases the lock of that
                   object but may not immediately.
                """;
    }
}
