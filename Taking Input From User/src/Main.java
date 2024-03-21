
import java.util.Scanner;  //importing scanner utility class to take input from the user

public class Main {
    public static void main(String[] args) {




System.out.println("Taking Input From User");


       Scanner sca = new Scanner(System.in); //system.in is use to specify that we will read input from the keyboard

        System.out.println("Enter The Number 1 here");
        int a = sca.nextInt(); //taking input as integer
//        float a = sca.nextInt();

        System.out.println("Enter The Number 2 here");
        int b = sca.nextInt();

        int sum = a+b;
        System.out.println("The Answer Is: " +sum);


        System.out.println("Enter Anything below and i'll tell you if it's int or not");
        boolean c = sca.hasNextInt(); //this is use to check validity of input
        System.out.println(c);




    }
}