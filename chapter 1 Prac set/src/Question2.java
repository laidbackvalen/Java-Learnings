import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        System.out.println("enter mark of subject 1");
        int a = scann.nextInt();

        System.out.println("enter mark of subject 2");
        int b = scann.nextInt();

        System.out.println("enter mark of subject 3");
        int c = scann.nextInt();

        float cgpa = (a+b+c)/30f;

        System.out.println(cgpa);

    }

}
