package GeneralProgramming;

/**
 * In fibonacci series, next number is the sum of previous two numbers
 * example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
 * The first two numbers of fibonacci series are 0 and 1.
 */
class FibonacciExample1 {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        //loop starts from 2 because 0 and 1 are already printed
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}