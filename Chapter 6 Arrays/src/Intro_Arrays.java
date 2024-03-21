public class Intro_Arrays {
    public static void main(String[] args) {


        //THERE ARE 3 WAYS TO  CREATE AN ARRAY IN JAVA

        //int [] marks;            //array declaration
        //marks = new int [5]     //array Memory Allocation

        //int [] marks  = {100, 60, 46, 72};     //declare + initialize


        int[] marks = new int[5];    //Declaration + Memory Allocation
        marks[0] = 100;      // initialising Array
        marks[2] = 60;
        marks[1] = 12;
        marks[3] = 46;
        marks[4] = 72;

        System.out.println(marks[0]);


        int[] mark = {10, 20, 30, 40};  //declare + memory allocation + initialisation
        //java figures out the size of an array itself (giving indexing and memory}
        System.out.println(mark[2]);
    }
}
