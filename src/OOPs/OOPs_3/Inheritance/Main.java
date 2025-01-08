package OOPs.OOPs_3.Inheritance;

public class Main {
    public static void main(String[] args) {

        Box obj1 = new Box(2,3,4);
        Box obj2 = new Box(obj1);
        System.out.println(obj2.l +", "+obj2.w+", " + obj2.h);

        BoxWeight obj3 = new BoxWeight();
        System.out.println(obj3.weight+", "+ obj3.w);


        Box obj4 = new BoxWeight(33,11,66,22);
//        System.out.println(obj4.weight); // error, cannot access
// this is reference type Box and is referencing to object type of BoxWeight
//it is the type of the reference variable — not the type of the object that it refers to—
// that determines what members can be accessed.
// obj4 can access all the members of Box but can't access BoxWeight members
//When a reference to a subclass object is assigned to a superclass reference variable, you will have access only to
//those parts of the object defined by the superclass.
// here when BoxWeight constructor is called, the parent call constructor is also called through super,
// hence initializing parent class variable


//        BoxWeight obj5 = new Box(11,66,22);
// there are many variable in both parent and child classed
// we are given access to variable that are in the ref type i.e, BoxWeight
// hence, we should have access to weight variable
// this also means, that the ones we are trying to access should be initialised
// but here, when the obj itself is of type parent class, how will we call the constructor
// this is why error
// so, we cannot do child ref variable and parent object
    }
}
