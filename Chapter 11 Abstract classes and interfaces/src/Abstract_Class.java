//it sets standard to create classes
//you cannot create object of abstract class as it's
//not a  concrete class it's just a standard form, using it you create concrete class
//here we have created child1 as a concrete class

abstract class Parent {    //if a class includes abstract methods than the class itself must be declared abstract

    public Parent() {  //in interface you cannot create constructors //in abstract class you can
        System.out.println("\nI am The Constructor Of Parent Class");
    }

    public void hi() {
        System.out.println("\nAbe o...");
    }

    //if a class includes abstract methods than the class itself must be declared abstract
    abstract public void greet();   //abstract method  //abstract method have no implementation
                                                       //A Method that is declared without implementation

}

class Child1 extends Parent {  //this class should either be declared abstract or,
                               //  implement abstract method 'greet()' from 'parent'

    @Override
    public void greet() {  //abstract method of parent class
        System.out.println("chal nikal");
    }


    public void hello() {
        System.out.println("hello");
    }
}

class Child2 extends Parent {  //Class 'child2' must either be declared abstract or implement abstract method 'greet()' in 'parent
    public void print() {
        System.out.println("kcuf uoy");
    }

    public void greet() {
        System.out.println("chal nikal lawde");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {

        // Parent p = new Parent(); //'Parent' is abstract; cannot be instantiated
        Child1 c = new Child1();
        c.hi();
        c.greet();
        c.hello();
        //Child2 v = new Child2(); //'Child2' is abstract; cannot be instantiated


    }
}
