package Arrays.BinarySearchQues;

public class MinInRotatedArray {

    static int minNumber(int arr[], int low, int high) {
        int pivot = findPivot(arr, high);

        return arr[pivot + 1];
    }

    static int findPivot(int arr[], int n) {
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 13, 24, 1,2 };

        System.out.println(minNumber(arr, 0, arr.length));
    }
}
