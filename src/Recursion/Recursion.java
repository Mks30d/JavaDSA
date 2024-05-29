package Recursion;

public class Recursion {

    public static void main(String[] args) {
        print(1);

    }

    public static void print(int n) {

        // Base condition
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);

        // Recursive call 
        //if we are calling a function again and again , we can treat it as separte call in stack

	// this is called tail recursion 
	// as this is the last function call
// when we have the last statement in the function call then it is called tail recursion
        print(n + 1);
    }
}
