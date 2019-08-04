package corejava.exceptions;

public class ReturnFromTryCatchFinallyApp {
    public static void main(String[] args) {
        System.out.println(method());
        method2();
    }

    public static void method2() {
        throw new CustomUncheckedException();
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

class CustomCheckedException extends Exception {

}

class CustomUncheckedException extends RuntimeException {

}
