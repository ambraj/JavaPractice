package corejava.multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueApp {
    public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) {

        new Thread(() -> {
            consumer();
        }).start();
        new Thread(() -> {
            producer();
        }).start();

    }

    public static void producer() {
        while (true) {
            try {
                queue.put(new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void consumer() {
        while (true) {
            if (queue.contains(5)) {
                Integer popValue = null;
                try {
                    popValue = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("size:" + queue.size() + "value:" + popValue);
            }
        }
    }
}
