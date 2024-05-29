package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class $6_HashSet_Iteration {

    public static void main(String[] args) {
        HashSet<Integer> sets = new HashSet<>();

        sets.add(1);
        sets.add(2);
        sets.add(3);
        sets.add(1);
        System.out.println(sets);

        // using Iterator
        Iterator i = sets.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // using enhanced for loop
        for (Integer set : sets) {
            System.out.println(set);
        }

    }
}
