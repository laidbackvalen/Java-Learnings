public class Q3_sum_nat_number {
    static void sum_nat(int num){
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum+=i;

        }
        System.out.println("the sum of first n natural number is : " +sum);
    }
    public static void main(String[] args) {
        int x = 5;
        sum_nat(x);

    }
}
