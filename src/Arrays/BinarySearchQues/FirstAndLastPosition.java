package Arrays.BinarySearchQues;

import java.util.Arrays;

public class FirstAndLastPosition {

    // ----------------- Method 1 using binary search --------------------

    public static int[] firstAndLastPosition(int[] arr, int target) {
        int[] ans = { -1, -1 };

        ans[0] = findOccurrence(arr, target, true);     // true as we are searching for first index
        if (ans[0] != -1) {                                               // if ans[0] == -1, it means target is not present in the array, so we dont need to check for last occurrence
            ans[1] = findOccurrence(arr, target, false);// false as we are searching for last index
        }
        return ans;
    }

    public static int findOccurrence(int[] arr, int target, boolean findingFirstIndex) {
        int start = 0, end = arr.length - 1, indexFound = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                indexFound = mid;

                if (findingFirstIndex) { // if we are searching for first occurrence then it will present to the left
                    end = mid - 1;
                } else {
                    start = mid + 1; // if we are searching for the last occurrence then it present to the right
                }
            }
        }
        return indexFound;
    }

    // ----------------- Method 2 using binary search --------------------
    public static int[] firstAndLastPosition1(int[] arr, int target) {
        int first = firstOccurrence(arr, target), last = -1;
        if (first != -1) {
            last = lastOccurrence(arr, target);
        }
        return new int[] { first, last };
    }

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                first = mid; // this may be the answer, still we search for first occurrence to left
                end = mid - 1; // if we are searching for first occurrence then it will present to the left
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int last = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else { // only this condition changes in binary search
                last = mid; // this may be the answer, still we search for last occurrence to right
                start = mid + 1; // if we are searching for the last occurrence then it present to the right
            }
        }
        return last;
    }

    // ----------------- Brute Force --------------------
    public static int[] firstAndLastPosition2(int[] arr, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i; // after this first(-1) changes to first occurrence(i) and this never execute
                               // again
                }
                last = i;
            }
        }
        return new int[]{ first, last };
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 7, 7, 8, 8, 10 };
        int target = 7;

        int[] ans = firstAndLastPosition(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
