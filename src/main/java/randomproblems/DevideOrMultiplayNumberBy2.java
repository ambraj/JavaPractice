package randomproblems;

/**
 * Here program is written for multiply or divide a number by 2 without using '*'
 * or '/' operator.<br>
 * It uses the shift operator('<<': Left shift and '>>': Right shift).
 * If any number is shifter one position left then resultant number is be double.
 * If shifted to one position right then resultant number will half of the given number.
 *
 * @author rampravesh, May 29, 2012
 */
public class DevideOrMultiplayNumberBy2 {

    public static void main(String[] args) {

        int num = 12;

        int mul = multiplayByTwo(num);
        int dv = devideByTwo(num);

        System.out.println("Result of " + num + "*2 = " + mul);
        System.out.println("Result of " + num + "/2 = " + dv);
    }

    /**
     * This program multiply a number by 2 without using * operator.
     *
     * @param num : Integer
     * @return Integer
     */
    public static int multiplayByTwo(int num) {
        return (num << 1);
    }

    /**
     * This program divide a number by 2 without using / operator.
     *
     * @param num : Integer
     * @return Integer
     */
    public static int devideByTwo(int num) {
        return (num >> 1);
    }

}