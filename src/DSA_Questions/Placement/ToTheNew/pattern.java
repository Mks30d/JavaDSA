package DSA_Questions.Placement.ToTheNew;

public class pattern {

    public static void main(String[] args) {
        String str = "          ";
        for (int i = 0; i < 5; i++) {
            System.out.println(str.substring(0, i) +"*");
        }
        for (int i = 3; i >= 0; i--) {
            System.out.println(str.substring(0, i) +"*");
        }

    }
}
