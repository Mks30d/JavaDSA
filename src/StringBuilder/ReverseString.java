package StringBuilder;

public class ReverseString {
    public static void reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
//        //sb, type is not actually String but we can convert int String type using below code:
//        System.out.println(sb.toString());
        int n = sb.length();
        for (int i = 0; i < n/2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(n-1-i));
            sb.setCharAt(n-1-i, temp);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "hello";
        reverse(str);
    }
}
