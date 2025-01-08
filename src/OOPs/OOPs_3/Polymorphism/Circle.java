package OOPs.OOPs_3.Polymorphism;

public class Circle extends Shape{
    @Override
    void type() {
        System.out.println("Circle");
    }

//    @Override
    static void staticMethod() {
        System.out.println("Static Method in Circle");
    }
}
