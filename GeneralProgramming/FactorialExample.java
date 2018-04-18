package GeneralProgramming;

/**
 * Factorial Program in Java: Factorial of n is the product of all positive descending integers.
 * Factorial of n is denoted by n!. For example:
 * 4! = 4*3*2*1 = 24
 * 5! = 5*4*3*2*1 = 120
 */
class FactorialExample {
    public static void main(String args[]) {
        int i, fact = 1;

        //It is the number to calculate factorial
        int number = 5;
        for (i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
} 