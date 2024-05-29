package Arrays.BinarySearchQues;

// The pivot element is the only element in sorted and rotated array which is greater than it's next element. 
// OR smaller than it's previous element.
// A pivot element divided a sorted rotated array into two monotonically increasing array.
public class FindPivotIndex {

    public static int findPivotIndex(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) { // mid < end cuz when mid = (arr.lenght-1) index, then (mid+1) is out of bound
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {// mid > start cuz when mid = 0 index, then (mid-1) is out of bound
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else { // if(arr[start] < arr[mid])
                start = mid + 1;
            }
        }
        return -1; // when array is non-rotated and is sorted
    }


    // ------------- find pivot when array has duplicate values---------------
    public static int findPivotIndexWithDuplicate(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        // int[] arr = { 20,40, 50, 90, 100, 110 };
        // int[] arr = { 50, 60, 90, 100, 20, 30, 40 };
        // int[] arr = { 20, 30, 40, 50, 60, 5, 10 };
        int[] arr1 = { 13, 24, 1 };
        int[] arr3 = { 2, 9, 2, 2, 2 };
        int[] arr4 = { 3, 4, 5, 0, 0, 1, 2 };
        int[] arr2 = { 9, 0, 1, 2, 9, 9, 9, 9, 9 };
        int[] arr5 = { 3, 3, 4, 1, 2, 3, 3, 3, 3 };
        int[] arr6 = { 1, 2, 3, 9 };

        int[] arr11 = {};
        int[] arr22 = { 3, 3, 3, 4, 5, 3 };
        int[] arr33 = { 7, 8, 8, 1, 2, 3, 4, 5 };
        int[] arr44 = { 4, 5, 6, 7, 8, 8, 2 };
        int[] arr55 = { 6, 7, 8, 8, 9, 4, 5 };
        int[] arr66 = { 5, 5, 5, 5, 5, 5, 5, 1, 5, 5 };
        int[] arr77 = { 1 };
        int[] arr88 = { 2, 1 };

        System.out.println(findPivotIndex(arr22));

        int pivotIndex = findPivotIndexWithDuplicate(arr22);
        System.out.println(pivotIndex);

    }
}
