public class Q7_Mini_element_in_array {
    public static void main(String[] args) {

        int[] number = new int[]{13,42,23,88,4,2};

        int mini = number[0];

        for(int i = 0;i< number.length;i++){


            if (mini > number[i]) {
                mini =  number[i];
            }
        }
        System.out.println("This Is tHe Smallest Number : "+mini);
    }
}
