import java.util.Scanner;
public class Ch4_Prac_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your income : ");
        int income = sc.nextInt();

        if(income<250000){
            System.out.println("you dont have to pay taxes");
        } else if (income>250000 && income<=500000) {
            System.out.println("You have to pay 5% of your income which is : " +(income-250000)*0.05);

        }else if (income>500000 && income<=1000000) {
            System.out.println("You have to pay 20% of your income which is : " +(income-500000 )*0.20);

        }else if (income>1000000 && income<2500000) {
            System.out.println("You have to pay 30% of your income which is : " +(income-1000000)*0.30);

        }

    }
}
