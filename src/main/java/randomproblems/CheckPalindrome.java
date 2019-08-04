package randomproblems;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter any string to check palindrome : ");

        String originalStr = scanner.nextLine();
        System.out.println("Original String : " + originalStr);

        String reverseStr = reverseRecursively(originalStr);

        if (originalStr.equals(reverseStr)) {
            System.out.println("String is palindrome!");
        } else {
            System.out.println("String is not palindrome!");
        }

    }

    public static String reverse(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        System.out.println("Reversed String : " + reverseStr);
        return reverseStr;
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        System.out.println(str.substring(1));
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}
