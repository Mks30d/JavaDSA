package Arrays.SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {


    // ----------------best--------------------
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwap = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {   // comparing previous and current element
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwap = true;
                }
            }
            // for i=0; no swapping means the array is sorted already
            // so no need for further comparison
            if (isSwap == false) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // ------------------printing array after each step---------------
    public static void printArray(int arr[], int step) {
        System.out.print("Step " + step + ": ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void bubbleSort2(int arr[]) {
        int n = arr.length;
        int step = 0;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwap = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwap = true;
                }
                step++;
                // printArray(arr, step);   // OR
                System.out.println("Step "+step+": "+Arrays.toString(arr));

            }
            if (isSwap == false) {
                break;
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

        // ---------- Apna College ------------
    public static void bubbleSort1(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // check if swapping occurs
            boolean isSwap = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
                // System.out.println("Step " + (i * (n - 1) + j + 1) + ": " +
                // Arrays.toString(arr));

            }
            // for i=0; no swapping means the array is sorted already
            // so no need for further comparison
            if (isSwap == false)
                break;
            // System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 5, 4, 3, 2, 1 };
        int arr3[] = { 5, 4, -11, 0, 3, 2 };
        // bubbleSort(arr);
        bubbleSort2(arr);

        System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        //     if (i == arr.length-1) {
        //         return;
        //     } else {
        //         System.out.print(", ");
        //     }
        // }
    }
}
