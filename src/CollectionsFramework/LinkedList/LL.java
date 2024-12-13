package CollectionsFramework.LinkedList;

import java.util.LinkedList;

public class LL {

    public static LinkedList removeNthNodeFromEnd(LinkedList head, int n) {
        System.out.println(head.size());
        LinkedList prev = head;
        for (int i = 1; i < head.size()-n; i++) {
            prev = prev;
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.addFirst(11);
        ll.addLast(66);
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        System.out.println(ll.size());
        System.out.println(ll.get(0));

    }
}
