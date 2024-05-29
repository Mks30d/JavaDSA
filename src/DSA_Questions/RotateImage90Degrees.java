package DSA_Questions;

//48. Rotate Image
//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//        1  2  3
//        4  5  6
//        7  8  9
//        -----Rotate Image----
//        7  4  1
//        8  5  2
//        9  6  3


public class RotateImage90Degrees {

    public static void display(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
            System.out.println("----------------------");
    }

    public static void swap(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        display(matrix);
    }

    public static void reverse(int[][] matrix) {
        int n = matrix.length;
//        int a= n%2, b = n/2, mid = a+b;
        int mid = (n)/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mid; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        display(matrix);
    }

    public static void rotate(int[][] matrix) {
        swap(matrix);

        reverse(matrix);
    }

    public static void main(String[] args) {

//        int[][] matrix = {{5,2,3,5},{4,4,3,1},{2,8,6,9},{1,0,7,6}};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix[0].length;
        int arr[][] = new int[n][n];
//        int n = matrix.length;
//        int a= n%2, b = n/2, mid = a+b;
//        System.out.println(mid);
        display(matrix);

        rotate(matrix);

        // for (int i = 0; i < col; i++) {
        //     for (int j = 0; j < col; j++) {
        //         arr[i][j] = matrix[i][j];
        //     }
        // }

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < col; j++) {
//                matrix[j][i] = matrix[i][j];
//            }
//        }

    }

}

