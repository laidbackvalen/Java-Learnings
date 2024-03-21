public class Array_Length {
    public static void main(String[] args) {

        int[] marks = {10, 20, 30, 40, 50};

        System.out.println(marks[0]);
        System.out.println("Array Length = " + marks.length);

        float[] marksy = {10.5f, 2.3f, 56.7f, 55.1f};

        System.out.println(marksy[2]);
        System.out.println("Array Length = " + marksy.length);

        String[] name = {"valen", "rajubhai", "patel"};
        System.out.println(name[1]);
        System.out.println("Array Length = " + name.length);


        //Displaying element in array using (for loop)

        for (int i = 0; i < marks.length; i++) {       //array traversal
            System.out.println(marks[i]);
        }


        System.out.println("\n Printing Arrays In Reverse Order");

        for (int i = marks.length - 1; i >= 0; i--) {       //array traversal
            System.out.println(marks[i]);
        }


        System.out.println("\nPrinting arrays using for each loop");
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        for (int element: numbers) {
            System.out.println(element);
        }

    }
}
