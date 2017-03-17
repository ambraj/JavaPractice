import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class FutureThread implements Callable {

    @Override
    public Integer call() throws Exception {
        return 1;
    }

}

public class FutureTask {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            Future<Integer> future = executorService.submit(new FutureThread());
            try {
                list.add(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("List || " + list);
    }
}
