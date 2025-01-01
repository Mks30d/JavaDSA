package DSA_Questions.Placement.Accenture;

import java.util.Arrays;

public class DivideArr {
    public static void divideArr(int[] arr) {
        int n = arr.length;
        int half = n / 2;
        int[] evenArr, oddArr;
        int even = 0, odd = 0;
        if (n % 2 == 0) {
            evenArr = new int[half];
            oddArr = new int[half];
        } else {
            evenArr = new int[half+1];
            oddArr = new int[half ];
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenArr[even] = arr[i];
//                System.out.println("even: "+ evenArr[even]);
                even++;
            } else {
                oddArr[odd] = arr[i];
//                System.out.println("odd: "+ oddArr[odd]);
                odd++;
            }
        }
        Arrays.sort(evenArr);
        Arrays.sort(oddArr);

        int evenLen = evenArr.length;
        int oddLen = oddArr.length;
        int secMaxEven = evenArr[evenLen - 2];
        int secMaxOdd = oddArr[oddLen - 2];


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));

        System.out.println(secMaxEven);
        System.out.println(secMaxOdd);

//        System.out.println("Sum : " + secMaxEven + secMaxOdd); // Sum: 34
        System.out.println("Sum: " + (secMaxEven + secMaxOdd)); // Sum: 7
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 7, 9};

        divideArr(arr);

//        int a = 5, b = 4;
//        System.out.println(a + b);
//        System.out.println("Sum: " + a + b);
//        System.out.println("Sum: " + (a + b));
    }
}