package com.luv2code.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class CabClass implements Runnable {
    private CyclicBarrier barrier;

    public CabClass(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " has arrived!");

        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e1) {
        }

        System.out.println("Cab is leaving now!");
    }
}

public class CabServiceApp {
    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier barrier = new CyclicBarrier(3);

        for (int i = 0; i < 6; i++) {
            Thread cabThread = new Thread(new CabClass(barrier));
            cabThread.setName("Passenger" + i);
            cabThread.start();
            Thread.sleep(3000);
        }

    }
}
