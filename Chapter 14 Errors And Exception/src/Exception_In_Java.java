import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "i am getMessage()";
    }
}
public class Exception_In_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Enter a number : ");
        a = sc.nextInt();

        if(a<99){
            try{
//                throw new MyException();
                throw new ArithmeticException("Tainsa is a problem");
            }catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                System.out.println("hihihihihahahahaha");
                e.printStackTrace();  //this is used to show error in specific syntax where it is set , the program is good no errors are there
                //I am printing this error intensionally
            }
        }else{
            System.out.println("You Have Entered A Large Number");
        }
    }
}
