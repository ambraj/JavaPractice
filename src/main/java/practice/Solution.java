package practice;

public class Solution {

    public String addBinary(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        int i = 0, carry = 0;
        String res = "";
        while (i < lena || i < lenb || carry != 0) {
            int x = (i < lena) ? Character.getNumericValue(a.charAt(lena - 1 - i)) : 0;
            int y = (i < lenb) ? Character.getNumericValue(b.charAt(lenb - 1 - i)) : 0;
            res = (x + y + carry) % 2 + res;
            carry = (x + y + carry) / 2;
            i++;
        }
        return res;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String strX = String.valueOf(Math.abs(x));
        int i = 0;
        while (i <= strX.length() - i - 1) {
            if (strX.charAt(i) != strX.charAt(strX.length() - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int start = 1;
        int end = x;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}