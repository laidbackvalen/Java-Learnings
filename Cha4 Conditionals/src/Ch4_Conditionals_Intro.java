import java.util.Scanner;

public class Ch4_Conditionals_Intro {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = s.nextInt();


//        System.out.println("your age is "+age);

        if(age>18){
            System.out.println("your age is above 18");
        } else if (age==18) {
            System.out.println("it's a match, your age is 18");
        }
        else{
            System.out.println("your age is below 18");
        }
    }
}