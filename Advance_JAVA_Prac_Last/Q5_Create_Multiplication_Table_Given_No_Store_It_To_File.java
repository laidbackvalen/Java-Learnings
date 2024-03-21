package Advance_JAVA_Prac_Last;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q5_Create_Multiplication_Table_Given_No_Store_It_To_File {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Whose Table You Want To Print : ");
        int a = sc.nextInt();
        String s = "";

        for (int i = 1; i <= 10; i++) {
//            System.out.println(a + " x " + i + " = " + a * i); //   System.out.printf("%d x %d = %d \n", a, i, a*i);

            s+= a + " x " + i + " = " + a * i;
            s+= "\n";
        }


        try {
            FileWriter fw = new FileWriter("MultiplicationTable.txt");
            fw.write(s);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}









