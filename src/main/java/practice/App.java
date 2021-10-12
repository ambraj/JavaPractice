package practice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class App {


    public static void main(String[] args) {

        int[] arr = new int[]{0,2,1,2,0};
//        int k = 4;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i : arr) {
            priorityQueue.add(i);
        }

        priorityQueue.forEach(System.out::println);

        int i = 0;
        for (int value : priorityQueue) {
            arr[i++] = value;
        }

        System.out.println("..................");

        Arrays.stream(arr).forEach(System.out::println);

//        for (int i = 0; i < k; i++) {
//            priorityQueue.add(arr[i]);
//        }
//
//        for (int i = k; i < arr.length; i++) {
//            if (arr[i] < (int)priorityQueue.peek()) {
//                priorityQueue.poll();
//                priorityQueue.add(arr[i]);
//            }
//        }

//        System.out.println(k + "th smallest : " + priorityQueue.peek());

    }

}
