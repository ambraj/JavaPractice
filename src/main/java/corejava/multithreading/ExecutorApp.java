package corejava.multithreading;

import java.util.concurrent.*;

class Worker implements Runnable {

    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("task started: " + id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("task finished: " + id);
    }
}

public class ExecutorApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                return "task completed";
            }
        });
        System.out.println("waiting for result");
        try {
            System.out.println(future.get(1, TimeUnit.SECONDS));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        //        Thread.sleep(2000);
        System.out.println("finished");

        executorService.shutdown();
    }

    public static void main1(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Worker(i));
        }
        System.out.println("All task submitted!");
        executorService.shutdown();

        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }

        System.out.println("All task completed!");
    }
}
