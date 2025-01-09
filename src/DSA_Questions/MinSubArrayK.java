package DSA_Questions;

public class MinSubArrayK {

    public static int[] minSubArrayK(int[] arr, int k) {
        int[] newArr = new int[k];
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length-3; i++) {
            int sum=0;
            for (int j = 0; j < k; j++) {
                sum += arr[i+j];
            }
            if (sum<minSum) {
                minSum = sum;
                for (int j = 0; j < k; j++) {
                    newArr[j] = arr[i+j];
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
//        int[] arr = {3,2,1,-4,6,3,1};
        int[] arr = {25,11,12,21,25,11};
        int[] storage  = minSubArrayK(arr, 2);
//        System.out.println();
        for (int i = 0; i < storage.length; i++) {
            System.out.print(storage[i]+ ", ");
        }
    }
}
