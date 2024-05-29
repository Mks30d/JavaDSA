package Arrays.BinarySearchQues;

// Find postition of an element in sorted array of infinite numbers(we can't use arr.lenght or array length unknown)
public class InfiniteArray {

        public static int infiniteArray(int[] arr, int target) {
        // first start with a box of size 2
        int start = 0, end = 1;

        // condition to find range(start & end) in which target lies
        while (target > arr[end]) {
            int newStart = end + 1; // this is new start index
            //double the box size
            // newEnd = previous end index + sizeOfBox *2
            end = end + (end - (start - 1)) * 2; // new end index
            start = newStart;
        }

        int ans = binarySearch(arr, target, start, end);
        return ans;
    }
    

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
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


    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 170 };
        int target = 10;
        System.out.println(infiniteArray(arr, target));
    }
}
