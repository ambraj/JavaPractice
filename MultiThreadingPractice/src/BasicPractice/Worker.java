package BasicPractice;

public class Worker {
    public static void main(String[] args) {
//        Thread.sleep(3000);
        System.out.println("Hello world!");

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(10);

                if (i == 100) {
                    throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                System.out.println("m out !!!!!!!!");
            }
        }

    }
}
