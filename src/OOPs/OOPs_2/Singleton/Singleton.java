package OOPs.OOPs_2.Singleton;
// Singleton class ensures a class has only one instance/object and provides a global point of access to it.
public class Singleton {
    private Singleton() {}
    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // getInstance is static b/c it getting access through class name as external object can't be created and
    // its return type is Singleton as it return object of Singleton class
}
