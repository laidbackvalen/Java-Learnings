import java.util.Scanner;

public class Add_method {
  static int add(int x, int y) {     //method
        int z;
        z = x + y;
        return z;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Value Of Num1 : ");
        int a = scan.nextInt();
        System.out.print("Enter The Value Of Num2 : ");
        int b = scan.nextInt();

        int c;
//        c = add(a,b);

//        method innvocation using object creation
        Add_method object = new Add_method();
        c = object.add(a, b);

        //or c = add(a,b);   being a satic method we can do this as well

        System.out.println("The Sum Of Your Numbers Is : " + c);

    }
}
