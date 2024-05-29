package Arrays;

public class LinearSearchInRange {

    public static int searchInRange(int arr[], int target, int start, int end){

        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr[]= {4,1,5,-33,6,9}, target = 6, start=1, end=4;
        
        System.out.println(searchInRange(arr, target, start, end));
    }
}
