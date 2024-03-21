class A {
    int a;

    public int meth1() {
        return 4;
    }

    public void meth2(  ) {
        System.out.println("I am method 2 of Class A");
    }

}

class B extends A {
    @Override
    public void meth2() {   //METHOD OVER-RIDING
        System.out.println("I am Method 2 In Class B"); // <------- REDEFINING METHOD OF SUPER CLASS (IN SUBCLASS)
        /*

        If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

        In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class,
        it is known as method overriding

        Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
        */



        /*
        BY HARRY

        If the child class implements the same method present in the parent class again,
        it is known as method overriding.

        REDEFINING METHOD OF SUPER CLASS (IN SUBCLASS)
         */


        /*

        RULES FOR JAVA METHOD OVERRIDING

        1.  The method must have the same name as in the parent class
        2.  The method must have the same parameter as in the parent class.
        3.  There must be an IS-A relationship (inheritance).

        */


        /*
         Which method Cannot be overridden?
           A method declared final cannot be overridden.
           A method declared static cannot be overridden but can be re-declared.
           If a method cannot be inherited, then it cannot be overridden.

           */
    }

    public void meth3() {
        System.out.println("I am method 3 of Class B");
    }
}

public class Method_Override {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        System.out.println(a.meth1());

        B b = new B();
        b.meth3();
        b.meth2();
    }
}
