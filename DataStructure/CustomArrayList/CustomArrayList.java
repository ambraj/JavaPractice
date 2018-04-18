package DataStructure.CustomArrayList;

import java.util.Arrays;

public class CustomArrayList {

    private Object[] arr;
    private int actualSize = 0;

    public CustomArrayList() {
        arr = new Object[10];
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.show();
        System.out.println("list size: " + list.size());

        System.out.println("removed element " + list.remove(3));
        list.show();
        System.out.println("list size: " + list.size());

        System.out.println("Element at 4th index: " + list.get(4));
    }

    public Object get(int index) {
        if (index < actualSize) {
            return arr[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void add(Object data) {
        if (arr.length - actualSize <= 5) {
            increaseListSize();
        }
        arr[actualSize++] = data;
    }

    private void increaseListSize() {
        arr = Arrays.copyOf(arr, arr.length + 5);
    }

    public Object remove(int index) {
        if (index < actualSize) {
            Object removedObj = arr[index];
            arr[index] = null;
            int tmp = index;
            while (tmp < actualSize) {
                arr[tmp] = arr[tmp + 1];
                arr[tmp + 1] = null;
                tmp++;
            }
            actualSize--;
            return removedObj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int size() {
        return actualSize;
    }

    public void show() {
        for (int i = 0; i < actualSize; i++) {
            System.out.println(arr[i]);
        }
    }
}
