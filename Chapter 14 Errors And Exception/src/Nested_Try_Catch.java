import java.util.Scanner;

public class Nested_Try_Catch {
    public static void main(String[] args) {

        int [] marks = new int[3];

        marks[0] = 10;
        marks[1] = 40;
        marks[2] = 30;

        Scanner scan = new Scanner(System.in);

        boolean flag = true;

        while(flag) {  //while Loop
            System.out.println();  //For NewLine

            System.out.print("Enter The Index Value  : ");
            int a = scan.nextInt();

            System.out.print("Enter The Number You Want To Divide It With : ");
            int b = scan.nextInt();

            System.out.println();  //For NewLine


            try {
                System.out.println("You Are In Nested Try Catch VIDEO");
                try {
                    System.out.println(
                            "Array Index" + "/" + "Number is : "+marks[a] / b);
                    flag = false;
                } catch (ArithmeticException e) {
                    System.out.println("Sorry This Does not Exists");
                    System.out.println("Exception In Level 2, The Exception Is : " + e);

                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }  //while loop ends here

        System.out.println();   //For NewLine
        System.out.println("Thanks for Using This Program!!!!");
    }
}
