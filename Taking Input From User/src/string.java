import java.util.Scanner;
public class string {
    public static void main(String[] args) {

        System.out.println("Taking Input From User");
        System.out.println("type anything you want");
        Scanner sca = new Scanner(System.in);


        String str = sca.next(); //this is use acept string as an input, anything written after space will not be executed
        //    String strg = sca.nextLine(); // this will execute everything after the space bar
        System.out.println(str);
        //  System.out.println(strg);
    }

    }

