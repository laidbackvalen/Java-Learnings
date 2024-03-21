package chapter14_practice_set;

public class Question1_Ch14_Demo_Syntax_Logical_Runtime_Errors {
    public static void main(String[] args) {
        //   int a = 0   //syntax error

        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1); //logical error as 9 is not a prime number
        }
        int a = 10;
        int b = 0;

        int c = a / b;
        System.out.println(c);  //runtime error as b is 0, which is not define

    }
}

