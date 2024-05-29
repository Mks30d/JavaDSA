package Arrays;

public class CallBy {

    static void update(int arr[], int num) {
        num = num + 10;  // unchanged in main, call by value
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;  // changed in main, call by reference
        }
    }

    public static void main(String[] args) {
        int arr[] = { 50, 60, 70 }, num = 10;
        
        update(arr, num); // call by reference: array when passed to a function, and any changed that
        // performed on a array then it is reflect in the array of the main function
        
        System.out.println("num: " + num);
        System.out.print("Updated array in main fun: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
