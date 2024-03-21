package chapter14_practice_set;

import java.util.Scanner;

class CustomException extends Exception {
    @Override
    public String toString() {
        return "Custom  Exception Occured!";
    }

    @Override
    public String getMessage() {
        return "Array Index Is Out Of The Bound";
    }
}

public class Question4_Again {
    public static int check(int input) throws CustomException {
        if (input > 5) {
            throw new CustomException();
        }
        return input;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        boolean flag = true;

        Scanner scan = new Scanner(System.in);
        int index;
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.print("Enter The Index Value : ");
                index = scan.nextInt();
                int ind = check(index);
                System.out.println("The Value Of array[index] is : " + array[ind]);
                break;

            } catch (CustomException e) {
                System.out.println();
                System.out.println(e);
                System.out.println(e.getMessage());
                System.out.println();
            }
            i++;
        }
        if (i >= 5) {
            System.out.println("You Have Reached Maximum Numbers of Attempts");
            System.out.println("Program Exited");
        }
    }
}
