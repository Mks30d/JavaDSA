import java.util.Scanner;

public class BreakKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; true; i++) {
            System.out.print("Enter number : ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println(num);
        }

        // do {
        //     System.out.print("Enter number : ");
        //     int num = sc.nextInt();
        //     if (num % 10 == 0) {
        //         break;
        //     }
        //     System.out.println(num);
        // } while (true);
        System.out.println("Exit Loop");

    }
}
