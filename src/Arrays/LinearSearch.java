package Arrays;

import java.util.Arrays;

public class LinearSearch {
    // ---------------- integer input -----------------
    static int linearSearch(int num[], int target) {
        if (num.length == 0) { // if the array has no element
            return -1;
        }
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    // ---------------- String input -----------------
    static int linearSearch(String name[], String target) {

        for (int i = 0; i < name.length; i++) { // here lenght is variable
            if (name[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    // ---------------- String input and find char -----------------
    static boolean linearSearch(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        
        for (int i = 0; i < name.length(); i++) { // here lenght() is function/method
            if (name.charAt(i) == target) {
                System.out.println(i);
                return true;

            }
        }
        // using for each method : to use foreach we need colletion of array that's why name is converted to array of char
        // for (char ch : name.toCharArray()) {
        //     if (ch == target) {
        //         return true;
        //     }
        // }

        return false;
    }

    public static void main(String[] args) {


        // ---------------- integer input -----------------
        int num[] = { 33, 22, 11, 55, 88, 99 };
        int target = 55;
        int check = linearSearch(num, target);
        if (check == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at:" + check);
        }
        
        // ---------------- String input -----------------
        String str[] = { "33", "Aman", "Rohan", "Rakesh", "Rohit", "Mks" };
        String target1 = "mksd";
        System.out.println("Result:" + linearSearch(str, target1));


        // ---------------- String input and find char -----------------
        String name = "Computer";
        char ch = 'u';
        System.out.println(linearSearch(name, ch));


        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println((name.toCharArray()));

    }
}

// String name1 = "mks";
// name1.length();

// String name2[] = { "Rohan", "Rakesh", "Rohit", "Mks" };
// name2.length;