package DSA_Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SpiralMatrix {

    static void spiralMatrix(int[][] matrix) {
        int n= matrix[0].length, top =0, bottom = n-1, left=0, right =n-1 ;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right ; i++) {
                System.out.println(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom ; i++) {
                System.out.println(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(matrix[i][left]);
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1,  2,  3,  4},
//                {12, 13, 14, 5},
//                {11, 16, 15, 6},
//                {10, 9,  8,  7}
//        };
        int[][] matrix = {
                {1,  2,  3},
                {10, 11, 4},
                {9, 12, 5},
                {8, 7,  6}
        };
//        int[][] matrix = {
//                {1},
//                {2},
//                {3},
//                {4}
//        };
//        int[][] matrix = {
//                {1,  2,  3,  4},
//        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        spiralMatrix(matrix);
    }
}
