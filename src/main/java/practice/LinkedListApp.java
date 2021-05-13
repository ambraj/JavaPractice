package practice;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegin(5);
//        list.insertAtBegin(6);
        list.printList();
    }
}

class LinkedList {
    Node head;

    public <T> void insertAtBegin(T data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data = data;
        next = null;
    }
}
