package DSA_Questions;

public class FirstAndLastOccurrence {

    static void firstAndLastOccurrence(int[] arr, int target, int left, int right) {

        int first = firstOccurrence(arr, target, left, right), last = -1;
        if (first!= -1) {
            last= lastOccurrence(arr, target, left, right) ;
        }

        System.out.println(first+", " + last);

//        return new int[] {first, last};
    }

    static int firstOccurrence(int[] arr, int target, int left, int right) {
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return first;
    }

    static int lastOccurrence(int[] arr, int target, int left, int right) {
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        int target = 6;
//        int[] nums = {3,3,3};
//        int target = 3;
//        int[] nums = {};
//        int target = 3;
//        int[] nums = {3};
//        int target = 3;
//        int[] nums = {1, 3};
//        int target = 3;
        firstAndLastOccurrence(nums, target, 0, nums.length - 1);
    }
}
