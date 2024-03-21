import java.util.Scanner;

public class Q2_Sum_N_Even_Numbers_loops {
    public static void main(String[] args) {

        System.out.print("Enter Till What Number You Want To Print Even Numbers : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;    //sum + i =
            }
        }
        System.out.println(sum);

    }

}

