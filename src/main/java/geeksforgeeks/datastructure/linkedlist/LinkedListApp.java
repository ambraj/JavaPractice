package geeksforgeeks.datastructure.linkedlist;

class LLNode<T> {
    T data;
    LLNode next;

    LLNode(T data) {
        this.data = data;
    }
}

class LinkedList<T> {

    LLNode head;

    public void insertAtBegin(T data) {
        LLNode temp = new LLNode(data);
        temp.next = head;
        head = temp;
    }

    public void insertAtEnd(T data) {
        LLNode temp = new LLNode(data);
        temp.next = null;

        if (head == null) {
            head = temp;
            return;
        }
        LLNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = temp;
    }

    public void findMiddle() {
        if (head == null) {
            return;
        }
        LLNode curFast = head;
        LLNode curSlow = head;

        while (curFast != null && curFast.next != null) {
            curFast = curFast.next.next;
            curSlow = curSlow.next;
        }
        System.out.println("\n middle node = " + curSlow.data);
    }

    public void findNthNodeFromEnd(int n) {
        if (head == null) {
            return;
        }
        LLNode first = head;
        LLNode second = head;

        int count = 0;
        while (first != null) {
            count++;
            first = first.next;
            if (count > n) {
                second = second.next;
            }
        }
        if (n > count) {
            return;
        }
        System.out.println("\n nth node from end = " + second.data);

    }

    public void reverse() {
        LLNode cur = head;
        LLNode prev = null;

        while (cur != null) {
            LLNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public LLNode reverseRecursiveMethod(LLNode head){
        if(head == null || head.next == null){
            return head;
        }
        LLNode restHead = reverseRecursiveMethod(head.next);
        LLNode restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }

    public void printList() {
        LLNode cur = head;
        while (cur != null) {
            System.out.print(" -> " + cur.data);
            cur = cur.next;
        }
    }

}

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);
        ll.insertAtEnd(20);
        ll.insertAtEnd(25);
        ll.insertAtEnd(30);

        ll.printList();

        ll.findMiddle();

        ll.findNthNodeFromEnd(6);

        ll.reverse();
        ll.printList();

        ll.head = ll.reverseRecursiveMethod(ll.head);
        ll.printList();
    }
}