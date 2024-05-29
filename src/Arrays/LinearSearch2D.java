package Arrays;

import java.util.Arrays;

public class LinearSearch2D {

    public static int[] linearSearch2D(int arr[][], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int Max2D(int arr[][]){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max= arr[i][j];
                }
            }
        }

        // foreach loop
        // for(int[] row : arr){
        //     for(int element : row){
        //         if (element > max) {
        //             max = element;
        //         }
        //     }
        // }

        return max;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 } };

        int[] result = linearSearch2D(arr, 6);
        System.out.println(Arrays.toString(result));

        System.out.println(Max2D(arr));

    }
}
