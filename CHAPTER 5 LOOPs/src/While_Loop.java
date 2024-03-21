import java.util.Scanner;
public class While_Loop {
    public static void main(String[] args) {


//        int a = 100;
//        while(a<=200){
//            System.out.println(a);
//            a++;
//
//        }
//
        int b = 0;
        System.out.print("Enter Till When You Want To Print In Digits : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        while (b <= input) {
            System.out.println(b);
            b++;
        }
    }
}
