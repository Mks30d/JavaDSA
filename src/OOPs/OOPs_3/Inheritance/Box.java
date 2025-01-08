package OOPs.OOPs_3.Inheritance;

public class Box {
    int l, w, h;
    int weight;
    Box() {
//        super(); // refer to object class
        l = -1;
        w = -1;
        h = -1;
        weight = -11;
    }
    Box(int side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }
    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
