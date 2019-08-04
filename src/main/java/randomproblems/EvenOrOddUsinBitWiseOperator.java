package randomproblems;

/**
 * Here code is, to identify a given positive decimal number as even/odd without
 * using % or / operator. <br>
 * It uses the Bit-wise operator.
 *
 * @author rampravesh, May 29, 2012
 */
public class EvenOrOddUsinBitWiseOperator {

    public static void main(String[] args) {

        int num = 10;

        if (isEvenOrOdd(num) == false)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }

    /**
     * This method check whether the given number is Even or Odd using Bit-wise
     * operator. That means without using % and / operator.
     *
     * @param num : Integer.
     * @return TRUE: means Odd number. <br>
     * FALSE: means Even number.
     */
    public static boolean isEvenOrOdd(int num) {
        return ((num & 1) > 0) ? true : false;
    }

}