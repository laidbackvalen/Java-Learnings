import java.util.Scanner;
public class Do_While_Loop {
    public static void main(String[] args){

        System.out.print("Enter The Natural Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while(a <=n);
//       int  a= 10;
//        do{
//            System.out.println(a);
//            a--;
//        }while(a>=1);
    }
}
