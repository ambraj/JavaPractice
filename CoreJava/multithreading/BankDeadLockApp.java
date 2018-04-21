package Multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
    private int balance = 10000;

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withdrawl(amount);
        acc2.deposit(amount);
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdrawl(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class BankDeadLockApp {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Account acc1 = new Account();
        Account acc2 = new Account();
        Thread worker1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                // lock1.lock();
                // lock2.lock();
                acquireLock(lock1, lock2);
                Account.transfer(acc1, acc2, random.nextInt(100));
                lock2.unlock();
                lock1.unlock();
            }
        });
        Thread worker2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                // lock2.lock();
                // lock1.lock();
                acquireLock(lock1, lock2);
                Account.transfer(acc2, acc1, random.nextInt(100));
                lock2.unlock();
                lock1.unlock();
            }
        });

        worker1.start();
        worker2.start();

        worker1.join();
        worker2.join();

        System.out.println("Account1: " + acc1.getBalance());
        System.out.println("Account2: " + acc2.getBalance());
        System.out.println("Total: " + (acc1.getBalance() + acc2.getBalance()));
    }

    public static void acquireLock(Lock lock1, Lock lock2) {
        while (true) {
            boolean gotLock1 = lock1.tryLock();
            boolean gotLock2 = lock2.tryLock();

            if (gotLock1 && gotLock2) {
                return;
            }
            if (gotLock1) {
                lock1.unlock();
            }
            if (gotLock2) {
                lock2.unlock();
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}
