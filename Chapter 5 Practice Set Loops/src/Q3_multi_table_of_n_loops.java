import java.util.Scanner;
public class Q3_multi_table_of_n_loops {
    public static void main(String[] args) {

        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i<=10;i++){
//            System.out.println(a + " x " + i + " = " + a*i ); //or like C Language
            System.out.printf("%d x %d = %d \n", a, i, a*i);
        }
    }
}
