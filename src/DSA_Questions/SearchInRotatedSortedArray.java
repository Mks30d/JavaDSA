package DSA_Questions;

public class SearchInRotatedSortedArray {

    static void  searchInRotatedSortedArray(int[] arr, int target) {

        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low) /2;

            if (arr[mid] == target){
                System.out.println(mid);
                return;
            }
            if (arr[mid] < target && target < arr[high]) {
                low = mid +1;
            }
            else  {
//                high= mid-1;
                if (target < arr[high]) {
                    low = mid +1;
                }
                else
                    high = mid-1;
            }
        }



//        int pivotIndex = pivotIndex(arr);
//        System.out.println(pivotIndex);

    }
    static int pivotIndex(int[] arr) {
        int low = 0, high = arr.length-1, pivotIndex = -1;

        while (low<= high) {
            int mid = low  + (high-low)/2;

            if (arr[mid] > arr[mid-1]){
                pivotIndex = mid;
                low = mid+1;
            } else {
                high= mid-1;
            }
        }
        return  pivotIndex;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        searchInRotatedSortedArray(arr, target);
    }
}
