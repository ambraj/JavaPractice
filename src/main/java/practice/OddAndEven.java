package practice;

import java.util.concurrent.atomic.AtomicInteger;

public class OddAndEven {

    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger();
        Object lock = new Object();

        new OddPrinter(number, lock).start();
        new EvenPrinter(number, lock).start();
    }
}

class OddPrinter extends Thread {
    private AtomicInteger number;
    private Object lock;

    public OddPrinter(AtomicInteger number, Object lock) {
        this.number = number;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                if (number.get() % 2 != 0) {
                    lock.wait();
                } else {
                    System.out.println(number.get());
                    number.incrementAndGet();
                    Thread.sleep(500);
                    lock.notifyAll();
                }
            }
        }
    }
}

class EvenPrinter extends Thread {
    private AtomicInteger number;
    private Object lock;

    public EvenPrinter(AtomicInteger number, Object lock) {
        this.number = number;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                if (number.get() % 2 == 0) {
                    lock.wait();
                } else {
                    System.out.println(number.get());
                    number.incrementAndGet();
                    lock.notifyAll();
                }
            }
        }
    }
}