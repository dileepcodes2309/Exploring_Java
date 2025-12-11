package com.Synchronization;

public class BankAccount {

    private int balance = 1000;

    public synchronized void deposit(int amount) throws InterruptedException {

        System.out.println(Thread.currentThread().getName()+" is trying to deposit "+amount);
        Thread.sleep(5000);

        balance += amount;
        System.out.println(Thread.currentThread().getName() + " completed deposit. New balance: " + balance);
    }

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is trying to withdraw: " + amount);
        Thread.sleep(5000);
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. New balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw due to insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}
