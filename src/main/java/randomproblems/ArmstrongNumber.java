package randomproblems;

/**
 * To check whether a no is Armstrong no or not ?
 *
 * @author rampravesh, May 29, 2012
 */
public class ArmstrongNumber {

    public static void main(String[] args) {

        /**
         * Example of Armstrong number.<br>
         * Armstrong number 1: 0 <br>
         * Armstrong number 2: 1 <br>
         * Armstrong number 3: 153 <br>
         * Armstrong number 4: 370 <br>
         * Armstrong number 5: 371 <br>
         * Armstrong number 6: 407 <br>
         */

        if (isArmstrongNumber(370))
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong number");
    }

    /**
     * This method will check the given number is Armstrong or not.
     *
     * @param num
     * @return TRUE: means Armstrong number <br>
     * FALSE: means not a Armstrong number.
     */
    public static boolean isArmstrongNumber(int num) {

        int digitCount = digitCount(num);
        int armstrounNum = 0;
        int orignalNum = num;

        while (num > 0) {

            int lastDigit = num % 10;

            armstrounNum += Math.pow(lastDigit, digitCount);

            num /= 10;
        }

        return (armstrounNum == orignalNum);
    }

    /**
     * This method count the number of digit in a number.
     *
     * @param num
     * @return
     */
    public static int digitCount(int num) {

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}