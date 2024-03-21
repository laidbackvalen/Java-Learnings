import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        double num1 = sc.nextDouble();

        System.out.print("choose arethmetic expression from these : +  -  *  /  : ");
        String choose_operator = sc.next();

        System.out.print("Enter Number 2 : ");
        double num2 = sc.nextDouble();


        //ctrl + alt + l for formatting

        double res;

        switch (choose_operator) {

            case "+":
                res = num1 + num2;
                System.out.println("Your Answer :" + res);
                break;    //IF YOU DO NOT ADD BREAK, IT WILL EXECUTE THIS STATEMENT WITH EVERY STATEMENT BELOW THIS STATEMENT

            case "-":
                res = num1 - num2;
                System.out.println("Your Answer :" + res);
                break;

            case "*":
                res = num1 * num2;
                System.out.println("Your Answer :" + res);
                break;

            case "/":
                res = num1 / num2;
                System.out.println("Your Answer :" + res);
                break;

            default:
                System.out.println("invalid arethmatic expression");
        }


    }
}
