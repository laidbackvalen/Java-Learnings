public class Q1_Array_Sum_5_Floats {
    public static void main(String[] args) {

        int[] array = {20, 30, 50, 100, 100};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}

