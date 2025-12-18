package com.stopthreadexecution;

public class Join extends Thread{
    public void run(){

        for(int i=1;i<=5;i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
        }
    }
}
