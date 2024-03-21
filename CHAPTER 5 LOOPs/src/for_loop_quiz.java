import java.util.Scanner;
public class for_loop_quiz {
    public static void main(String[] args) {
        System.out.print("enter number : ");
        Scanner sc = new Scanner(System.in);
        int inputfromuser = sc.nextInt();


        //2n is for even numbers
        //2n + 1 is for even numbers

        for(int a = 1; a<=inputfromuser; a++){
            if(a%2!=0){
                System.out.println(a);

                //another way as per harry
                // System.out.println(2*a+1);   //as 2*a
            }
        }
    }
}
