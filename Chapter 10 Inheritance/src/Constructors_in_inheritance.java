class Base1 {
    int num;

    public Base1() { //constructor
        System.out.println("I am a Default constructor from Base1 class");
    }
    /*
    CONSTRUCTOR DURING CONSTRUCTOR OVERLOADING

    When there are multiple constructors in the parent class, the constructor without
    any parameters is called from the child class as default.

    if we want to call the constructor with parameters from the parent class, we need to use
    "SUPER KEYWORD"

    */
    public Base1(int c) {   //constructor overloading
        System.out.println("I am a Overloaded Constructor of Base1 Class With The Value Of x : " + c);
    }
}




class Derived1 extends Base1 {


    public Derived1() {      //constructor

//        super(0); // Calls The Constructor from the parent class which takes 1 parametes (values)
        // if we don't use super keyword, base1 constructor with no parameters will be executed by deafult


        /*  The super keyword refers to superclass (parent) objects.
            It is used to call superclass methods, and to access the superclass constructor.
            The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses
            that have methods with the same name.
        */

        System.out.println("I am Default Constructor from Derived1 Class");
    }

    public Derived1(int x, int y) {   //constructor overloading
        super(x);
        System.out.println("I am a Overloaded Constructor of Derived1 class With The Value Of y : " + y);
    }
}




class ChildOfDerived extends Derived1{
   public ChildOfDerived(){
       System.out.println("I am a Default Constructor Of ChildOfDerived class");

    }

public ChildOfDerived(int x, int y, int z){
    super(x, y);
    System.out.println("I am a Overloaded Constructor of childofderived class With The Value Of z : " + z);

    }
}






public class Constructors_in_inheritance {
    public static void main(String[] args) {

//         Base1 b = new Base1();
//         Derived1 d = new Derived1();

//         When a Derived class is extended from the base class, the constructor
//         of the Base class is executed first followed by the constructor of the derived class
//
//        constructors executes in top to bottom order

//        Derived1 e = new Derived1(10, 20);


        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cde = new ChildOfDerived(1,2,3);
    }
}
