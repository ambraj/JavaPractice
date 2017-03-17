import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class Connection implements Runnable {
    static Connection connection = new Connection();
    Semaphore semaphore = new Semaphore(5, true);

    public static Connection getConnection() {
        return connection;
    }

    @Override
    public void run() {

        connect();
    }

    public void connect() {
        try {
            System.out.println("acquired");
            semaphore.acquire();

            Thread.sleep(1000);

            semaphore.release();
            System.out.println("released");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Semaphores {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    Connection.getConnection().connect();
                }
            });
        }
        executor.shutdown();
    }
}
