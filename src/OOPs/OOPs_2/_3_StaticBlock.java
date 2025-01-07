package OOPs.OOPs_2;

public class _3_StaticBlock {
    static int a = 5;
    static int b;

    // will only run once, when the first obj is created i.e, when the class is loaded for the first time 
    static {
        System.out.println("Runs only once");
        b = a * 2;
        System.out.println(b);
    }

    public static void main(String[] args) {

        System.out.println(a + "  " + b);
        _3_StaticBlock obj = new _3_StaticBlock();

        System.out.println(a + "  " + b);

        b = a * 3;
        System.out.println(a + "  " + b);

        _3_StaticBlock obj18 = new _3_StaticBlock();
        System.out.println(a + "  " + b);

    }
}
