public class Q3_Average_marks_of_Students_In_Physics {
    public static void main(String[] args) {

        int[] physics_marks = {32, 46, 70, 35, 58};

        float average;
        float sum = 0;

        for (int element : physics_marks) {
            sum += element;   //or sum = sum + element;
        }

        average = sum / physics_marks.length;

        System.out.printf("Average : %f \n", average);
        System.out.println("Average : " + average);

    }
}
