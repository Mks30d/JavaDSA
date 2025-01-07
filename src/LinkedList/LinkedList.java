package LinkedList;
// ApnaCollege
public class LinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        System.out.println(head); // null
        System.out.println(size); // 0
    }

}
