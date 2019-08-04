package corejava.multithreading;

import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable {

    private List<Integer> taskQueue;
    private int queueSize;

    public Producer(List<Integer> taskQueue, int queueSize) {
        this.taskQueue = taskQueue;
        this.queueSize = queueSize;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            try {
                produce(counter++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void produce(int counter) throws InterruptedException {
        synchronized (taskQueue) {
            while (taskQueue.size() == queueSize) {
                System.out.println("waiting to produce!");
                taskQueue.wait();
            }
            Thread.sleep(1000);
            System.out.println("produced element : " + counter);
            taskQueue.add(counter);
            taskQueue.notifyAll();
        }
    }
}

class Consumer implements Runnable {
    private List<Integer> taskQueue;

    public Consumer(List<Integer> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (taskQueue) {
            while (taskQueue.isEmpty()) {
                System.out.println("waiting to consume!");
                taskQueue.wait();
            }
            Thread.sleep(1000);
            int consumedElement = taskQueue.remove(0);
            System.out.println("consumed element : " + consumedElement);

            taskQueue.notifyAll();
        }
    }
}

public class ProducerConsumerUsingWaitNotify {
    public static void main(String[] args) {
        List<Integer> taskQueue = new ArrayList<>();
        Producer producer = new Producer(taskQueue, 5);
        Consumer consumer = new Consumer(taskQueue);

        new Thread(producer).start();
        new Thread(consumer).start();

    }
}
