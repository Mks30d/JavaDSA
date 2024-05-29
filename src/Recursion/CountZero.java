public class CountZero {
    static int countZero(int n) {
        if (n==0) {
            return 1;
        }
        if (n<10) {
            return 0;
        }
        if (n%10==0) {
            return 1+ countZero(n/10);
        }
        return  countZero(n/10);
    }

    static  int countZero_1(int n, int count){
        if (n==0){
            return count;
        }
        if (n%10==0){
            return countZero_1(n/10, count+1);
        }
        return countZero_1(n/10, count);
    }

    public static void main(String[] args) {
        int n=1204030;
        System.out.println(countZero(n));
        System.out.println(countZero_1(n,0));

    }
}
