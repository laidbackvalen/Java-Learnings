import java.util.Scanner;


public class question {
    public static void main(String[] args) {


        System.out.println("Enter Your Score In Each Subject One By One \n");
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter Marks Gained In Math : ");
        int subject1 = scan.nextInt();
        System.out.print("Enter Marks Gained In Science : ");
        int subject2 = scan.nextInt();
        System.out.print("Enter Marks Gained In English : ");
        int subject3 = scan.nextInt();
        System.out.print("Enter Marks Gained In Hindi : ");
        int subject4 = scan.nextInt();
        System.out.print("Enter Marks Gained In Social Studies : ");
        int subject5 = scan.nextInt();

        System.out.print("\n");
        System.out.print("Out Of Total Marks? : ");
        double outof = scan.nextInt();


        double total = subject1 + subject2 + subject3 + subject4 + subject5;

        double percentage =(total /outof)*100;  //or total / number of subjects // here total/5

        System.out.print("You Got " +percentage+ "% In Your Exam");


    }
}
