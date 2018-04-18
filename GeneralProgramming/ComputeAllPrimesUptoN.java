package GeneralProgramming;

/**
 * To compute all prime number up to a given numbers.
 *
 * @author rampravesh, May 29, 2012
 */
public class ComputeAllPrimesUptoN {

    public static void main(String[] args) {
        computeAllPrimeNumberUptoN(50);
    }

    /**
     * This method computes all prime number up to a given numbers.
     *
     * @param n
     */
    public static void computeAllPrimeNumberUptoN(int n) {

        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.print("\t" + i);
        }
    }

    /**
     * This method used to check whether given number is prime or not.
     *
     * @param num
     * @return TRUE: means Prime. <br>
     * FALSE: mean Not prime.
     */
    public static boolean isPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if ((num % i) == 0)
                return false;
        }

        return true;
    }

}