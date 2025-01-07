package OOPs.OOPs_2;

public class _2_Static {
    // we know that something which is non-static, belongs to an object  // this depends on objects
    void greeting() {
        System.out.println("Hello...");
    }

    // this does not depend on objects
    static void fun() {
        System.out.println("Function...");
//        greeting();  // we cannot use it b/c it require an instance,
//        but the function we are using it in does not depend on object/instance

        _2_Static obj = new _2_Static();
        obj.greeting();
    }

    public static void main(String[] args) {
//        greeting();

    }
}
