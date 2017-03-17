import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class WorkerThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello world!");
    }
}

public class ScheduledExecutor {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            executorService.schedule(new WorkerThread(), 5, TimeUnit.SECONDS);
        }
        executorService.shutdown();


    }

}
