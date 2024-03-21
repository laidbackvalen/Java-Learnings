package chapter14_practice_set;
//4) Modify program in Q3 to throw a custom Exception if max retries are reached.
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "Custom Class Exception!";
    }

    @Override
    public String getMessage() {
        return "Index Is Out Of The Bound";
    }
}
public class Question4 {


    public static int func(int i) throws MyException{
        if(i>2){
            throw new MyException();
        }

        return i;
    }
    public static void main(String[] args) {

        boolean flag = true;
        int [] marks = new int[3];

        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner Sc = new Scanner(System.in);

        int index;
        int i = 0;

        while(flag && i <5){

                try {

                    System.out.print("Enter the value of index : ");
                    index = Sc.nextInt();
                    int res = func(index);
                    System.out.println("The value of marks[index] is " + marks[res]);
                    break;

                }
                catch (MyException e) {
                    System.out.println();
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
                    System.out.println();

                    i++;
                }
            }

if(i>=5) {
    System.out.println("You Have Reached Maximum Number Of Attempts!");
    System.out.println("Program Exited!");
}

        }

    }



