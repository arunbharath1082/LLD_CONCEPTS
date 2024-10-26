package LinkedList;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(15);
        singlyLinkedList.insertFirst(9);
        singlyLinkedList.insertFirst(7);
        singlyLinkedList.insertFirst(4);
        singlyLinkedList.insertFirst(1);
        singlyLinkedList.reverse();
        singlyLinkedList.printList();

    }
}
