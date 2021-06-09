package corejava.multithreading;

class Runner {
    public void produce() {
        synchronized (this) {
            System.out.println("one");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("two");
        }
    }

    public void consume() {
        synchronized (this) {
            try {
                Thread.sleep(2000);
                System.out.println("three");
                notify();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("four");
        }
    }
}

public class WaitNotifyApp {
    public static void main(String[] args) {
        Runner runner = new Runner();

        new Thread(() -> runner.produce()).start();

        new Thread(() -> runner.consume()).start();
    }
}
