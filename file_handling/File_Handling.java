package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        File myFile = new File("FileHandlingTextFileExample.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        try {
            FileWriter fileWriter = new FileWriter("FileHandlingTextFileExample.txt");
            fileWriter.write("My Name is Valen Rajubhai Patel \n I have a Sister her name is Tainsa");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Reading a file
        File myFile2 = new File("FileHandlingTextFileExample.txt");


        try {
            Scanner sc = new Scanner(myFile2);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
             }sc.close();

            }catch (FileNotFoundException e) {
            e.printStackTrace();


        }

        //DELETING A FILE

//        File myFile3 = new File("FileHandlingTextFileExample.txt");
//        System.out.println(myFile3.delete());





//
//        File myFile3 = new File("FileHandlingTextFileExample.txt");
//        if (myFile3.delete()){
//            System.out.println("The File Has Been Deleted : " +myFile3);
//        }
//        else {
//            System.out.println("Some problem occurred when deleting a file");
//        }


        }
    }
