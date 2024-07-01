package Backtracking;

import java.util.Arrays;

public class $1_ChangeArr {
    static void changeArr(int[] arr, int i, int value) {
        if (i== arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = value;
        changeArr(arr, i+1, value+1);
//        changeArr(arr, i++, ++value); // error
        arr[i] = arr[i]-2;  // backtracking step, it happens after fun call step
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
