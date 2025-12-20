package com.wait_notify;

public class ProducerConsumer {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(
                () ->{
                    for(int i=0;i<3;i++){
                        try {
                            resource.produce(i);
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
        );

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 3; i++) {
                try {
                    resource.consumer(i);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        });

        t1.start();
        t2.start();
    }
}
