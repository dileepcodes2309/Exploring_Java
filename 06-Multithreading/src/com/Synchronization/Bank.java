package com.Synchronization;

public class Bank {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            try {
                account.deposit(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            try {
                account.withdraw(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread-2");

        Thread t3 = new Thread(() -> {
            try {
                account.withdraw(800);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
