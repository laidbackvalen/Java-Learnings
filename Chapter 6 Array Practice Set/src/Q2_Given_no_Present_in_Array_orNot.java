public class Q2_Given_no_Present_in_Array_orNot {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int num = 5;   //try any value not present in array

        boolean isinArray = false;


        for (int element : array) {
            if (num == element) {
                isinArray = true;
                break;
            }
        }

        if (isinArray) {
            System.out.println("present");
        } else {
            System.out.println("Not Present");
        }

    }
}
