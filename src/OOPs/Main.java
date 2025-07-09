//// interface Father {
////     default void teach() {
////         System.out.println("Father teaches math.");
////     }
//// }
//
//// interface Mother {
////     default void teach() {
////         System.out.println("Mother teaches English.");
////     }
//// }
//
//// class Child implements Father, Mother {
////     // Must override to resolve conflict
////     @Override
////     public void teach() {
////         // Option 1: Call Father's implementation
////         Father.super.teach();
//
////         // Option 2: Call Mother's implementation
////         Mother.super.teach();
//
////         // Option 3: Provide a new implementation
////         System.out.println("Child learns coding!");
////     }
//// }
//
//// public class Main {
////     public static void main(String[] args) {
////         Child child = new Child();
////         child.teach();  // Output: "Father teaches math."
////     }
//// }
//
//// -------------------------------------------------------------------
//class Animal {
//    void sound() {
//        System.out.println("Animal makes sound");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Dog barks");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal a = new Dog();     // ✅ Upcasting
//        a.sound();                // Allowed
//
//        // a.bark();              // ❌ Not allowed: bark() not in Animal
//
//        Dog d = (Dog) a;          // ✅ Downcasting
//        d.bark();                 // Allowed: now we can call bark()
//    }
//}
