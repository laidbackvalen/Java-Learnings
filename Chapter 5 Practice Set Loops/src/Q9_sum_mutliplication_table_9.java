public class Q9_sum_mutliplication_table_9 {

    public static void main(String[] args) {

        int n = 9;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum += n * i;     //sum + n*1 =
                             // 0 + 9 * 1 = 9
        }

        System.out.println(sum);
    }
}
