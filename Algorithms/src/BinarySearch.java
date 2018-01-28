public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[]{12, 14, 20, 25, 38, 45, 55, 64, 78, 80};
        int numberToBeFound = 80;

        int index = searchNumber(arr, numberToBeFound);

        System.out.println("Number has been found on index : " + index);
        System.out.println("And the number is : " + arr[index]);
    }

    public static int searchNumber(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= mid) {
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

}
