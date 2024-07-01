package Arrays;

public class BinarySearch {

    // ----------------Ascending Order--------------------
    static int ascendingBinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2; // might be possible (start + end) exceeds the range of int in java
            mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // ----------------descending Order--------------------
    public static int descendingBinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    // ----------------When the order of the sorted array is not given--------------------

    public static int orderAgnosticBinarySearch(int[] arr, int target) {

        int start = 0, end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end]; // it asign true or false
        System.out.println("isAscending: " + isAscending);

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { -6, 0, 3, 4, 8, 33 };
        int[] arr = {2,6,7,9,10,12};
        int target = 9;
        System.out.println(ascendingBinarySearch(arr, target));

        int[] arr1 = { 33, 22, 11, 5, 3, -22 };
        int target1 = 3;

        int[] arr2 = { 3, 3, 4, 7 };

        // System.out.println(descendingBinarySearch(arr1, target1));

        System.out.println(orderAgnosticBinarySearch(arr, target));
    }
}
