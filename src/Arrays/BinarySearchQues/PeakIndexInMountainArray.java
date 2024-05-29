package Arrays.BinarySearchQues;

public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in descending part of array
                // this may be the max, but look at LHS
                // this is why end != mid-1
                end = mid;
            } else {  // arr[mid] < arr[mid + 1]
                // you are in ascending part of array
                start = mid + 1; // cuz we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number cuz of the 2
        // checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to jsut one element, that is the max one cuz
        // that is what the checks say

        return start; // or return end as both are equal
    }

    public static int peakIndexInMountainArray_2(int[] arr) {

        int n = arr.length; // Size of array

        // Edge cases:
        if (n == 1)
            return 0;
        if (arr[0] > arr[1])
            return 0;
        if (arr[n - 1] > arr[n - 2])
            return n - 1;

        int start = 1, end = n - 2; // cuz first and last element condition are checked above

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((arr[mid - 1] < arr[mid]) &&
                    (arr[mid] > arr[mid + 1])) {
                return mid;
            }

            if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else { // arr[mid] > arr[mid + 1]
                end = mid - 1;
            }
        }
        return -1;
    }

    //------------ not working for arr2 = { 3, 5, 3, 2, 0 }; ------------
    public static int peakIndexInMountainArray_3(int[] arr) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((mid > start && arr[mid - 1] < arr[mid]) &&
                    (mid < end && arr[mid] > arr[mid + 1])) {
                return mid;
            }

            if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else { // arr[mid] > arr[mid + 1]
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 4, 3, 2 };
        int[] arr1 = { 3, 4, 5, 1 };
        int[] arr2 = { 3, 5, 3, 2, 0 };
        System.out.println(peakIndexInMountainArray(arr2));
        System.out.println(peakIndexInMountainArray_2(arr2));
        System.out.println(peakIndexInMountainArray_3(arr2));
    }
}
