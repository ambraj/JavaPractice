
class DeadlockThread implements Runnable {
    @Override
    public void run() {
        Object obj = new Object();
        Object obj1 = new Object();

        synchronized (obj) {
            synchronized (obj1) {
                System.out.println("first");
            }
        }

        synchronized (obj1) {
            synchronized (obj) {
                System.out.println("second");
            }
        }

    }
}

public class Deadlock {
    public static void main(String[] args) {
        new Thread(new DeadlockThread()).start();
    }
}
