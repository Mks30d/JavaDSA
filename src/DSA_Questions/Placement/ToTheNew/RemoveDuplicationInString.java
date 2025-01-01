package DSA_Questions.Placement.ToTheNew;

public class RemoveDuplicationInString {
    public static void removeDuplication(String str) {
        int i = 0, j = 1;

        while (j < str.length()) {
            char ch1 = str.charAt(i), ch2 = str.charAt(j);

            if (ch1 == ch2) {
                str = str.substring(0, i) + str.substring(j + 1);
                i = 0;
                j = 1;
                System.out.println(str);
                continue;
            }
            i++;
            j++;
        }

        System.out.println(str);
    }

    public static void main(String[] args) {
//        String str= "abbacd";
        String str = "abbacdee";
//        String str = "abcd";
        removeDuplication(str);
    }
}
