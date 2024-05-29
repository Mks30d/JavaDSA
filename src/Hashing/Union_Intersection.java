package Hashing;

import java.util.HashSet;

public class Union_Intersection {

    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> hs = new HashSet<>();

        //--------Union-------
        for (int ele : arr1) {
            hs.add(ele);
        }
        for (int ele : arr2) {
            hs.add(ele);
        }
        System.out.println(hs);
        System.out.println("Union: "+hs.size());

        // --------Intersection--------
        hs.clear();
        for (int ele : arr1) {
            hs.add(ele);
        }
        int count =0;
        for (int ele: arr2) {
            if (hs.contains(ele)) {
                count++;
                hs.remove(ele);
            }
        }
        System.out.println("Intersection: "+count);







//        HashSet<Integer> hm1 = new HashSet<>();
//        for (int ele : arr1) {
//            hm1.add(ele);
//        }
//
//        HashSet<Integer> hm2 = new HashSet<>();
//        for (int ele : arr2) {
//            hm2.add(ele);
//        }
//
//        //Intersection
//        int k = 0;
//        for (int ele : hm1) {
//            if (hm2.contains(ele)) {
//                k++;
//            }
//        }
//        System.out.println(k);
//
//        //Union
//        hm2.addAll(hm1);  // OR
////        for (int ele : hm1) {
////            hm2.add(ele);
////        }
//        System.out.println(hm2);
    }
}
