public class ImpConcept {

//    (n--) vs (--n)
    public static void impConcept(int n) {
        if (n==0) {
            return;
        }
        System.out.println(n);
        impConcept(--n);  // n will be decremented first then it is passed in the func
//        impConcept(n--); // n will be passed first then it is decremented by 1, that's why it will create an infinity loop as it will always pass n and not n-1
    }
    public static void main(String[] args) {
        impConcept(3);
    }
}
