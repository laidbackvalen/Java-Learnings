import java.util.Scanner;

public class Ch4_prac_Q6_endsWith {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("enter url : ");
        String website = sca.next();

        if(website.endsWith(".com")){
            System.out.println("its a commercial website");
        } else if (website.endsWith("org")) {
            System.out.println("it's organisational website");
        }
        else{
            System.out.println("not in our data");
        }

    }
}
