package Hashing;

import java.util.HashSet;

public class $5_HashSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(33);
        set.add(22);
        set.add(33);
        set.add(11);
        set.add(22);
        System.out.println(set);

        System.out.println(set.contains(33));
        System.out.println(set.contains(44));
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set.size());

    }
}
