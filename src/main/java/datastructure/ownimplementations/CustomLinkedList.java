package datastructure.ownimplementations;

public class CustomLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(12);
        list.insert(144);

        list.insertAtStart(100);
        list.insertAt(2, 50);
        list.insertAt(2, 40);

        list.removeAt(1);

        list.show();
    }
}

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;

        Node n = head;
        if (index == 0) {
            insertAtStart(data);
        }
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void removeAt(int index) {
        Node n = head;
        if (index == 0) {
            head = n.next;
        }
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        n.next = n.next.next;
    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
