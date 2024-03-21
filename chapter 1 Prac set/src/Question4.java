import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Kilometers");
        double kilometer = s.nextDouble();

        double miles = kilometer/1.6;

        System.out.println("In Miles"+miles);

    }
}
