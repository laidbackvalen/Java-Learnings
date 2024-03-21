
import java.util.Scanner;
public class Ch4_Prac_Q2 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter Your Marks In Subject 1 : ");
        double sub1 = sca.nextDouble();
        System.out.println("Enter Your Marks In Subject 2 : ");
        double sub2 = sca.nextDouble();
        System.out.println("Enter Your Marks In Subject 3 : ");
        double sub3 = sca.nextDouble();

        System.out.println("Out Of Total Marks : ");
        double outof = sca.nextDouble();

        double total = sub1 + sub2 + sub3;
        double percentage = (total / outof)*100;



        if(percentage>=40){

            if(sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("you have passed this exam with :"+percentage + " Percentage");
            }
            else{
                System.out.println("you don't fit in minimum 33 marks criteria in each subject");
            }

        }
        else if (percentage<40) {
            System.out.println("you have failed you got:"+percentage + " Percentage");
        }

        else{
            System.out.println("invalid input");
        }
    }
}
