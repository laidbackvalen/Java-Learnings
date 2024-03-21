package chapter14_practice_set;

import java.util.Scanner;


public class Question3{

    public static void main(String[] args){


        int [] marks = new int[3];

        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner Sc = new Scanner(System.in);

        int index;
        int i = 0;

        while(i<5){
            try {

                System.out.print("Enter the value of index : ");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
             break;

            }
            catch (Exception e) {
                System.out.println("Invalid Index : " +e);

            }
            i++;
        }

        if(i>=5){
            System.out.println();
            System.out.println("Error Try Index Below 5");
        }


    }
}



