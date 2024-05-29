package Arrays.BinarySearchQues;

public class FindInMountainArray {

    // 1095. Find in Mountain Array
    // Example 1:
    // Input: array = [1,2,3,4,5,3,1], target = 3
    // Output: 2
    // Explanation: 3 exists in the array, at index=2 and index=5. Return the
    // minimum index, which is 2.

    // Example 2:
    // Input: array = [0,1,2,4,2,1], target = 3
    // Output: -1
    // Explanation: 3 does not exist in the array, so we return -1.

    public static int findInMountainArray(int[] arr, int target) {

        // find the peak element index first, then from 0 to peak index the elements are
        // in ascending order
        // and from peak to arr.lenght-1 the elements are in decending order
        // so we can use order agnostic binary search to search in the first
        // half(ascending) and second half (decending) of array to find the index of
        // target
        // if first half contain target element then return the its index and no need to
        // search in the second half
        // but if first half does not contain target then only search for target in
        // second half

        int peak = peakIndexInMountainArray(arr);

        int firstHalf = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstHalf != -1) {
            return firstHalf;
        }

        int lastHalf = orderAgnosticBinarySearch(arr, target, peak, arr.length - 1);
        return lastHalf;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1, -1 };
        int target = 4;

        System.out.println(findInMountainArray(arr, target));
    }
}
