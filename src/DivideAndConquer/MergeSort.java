package DivideAndConquer;

import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;

        if (low >= high) {
            return;
        }
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }


    static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        //for leftover element of 1st sorted part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        //for leftover element of 2st sorted part
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy sorted elements to original array
        for (i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

//        System.out.println(Arrays.toString(arr));
//        arr = Arrays.copyOf(temp, temp.length);
//        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        int[] arr = {6, 3, 9, 5, 2, 8};
        int[] arr = {3,1,2,4,1,5,6,2,4};

        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
