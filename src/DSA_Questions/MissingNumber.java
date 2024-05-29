package DSA_Questions;
import java.lang.reflect.Array;
import java.util.*;

public class MissingNumber {
    static int missingNumber(int array[], int n) {
        int arr[] = new int[n ];
        for (int i = 0; i < array.length; i++) {
            arr[array[i]-1] = array[i];
        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < array.length; i++) {
            if (arr[i] == 0) {
//                System.out.println(i+1);
                return  i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n =10;
//        int array[] = {1,2,3,5};
         int array[] = {6,1,2,8,3,4,7,10,5};

        System.out.println(missingNumber(array, n));;

    }
}
