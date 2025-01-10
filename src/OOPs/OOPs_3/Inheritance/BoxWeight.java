package OOPs.OOPs_3.Inheritance;

public class BoxWeight extends Box {
    int weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(int l, int h, int w, int weight) {
        super(l,h,w);  // call the parent class constructor,thus initialize values present in the parent class
        // if super is not used in the subclass constructor default constructor is called

        System.out.println(this.weight); // refer to child weight
        System.out.println(super.weight); // refer to parent class weight
        this.weight = weight;
//        super(l,h,w);  // error, as parent class variable must be initialized before child class initialization

    }
}
