public class BinarySearchIterative {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 14, 20, 25, 38, 45, 55, 64, 78, 80};
        int numberToBeFound = 14;

        int index = searchNumber(arr, numberToBeFound);

        System.out.println("Number has been found on index : " + index);
        System.out.println("And the number is : " + arr[index]);
    }

    private static int searchNumber(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (number < arr[mid]) {
                end = mid + 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

}
