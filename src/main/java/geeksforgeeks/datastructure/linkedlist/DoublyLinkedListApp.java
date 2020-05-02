package geeksforgeeks.datastructure.linkedlist;

class DLNode {
    int data;
    DLNode prev;
    DLNode next;

    DLNode(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {

    DLNode head;

    public void insertAtBegin(int data) {
        DLNode temp = new DLNode(data);
        if (head == null) {
            head = temp;
            return;
        }

        head.prev = temp;
        temp.next = head;
        temp.prev = null;
        head = temp;
    }

    public void insertAtEnd(int data){
        DLNode temp = new DLNode(data);
        if(head == null){
            head = temp;
            return;
        }
        DLNode cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = temp;
    }

    public void printList() {
        DLNode cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

}

public class DoublyLinkedListApp {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);

        list.printList();
    }

}
