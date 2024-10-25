package LinkedList;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(15);
        singlyLinkedList.insertFirst(9);
        singlyLinkedList.insertFirst(7);
        singlyLinkedList.insertFirst(4);
        singlyLinkedList.insertFirst(1);

        SinglyLinkedList singlyLinkedList2=new SinglyLinkedList();
        singlyLinkedList2.insertFirst(12);
        singlyLinkedList2.insertFirst(11);
        singlyLinkedList2.insertFirst(5);
        singlyLinkedList2.insertFirst(3);
        singlyLinkedList2.insertFirst(2);

        SinglyLinkedList ans=SinglyLinkedList.merge_sortedLinkedList(singlyLinkedList,singlyLinkedList2);
        ans.printList();
    }
}
