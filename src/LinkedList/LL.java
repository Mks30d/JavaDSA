package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index > size) {
            System.out.println("Error...index>size");
            return;
        }
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
//            System.out.println(temp.value);
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public void deleteFirst() {
        System.out.println(head.value);
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }
        Node secondLast = getNode(size - 2);
        System.out.println(tail.value);
        tail = secondLast;
        tail.next = null;
        size--;
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node previous = getNode(index - 1);
        System.out.println(previous.next.value);

        previous.next = previous.next.next;
    }


    public void searchingValue(int value) {
        Node node = head;

        while (node != null) {
            if (node.value == value){
                System.out.println(node);
                return;
            }
            node = node.next;
        }

        System.out.println("Not found");
    }


    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }


    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(11);
        list.insertFirst(22);
        list.insertFirst(33);
        list.insertFirst(44);
        list.insertFirst(55);

        list.insertLast(100);
        list.display();

        list.insert(30, 3);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.delete(3);
        list.display();

        list.searchingValue(30);
        list.searchingValue(300);

    }
}
