package com.luv2code.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class Connection {
    private static Connection instance = new Connection();
    private Semaphore semaphore = new Semaphore(3);
    private int connections;

    private Connection() {
    }

    public static Connection getInstance() {
        return instance;
    }

    public void connect() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        connections++;
        System.out.println("connections count: " + connections);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        connections--;
        semaphore.release();
    }
}

public class SemaphoresApp {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 200; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    Connection.getInstance().connect();
                }
            });
        }
        service.shutdown();
    }
}
