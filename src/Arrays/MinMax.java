package Arrays;

public class MinMax {

    public static int minimum(int arr[]) {
        int min = arr[0], index=0;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                index =i;
                min = arr[i];
            }
        }
        System.out.println("index: "+index);
        return min;
    }

    public static int maximum(int arr[]) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = { 6, 1, 40, 33, -5 };

        System.out.println(minimum(arr));
        System.out.println(maximum(arr));
    }
}


