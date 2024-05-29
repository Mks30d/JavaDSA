package Arrays;

public class ReverseArray {

    public static void reverseArray(int arr[]){
        int start =0 , end = arr.length-1;

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        //arrays are passed by reference, so the changes in arr in reverseArray auto reflected in the main array
        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
