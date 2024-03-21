package chapter12package;
//import java.util.Scanner;
import java.util.*;  //using star you can use any class in the java util package
public class ImportAllPackagesusingStar {
    public static void main(String[] args) {
        // 3 WAYS YOU CAN USE THOSE PACKAGES

//        Scanner sc = new Scanner(System.in);
//        java.util.Scanner sc = new Scanner(System.in);

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Taking input from USER : ");
        int a = sc.nextInt();

        System.out.println("Your Input : "+a);
    }
}
