public class Method_Overloading {

    static void foo() {
        System.out.println("Good Morning Bro!");
    }

    //METHOD OVERLOADING
    static void foo(int a) {  //same method with Parameters //if you don't provide argument when calling it will throw an error
        System.out.println("Good Morning " + a + " Bro!");
    }

    //METHOD OVERLOADING
    static void foo(int a, int b) {   //Parameters Are Set
        System.out.println("\nI LOVE YOU " + a + " TIMES Bro!");
        System.out.println("I LOVE YOU " + b + " TIMES Bro!");
    }


    public static void main(String[] args) {
        foo();
        foo(300);
        foo(10, 20); //Arguments Are Passed  //Arguments are actual values
    }
}
