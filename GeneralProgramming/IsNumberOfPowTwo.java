package GeneralProgramming;

/**
 * To check whether a no is power of two or not? <br>
 * This program code will be enhanced, if you have an idea then please share it.
 *
 * @author rampravesh, May 29, 2012
 */
public class IsNumberOfPowTwo {

    public static void main(String[] args) {

        System.out.println("OutPut::" + (isNumberOfPowTwo(9) ? "Yes" : "No"));
    }

    public static boolean isNumberOfPowTwo(int num) {

        for (int i = 2; i < num / 2; i++) {
            if ((i * i) == num)
                return true;
        }

        return false;
    }
}