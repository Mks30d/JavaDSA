package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(11);
        list.insertFirst(22);
        list.insertFirst(33);
        list.insertFirst(44);
        list.insertFirst(55);

        list.insertLast(100);

        list.insert(30, 3);

        list.display();
    }
}
