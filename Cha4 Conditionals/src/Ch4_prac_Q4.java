import java.util.Scanner;

public class Ch4_prac_Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7 to know which day it is of a week");
        int day = s.nextInt();

        switch(day) {
            case 1:
                System.out.println("it's monday");
                break;
            case 2:
                System.out.println("it's tuesday");
                break;
            case 3:
                System.out.println("it's wednesday");
                break;
            case 4:
                System.out.println("it's thrusday");
                break;
            case 5:
                System.out.println("it's friday");
                break;
            case 6:
                System.out.println("it's saturday");
                break;
            case 7:
                System.out.println("it's sunday");
                break;
        }

    }
}
