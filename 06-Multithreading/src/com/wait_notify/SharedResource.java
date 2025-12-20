package com.wait_notify;

public class SharedResource {

    boolean isDataAvailable = false;

    public synchronized void produce(int i) throws InterruptedException {
        if(isDataAvailable){
            wait();
        }

        System.out.println("Produced " + i);

        isDataAvailable = true;
        notify();
    }

    public synchronized void consumer(int i) throws InterruptedException{
        if (!isDataAvailable) {
            wait();
        }
        System.out.println("Consumed " + i);
        isDataAvailable = false;
        notify();
    }
}
