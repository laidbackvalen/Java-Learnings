package Excercise_6;

import java.util.Scanner;

class InvalidInput extends Exception {
    @Override
    public String toString() {
        return "Custom InvalidInput Class Exception ";
    }

    @Override
    public String getMessage() {
        return "You Have Provide Invalid Input";
    }

}

class MaxInput extends Exception {
    @Override
    public String toString() {
        return "Custom MaxInput Exception";
    }

    @Override
    public String getMessage() {
        return "Input cant be greater than 100000";
    }
}

class MathematicalException extends Exception {

    @Override
    public String toString() {
        return "Custom MathematicalException";
    }

    @Override
    public String getMessage() {
        return "Cannot divide by 0";
    }
}

class Custom_Calc {
    double add(double a, double b) throws MaxInput {
        if (a > 100000 || b > 100000) {
            throw new MaxInput();
        }

        double c = a + b;
        return c;
    }

    double subtract(double a, double b) throws MaxInput {
        if (a > 100000 || b > 100000) {
            throw new MaxInput();

        }

        return a - b;

    }

    double divide(double a, double b) throws MathematicalException, MaxInput {
        if (a > 100000 || b > 100000) {
            throw new MaxInput();
        }
        if (b == 0) {
            throw new MathematicalException();
        }
        double c = a / b;
        return c;
    }

    double multiply(double a, double b) throws MaxInput {
        if (a > 100000 || b > 100000) {
            throw new MaxInput();
        }
        double c = a * b;
        return c;
    }

}

public class Excercise6 {
    public static void main(String[] args) throws MaxInput, MathematicalException, InvalidInput { //throws MathematicalException
           /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter The Value Of Num1 : ");
        double a = sc.nextDouble();
        System.out.print("Enter The Value Of Num2 : ");
        double b = sc.nextDouble();

        System.out.print("Choose Operator From These  + - * /  :  ");
        String choose_operator = sc.next();


        Custom_Calc c = new Custom_Calc();

        switch (choose_operator) {

            case "+":
                try {
                    System.out.println(c.add(a, b));
                } catch (MaxInput e) {
                    System.out.println();
                }
                break;


            case "-":
                try {
                    System.out.println(c.subtract(a, b));
                } catch (MaxInput e) {
                    System.out.println();
                }
                break;

            case "*":
                try {
                    System.out.println(c.multiply(a, b));
                } catch (MaxInput e) {
                    System.out.println();
                }
                break;

            case "/":
                try {
                    System.out.println(c.divide(a, b));
                } catch (MathematicalException e) {
                    System.out.println(e);
                    System.out.println(e.getMessage());
                }

                break;

            default:
                System.out.println("Invalid Arethmatic Expression");
                break;
        }
    }


    //      System.out.println(c.divide(a,b));
}

