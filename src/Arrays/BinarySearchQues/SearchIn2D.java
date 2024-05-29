package Arrays.BinarySearchQues;

import java.util.Arrays;

public class SearchIn2D {  
    public static void main(String[] args) {

        // search in 2D matrix when matrix is sorted in row wise and column wise manner
        int[][] arr = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 18, 28, 38, 48 },
                        { 19, 29, 39, 49 } };

        int target = 28;

        System.out.println( Arrays.toString(searchIn2D(arr, target)) 
        );
    }

    public static int[] searchIn2D(int[][] arr, int target) {

        int row = 0, col = arr.length - 1;
        int[] ans = {-1,-1};

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {

                return new int[] { row, col };// OR
                // ans[0]= row;
                // ans[1] = col;
                // return ans;  
            }

            if (target < arr[row][col]) {
                col--;
            } else { // (target > arr[row][col])
                row++;
            }
        }

        return new int[]{-1,-1};  // OR
        // return ans;
    }
}
