package exceptions;

public class ReturnFromTryCatchFinallyApp {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static String method() {
        try {
            Thread.sleep(1000);
            System.out.println("inside try!");
            return "A";
        } catch (InterruptedException e) {
            System.out.println("inside catch");
            return "B";
        } finally {
            System.out.println("inside finally!");
            return "C";
        }
    }
}
