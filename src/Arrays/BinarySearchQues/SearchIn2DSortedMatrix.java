package Arrays.BinarySearchQues;

import java.util.Arrays;

public class SearchIn2DSortedMatrix {

    //-------- TC: O(log n*m)
    public static int[] searchIn2D(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        int start = 0, end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / m, col = mid % m;

            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            if (arr[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    //---------------- time compelxity = O(n)+O(log m)
    public static int[] searchIn2D2(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] <= target && target <= arr[i][arr[i].length - 1]) {

                int index = binarySearch(arr[i], target);
                return new int[] { i, index };
            }
        }
        return new int[] { -1, -1 };
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] arr = { { 3, 4, 7, 9 },
                { 12, 13, 16, 18 },
                { 20, 21, 23, 25 } };

        // System.out.println(Arrays.toString(searchIn2D2(arr, 25)));
        System.out.println(Arrays.toString(searchIn2D(arr, 9)));
    }
}
