package OOPs.OOPs_3.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Circle circle1 = new Circle();

        shape.type(); // Shape
        circle.type(); // Circle
        rectangle.type(); //Rectangle
        circle1.type(); // Circle

        circle.staticMethod();
    }
}

