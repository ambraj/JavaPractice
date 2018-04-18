package GeneralProgramming;

/**
 * To check whether a no is palindrome or not?
 *
 * @author rampravesh, May 29, 2012
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isNumerPalindrome(13321) ? "Palindrome Number."
                : "Not a Palindrome numer.");
    }

    /**
     * @param num
     * @return TRUE: if Number is Palindrome. <br>
     * FALSE : not.
     */
    public static boolean isNumerPalindrome(int num) {
        return (reverseOfNumber(num) == num);
    }

    /**
     * This method is used to find the reverse of a number.
     *
     * @param num
     * @return
     */
    public static int reverseOfNumber(int num) {

        int revNum = 0;

        while (num > 0) {
            revNum = ((revNum * 10) + (num % 10));
            num /= 10;
        }

        return revNum;
    }
}