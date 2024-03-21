import java.util.Scanner;
public class Q5_factorial_loops {
    public static void main(String[] args) {
        System.out.println("Enter Number Whose Factorial You Want To Print : ");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double f = 1;

        for (double i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}
