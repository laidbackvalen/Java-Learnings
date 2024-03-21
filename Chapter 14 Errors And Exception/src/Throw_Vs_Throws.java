import java.util.Scanner;
//THRE ARE TWO DIFFERENT THROW VS THROWS PROGRAM CHECK BOTH,
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return  "Radius Cannot Be Negative!";
    }

    @Override
    public String getMessage() {
        return  "Radius Cannot Be Negative!";
    }

}






public class Throw_Vs_Throws {
    public static double area(int r) throws NegativeRadiusException{

        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;

    }

    public static double areaOfCircle(int r){
        double result = Math.PI * r * r;
        return result;
    }
public static double divide(int a, int b) throws ArithmeticException{
//        if(b==0){
//            throw new ArithmeticException();
//        }
        int res = a/b;
        return res;
}






    public static void main(String[] args) throws NegativeRadiusException {  //if you don't use throws here you need to use try catch


        Throw_Vs_Throws t = new Throw_Vs_Throws();
        System.out.println(t.area(22));


        System.out.println(areaOfCircle(-22));


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Value Of Radius : ");
        int a = scan.nextInt();
        double b = 10;


        System.out.println("Method areaOfCircle(), Using User Input : "+areaOfCircle(a));
        System.out.println("Method area(), Using User Input : "+t.area(a));

        System.out.println(divide(10,6));

        double ar = area(-6);
        System.out.println(ar);
    }
}

