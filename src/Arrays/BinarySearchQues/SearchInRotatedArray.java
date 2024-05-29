package Arrays.BinarySearchQues;

public class SearchInRotatedArray {

    public static int searchInRotatedArray(int[] arr, int target) {
        int pivot = findPivotIndex(arr);

        if (pivot == -1) { // when pivot is -1, it means array is normally sorted
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found then array has two half(left and right half) in ascending
        // order
        if (target == arr[pivot]) {
            return pivot;
        }
        // when target lies in the left half (0 to pivot-1)
        // if (arr[0] <= target && target <= arr[pivot - 1]) { // OR
        if (arr[0] <= target) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);

    }

    public static int findPivotIndex(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // --------- Searching w/o using finding pivot index ------------ anuj bhaiya yt
    public static int searchInRotatedArray_1(int[] arr, int target) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Left part sorted
            if (arr[start] <= arr[mid]) {
                // if (arr[start] <= target && target <= arr[mid - 1]) {
                if (arr[start] <= target && target < arr[mid]) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Right part sorted
            else {
                // if (arr[mid + 1] <= target && target <= arr[end]) {
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // --------- Searching w/o using finding pivot index with duplicate value ------------ TUF
    public static int searchInRotatedArrayWithDuplicate(int[] arr, int target) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }

            // Left part sorted
            if (arr[start] <= arr[mid]) {
                // if (arr[start] <= target && target <= arr[mid - 1]) {
                if (arr[start] <= target && target < arr[mid]) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Right part sorted
            else {
                // if (arr[mid + 1] <= target && target <= arr[end]) {
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        // int[] nums = { 20, 30, 40, 50, 60, 70 };
        int[] nums = { 20, 30, 40, 50, 60, 5, 10 };
        int[] nums1 = { 3, 1 };

        int target = 1;

        System.out.println("Pivot index: " + findPivotIndex(nums));
        System.out.println("Target index: " + searchInRotatedArray(nums1, target));
        System.out.println(searchInRotatedArray_1(nums1, target));
    }
}
