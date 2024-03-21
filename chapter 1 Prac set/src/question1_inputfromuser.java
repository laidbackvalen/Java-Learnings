import java.util.Scanner;
public class question1_inputfromuser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number1 :");
        int a = scan.nextInt();

        System.out.println("enter number2 :");
        int b = scan.nextInt();

        System.out.println("enter number3 :");
        int c = scan.nextInt();

        int sum = a+b+c;

        System.out.println("the sum of your numbers is :"+sum);
    }
}
