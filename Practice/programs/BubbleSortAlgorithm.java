package Practice.programs;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] intArray = {9, 4, 8, 7, 6, 1, 2, 3};
        intArray = doBubbleSorting(intArray);
        for (int element : intArray) {
            System.out.println(element + ", ");
        }
    }

    public static int[] doBubbleSorting(int[] intArray) {
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < intArray.length - i; j++) {
                if (intArray[j - 1] > intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }
}
