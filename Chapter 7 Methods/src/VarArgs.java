public class VarArgs {  //variable arguments, different arguments
                        // use to pass multiple arguments no matter of what amount(size)
    static int sum(int... ar) { //you can set atleast one parameter so that user have to provide atleast one arguments not keeping it empty
                                  //for ex :- (int x, int...arr)  //work as array
        int result = 0;

        for (int element : ar) {  //for element in array
            result += element;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(10, 60, 20, 5, 5, 7, 9, 10));
    }
}
