package chapter14_practice_set;

import java.util.Scanner;

//Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument
public class Question2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
try{
    System.out.println(a/b);
}catch (IllegalArgumentException e){
    System.out.println("Hihi" + e);
}
catch (ArithmeticException e){
    System.out.println("HAHA It's : " +e);
}
    }
    Scanner sc = new Scanner(System.in);
}
