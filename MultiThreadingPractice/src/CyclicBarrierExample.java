import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread1 implements Runnable {
    CyclicBarrier barrier;

    public WorkerThread1(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("hello");
            Thread.sleep(2000);
            System.out.println("hello_end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class CyclicBarrierExample {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        CyclicBarrier barrier = new CyclicBarrier(2, () -> System.out.println("inside barrier"));
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.submit(new WorkerThread1(barrier));
        }
        executorService.shutdown();
        barrier.await();

        System.out.println("finished");
    }
}
