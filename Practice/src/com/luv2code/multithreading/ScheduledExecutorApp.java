package com.luv2code.multithreading;

import java.util.concurrent.*;

public class ScheduledExecutorApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        ScheduledFuture<Object> future = service.schedule(new Callable<Object>() {
            @Override
            public Object call() {
                return "called!";
            }
        }, 2, TimeUnit.SECONDS);

        service.shutdown();

        System.out.println(future.get());

    }

}
