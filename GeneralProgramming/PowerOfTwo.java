package GeneralProgramming;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOf2(32));
    }

    public static boolean isPowerOf2(int x) {
        while (x >= 2) {
            System.out.println("while : " + x % 2);
            if (x % 2 > 0) {
                return false;
            }
            x = x / 2;
        }

        if (x == 1)
            return true;
        else
            return false;
    }

}
