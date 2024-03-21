public class Q5_fibonacci_series {
    static int fib(int n){

        if (n == 0) {  // Oth fibonacci is 0
            return 0;
        }

        if (n == 1 || n == 2) {   // 1st and 2nd Fibonacci are 1 and 1 only
            return 1;
        }
        return fib(n-1) + fib(n-2);

    }
    public static void main(String[] args) {

        System.out.println(fib(10));
    }
}
