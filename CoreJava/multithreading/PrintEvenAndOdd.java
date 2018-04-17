package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintEvenAndOdd {
    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(1);
        Object lock = new Object();
        new Even(num, lock).start();
        new Odd(num, lock).start();
    }
}

class Even extends Thread {
    AtomicInteger num;
    Object lock;

    public Even(AtomicInteger num, Object lock) {
        this.num = num;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                if (num.get() % 2 != 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {

                    try {
                        System.out.println("Even: " + num.get());
                        num.incrementAndGet();
                        Thread.sleep(500);
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}

class Odd extends Thread {
    AtomicInteger num;
    Object lock;

    public Odd(AtomicInteger num, Object lock) {
        this.num = num;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                if (num.get() % 2 == 0) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Odd: " + num.get());
                    num.incrementAndGet();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.notifyAll();
                }
            }
        }
    }
}
