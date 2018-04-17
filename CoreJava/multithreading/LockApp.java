package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Worker1 implements Runnable {
    private ReentrantLock lock;

    public Worker1(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " is doing some sleeping.......");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + " is woke up!");
        } finally {
            lock.unlock();
        }
    }
}

public class LockApp {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        for (int i = 0; i < 5; i++) {
            Thread workerThread = new Thread(new Worker1(lock));
            workerThread.setName("Worker#" + i);
            workerThread.start();
        }
    }
}
