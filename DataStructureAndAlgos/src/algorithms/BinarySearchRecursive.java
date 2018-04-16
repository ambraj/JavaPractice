package algorithms;

public class BinarySearchRecursive {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 14, 20, 25, 38, 45, 55, 64, 78, 80};
        int numberToBeFound = 80;

        int index = searchNumber(arr, 0, arr.length - 1, numberToBeFound);

        System.out.println("Number has been found on index : " + index);
        System.out.println("And the number is : " + arr[index]);
    }

    private static int searchNumber(int[] arr, int start, int end, int number) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (number < arr[mid]) {
                return searchNumber(arr, start, mid - 1, number);
            } else {
                return searchNumber(arr, mid + 1, end, number);
            }
        }
        return -1;
    }

}
