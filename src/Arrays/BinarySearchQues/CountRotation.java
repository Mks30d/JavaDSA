package Arrays.BinarySearchQues;

public class CountRotation {
    
    public static int countRotation(int[] arr) {
        int pivot = findPivotIndex(arr);

        return pivot +1;
    }

    public static int findPivotIndex(int arr[]) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Pivot index: "+findPivotIndex(arr));
        System.out.println("Cound: "+countRotation(arr));

        // int start = 2147483647, end = Integer.MIN_VALUE;
        // int mid = start +(end-start)/2;
        // mid = start + end-1;
        // // mid= Math.addExact(end, start);

        // System.out.println(mid);

    }
}
