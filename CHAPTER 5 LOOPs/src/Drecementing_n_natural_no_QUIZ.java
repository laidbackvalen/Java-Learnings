import java.util.Scanner;
public class Drecementing_n_natural_no_QUIZ {
    public static void main(String[] args) {

        System.out.print("Enter Natural Number : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int a=input; a!=0; a-- ){ //   or a>=1
            System.out.println(a);
        }
    }
}
