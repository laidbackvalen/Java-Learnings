import java.util.Scanner;

public class Ch4_Prac_Q5_leap_year {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year To Check Whether It's Leap or not : ");
        int year = scan.nextInt();

        if (year == 1900) {
            System.out.println("it's not a leap year");
        } else if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            System.out.println("it's leap year");
        } else {
            System.out.println("it's not a leap year");
        }
    }
}
