public class
 Recurssion {

    //static means you don't have to create object to use this method in main function
    //int is the data type this method will return
    //Factorial is the name of the method
    //int fac is the parameter with int data type

    static int factorial(int fac) {

        if (fac == 0 || fac == 1) {
            return 1;
        } else {
            return fac * factorial(fac - 1);
        }
    }

    //USING ITERATION FOR LOOP
    static int factorial_iteration(int fac) {
        if (fac == 0 || fac == 1) {
            return 1;
        }
        else {
            int product = 1;

            for (int i = 1; i <= fac; i++) {
                product *= i;
            }
            return product;
        }

    }


    public static void main(String[] args) {

        int num = 5;

        System.out.println("The Factorial Is : " + factorial(num));
        System.out.println("The Factorial Is : " + factorial_iteration(num));
    }
}
