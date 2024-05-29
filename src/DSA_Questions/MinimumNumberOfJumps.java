package DSA_Questions;

public class MinimumNumberOfJumps {

    static int minJumps(int[] arr){
        int i=0, k=0, jump, n= arr.length;
        boolean reached = false;

        while (i<n) {
//            k++;
            jump = arr[i];
            i = i+jump;
            if (jump==0) {
                if (i==n-1) {
                    reached = true;
                    k++;
                    break;
                } else {
                    k=-1;
                    break;
                }
            }
            k++;
            if (i>=n) {
                reached = true;
//                i++;
            }
        }
        System.out.println(reached+"="+k);
        return 0;
    }

    public static void main(String[] args) {
//        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
//        int arr[] = {1, 4, 3, 2, 6, 7};
//        int arr[] = {1, 2, 3, 0, 6, 7};
//        int arr[] = {1, 2, 3, 0};
        int arr[] = {1};
        minJumps(arr);
    }
}
