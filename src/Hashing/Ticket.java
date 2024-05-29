package Hashing;

import java.util.HashMap;

public class Ticket {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Bengaluru");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi", "Goa");

        String start = "", end = "";
        for (String st : hm.keySet()) {
            if (!hm.containsValue(st)) {
                start = st;
            }
            if (!hm.containsKey(hm.get(st))) {
                end = hm.get(st);
            }
        }
        System.out.println("Start: " + start);
        System.out.println("End: " + end);

        String current = start;
        System.out.print(start);
        for (String st : hm.keySet()) {
            System.out.print("->" + hm.get(current));
            current = hm.get(current);
        }
    }
}
