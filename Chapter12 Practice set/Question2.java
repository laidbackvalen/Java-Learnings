import java.util.Scanner;

class InputFromTheUser {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    public void outPut() {
        System.out.println("You Have Enter : " + a);
    }

}

public class Question2 {
    public static void main(String[] args) {
        InputFromTheUser in = new InputFromTheUser();
        in.outPut();
        System.out.println("You have entered : " + in.a);
    }

}
