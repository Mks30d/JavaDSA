package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        // add elements to list
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        // input from user
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list); // [11, 12, 13, 14, 15]

        System.out.println(list.contains(12)); // true or false

        // to replace element
        list.set(4, 55);
        // list.remove(2);
        // System.out.println(list.size());
        // display
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));  // pass index here, list[i] syntax will not work here
        }

    }
}
