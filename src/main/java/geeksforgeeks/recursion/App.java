package geeksforgeeks.recursion;

public class App {

    public static void main(String[] args) {
        System.out.println(fact(5));

        String str = "aaba";
        System.out.println(palindrome(str, 0, str.length() - 1));

        System.out.println(sumOfDigits(9987));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static boolean palindrome(String str, int s, int e) {
        if (s == e || s > e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }
        return palindrome(str, s + 1, e - 1);
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return sumOfDigits(n / 10) + (n % 10);
    }



}
