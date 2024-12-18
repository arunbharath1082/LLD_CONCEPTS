package LinkedList;


public class SinglyLinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(){};
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;

    private int size ;
    public Node getHead() {
        return head;
    }

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        if (head==null){
            head=node;
            tail=node;
            size++;
        }
        else{
            node.next=head;
            head=node;
            size++;
        }
    }
    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail==null){
            head=node;
            tail=head;
            size++;
        }
        else{
            tail.next=node;
            tail=node;
            size++;
        }

    }
    public int getSize() {
        return size;
    }
    public void printList(){
        Node temp=head;
        int i=0;
        while (temp!=null){
            System.out.print(i+"__"+temp.value+"-->");
            temp=temp.next;
            i++;
        }
        System.out.println();
        System.out.println("head: "+head.value);
    }
    public void insertAtIndex(int index,int value){
        if (index<0 || index>size){
            throw new IllegalArgumentException("Invalid index");
        }
        Node node=new Node(value);
        if (index==0){
            insertFirst(value);
        }
        else if (index==size-1){
            insertLast(value);
        }
        else{
            Node temp=head;
            for (int i=0;i<index-1;i++){
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;

        }
            printList();
    }
    public void deleteFirst(){
        if (head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
            size--;
            printList();
        }
    }

    public void deleteLast(){
        if (head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp=head;
            while (temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
            printList();
        }
    }

    public void deleteAtIndex(int index){
        if (index<0 || index>=size){
            System.out.println("invalid index");
        } else if (index==0){
           deleteFirst();
        } else if (index==size-1){
            deleteLast();
        }
        else {
            Node temp=head;
            for (int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;

        }
        printList();

    }

    public int findValue(int value){
        int index=0;
        if (size==0){
            return -1;
        }
        Node temp=head;
        while(temp!=null){
            if (temp.value==value){
                return index;
            }
            temp=temp.next;
            index++;
        }

        return -1;
    }
//-------------------------------------------------------------------------------------------
//    Problems in SINGLY LINKED LIST

//    remove the duplicates from the linked list of sortedOrder
    public void removeDup_SortedOrder(){
        if (size==0){
            System.out.println("There is No elememt in list");
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                if (temp.value==temp.next.value){
                    temp.next=temp.next.next;
                }
                else {
                    temp = temp.next;
                }
            }

        }
        printList();
    }

// Merge Two sorted Linked List
    public static SinglyLinkedList merge_sortedLinkedList(SinglyLinkedList first,SinglyLinkedList second) {
        Node f = first.head;
        Node s = second.head;

        SinglyLinkedList ans = new SinglyLinkedList();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

//Reverse a LinkedList
    public Node reverse(Node head){
        if (size==1){
            System.out.println("cannot reverse");
            return head;
        }
        else{
            tail=head;
            Node prev = null;
            Node present = head;
            Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;

            }
        return head;
        }

//Reverse a LinkedList using recursion
    public void reverse_Recu(Node node){
        if (node==tail){
            head=tail;
            return;
        }
        reverse_Recu(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

// reverse a linked list in the given left to right index
  public Node reverseBetween(Node head, int left, int right) {

        if (left==right){
            return head;
        }
        Node prev=null;
        Node current=head;

        for (int i=0;current!=null&&i<left-1;i++){
            prev=current;
            current=current.next;

        }
        Node last=prev;
        Node newEnd=current;
        Node next=current.next;
        for (int i=0;current!=null && i<left-right+1;i++){
            current.next=prev;
            prev=current;
            current=next;
            if (next!=null){
                 next=next.next;
            }

        }
        if (last!=null){
            last.next=prev;
        }else {
            head=prev;
        }
        newEnd.next=current;
        return head;

    }
    // Reverse a linked list in the group of k
    //very important
    //https://leetcode.com/problems/reverse-nodes-in-k-group/description/
public Node reverseKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        Node current = head;
        Node prev = null;

		int length = size; //length of the list
		int count = length / k;
        while (count > 0) {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
			count--;
        }
        return head;
    }

    //https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
public Node reverseAlternateKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node last = prev;
            Node newEnd = current;

            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            // skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

//Palindrome in linkedlidt
    public void palindrome(){
        //find the middle of the linked list
        //reverse the second half of the linked list
        //compare the first half and second half

        Node mid=findMiddle(head);
        Node second=mid.next;
        mid.next=null;
        //for reversing the second half of the linked list
        Node prev=null;
        Node current=second;
        Node next=second.next;
        while (current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if (next!=null){
                next=next.next;
            }
        }
        second=prev;
        //for comparing the first half and second half
        Node first=head;
        while (second!=null){
            if (first.value!=second.value){
                System.out.println("Not a palindrome");
                return;
            }
            first=first.next;
            second=second.next;
        }
        System.out.println("It is a palindrome");
    }

// Check cycle in the linked list
    public boolean check_cycle(){
//        for creating cycle cycle in list
//        tail.next=head.next;

        Node fast=head;
        Node slow=head;
        while (fast!=null && fast.next!=null){

            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;

    }

//    Length of the cycle in the linked list
    public int length_cyle(){

        tail.next=head.next.next;
        Node fast =head;
        Node slow=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                int length=1;
                slow=slow.next;
                while (slow!=fast){
                    slow=slow.next;
                    length++;
                }
                return length;
            }
        }
        return -1;
    }


// Return the Cycle Node of the Linked List
    public void cycle_node(){
        //for cycle
        tail.next=head.next;

        Node fast=head;
        Node slow=head;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast == slow) {
                slow=head;
                while (slow!=fast ){
                    fast=fast.next;
                    slow=slow.next;
                }
                System.out.println(slow.value);
                break;
            }
        }
        System.out.println("there is not cycle");


    }

// Find the middle of the linkedList
    public Node findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    // https://leetcode.com/problems/reorder-list/
    // Google, Facebook
    public void reorderList(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        Node mid = findMiddle(head);

        Node hs =reverse(mid);
        Node hf = head;

        // rearrange
        while (hf != null && hs != null) {
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }

    // FaceBook, Twitter, Google: https://leetcode.com/problems/rotate-list/
    public Node rotateRight(Node head, int k) {

        //We can also use reverse technique
        //1.first reverse the whole list
        //2. reverse the first k elements
        //3. reverse the remaining elements



        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        Node last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }


    }



