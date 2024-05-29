package Arrays.BinarySearchQues;

public class SingleElementInSortedArray {

    public static int singleElement(int[] arr) {
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }

        int start = 1, end = arr.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            if (mid % 2 == 0 && arr[mid] == arr[mid + 1] || mid % 2 == 1 && arr[mid] == arr[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1; 
            }
        }
        return -1;
    }

    // -------------- brute force ------------------
    public static int singleElement_1(int[] arr) {
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }
        for (int i = 1; i < arr.length - 2; i++) {
            int next = i + 1, previous = i - 1;
            if (arr[i] != arr[next] && arr[i] != arr[previous]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };

        System.out.println(singleElement(arr));
        System.out.println(singleElement_1(arr));
    }
}
