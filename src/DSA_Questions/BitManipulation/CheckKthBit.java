package DSA_Questions.BitManipulation;

public class CheckKthBit {
    static boolean checkKthBit(int n, int k) {
        // Your code here
        n = n & (1 << k);
        if(n != 0) {
            return true;
        }
        return false;
    }
}
