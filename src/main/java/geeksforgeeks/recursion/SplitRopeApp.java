package geeksforgeeks.recursion;

public class SplitRopeApp {

    public static void main(String[] args) {
        System.out.println(fun(5, 2, 5, 1));
        System.out.println(fun(23, 12, 9, 11));
        System.out.println(fun(5, 4, 2, 6));
    }

    public static int fun(int n, int a, int b, int c) {

        if (n == 0) {
            return 0;
        }
        if (n < 0) {
            return -1;
        }

        int res = Math.max(Math.max(fun(n - a, a, b, c), fun(n - b, a, b, c)), fun(n - c, a, b, c));
        if (res == -1) {
            return -1;
        }

        return 1 + res;
    }

}
