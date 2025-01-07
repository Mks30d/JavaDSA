package LinkedList;

public class DoublyLinkedList {

    Node head;

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        Node tail = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            tail = temp;
            temp = temp.next;

        }
        System.out.println("null");

        while (tail != null) {
            System.out.print(tail.value + " -> ");
            tail = tail.prev;
        }
        System.out.println("null");
    }

    public void insertLast(int value) {
        Node last = head;
        Node node = new Node(value);
        node.next = null;
        if (head == null) {
            head.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node searchingValue(int value) {
        Node node = head;

        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int after, int value) {
        Node p = searchingValue(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(11);
        dll.insertFirst(22);
        dll.insertFirst(33);
        dll.insertFirst(44);
        dll.insertFirst(55);
        dll.insertLast(90);
        dll.insertAfter(33, 35);
        dll.display();
    }
}
