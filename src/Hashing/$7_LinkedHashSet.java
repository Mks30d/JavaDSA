package Hashing;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class $7_LinkedHashSet {

    public static void main(String[] args) {

        HashSet<Character> sets =  new HashSet<>();
        sets.add('D');
        sets.add('C');
        sets.add('B');
        sets.add('A');
        System.out.println(sets);

        LinkedHashSet<Character> lhm = new LinkedHashSet<>();
        lhm.add('D');
        lhm.add('C');
        lhm.add('B');
        lhm.add('A');
        System.out.println(lhm);

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('D');
        ts.add('C');
        ts.add('B');
        ts.add('A');
        System.out.println(ts);
    }
}
