import java.util.Scanner;

public class
Q1_CH7_Multiplication_Table_Using_Methods {
    static void multiplication_table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d \n", num, i, num * i);
        }
    }

    public static void main(String[] args) {

        int x = 10;
        multiplication_table(x);

        //USING USER INPUT
        System.out.println("Enter Number Who's Multiplication Table You Want to Print : ");
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();

        multiplication_table(y);

    }

}
