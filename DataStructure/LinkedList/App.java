package LinkedList;

public class App {
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
