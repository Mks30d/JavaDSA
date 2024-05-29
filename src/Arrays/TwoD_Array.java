package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][]; // giving column size is not mandatory

        // For individual row, column size size may vary
        int arr1[][] = { { 1, 2, 3 }, // 0th index
                { 4, 5 }, // 1st index
                { 6, 7, 8, 9 } }; // 2nd index

        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));
        System.out.println(Arrays.toString(arr1[2]));

        //printing array
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        
        // enchanced for loop
        for(int[] i: arr1){
            System.out.println(Arrays.toString(i));
        }


        // taking input from user
        int[][] arr2 = new int[3][4];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                // arr2[i][j] = sc.nextInt();

            }
        }
        // displaying the array
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        // another way
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }


    }
}
