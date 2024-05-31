package DivideAndConquer;

import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);

    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pivotIndex = low - 1; // to make place for element smaller than pivot

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                pivotIndex++;
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
            }
        }
        pivotIndex++;
        int temp = arr[high];
        arr[high] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        return pivotIndex;
    }


//    static void quickSort(int[] arr, int low, int high) {
//        for (int i = 0; i < high; i++) {
//            int k = -1;
//            int pivot = arr[high];
//
//            if (pivot>arr[i]) {
//                k++;
//                int temp = arr[k];
//                arr[k] = arr[i];
//                arr[i] = temp;
//            }
//            k++;
//            int temp = arr[k];
//            arr[k] = arr[i];
//            arr[i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    public static void main(String[] args) {
//        int[] arr = {3, 1, 2, 4, 1, 5, 6, 2, 4};
        int[] arr = {6, 3, 9, 8, 2, 5};
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
