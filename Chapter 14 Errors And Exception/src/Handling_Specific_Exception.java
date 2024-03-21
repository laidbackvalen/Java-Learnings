import java.util.Scanner;

public class Handling_Specific_Exception {
    public static void main(String[] args) {
        int[] marks = new int[5];

        marks[0] = 20;
        marks[1] = 35;
        marks[2] = 70;
        marks[3] = 56;
        marks[4] = 43;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks[] index : ");
        int a = sc.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number You Want Divide It With : ");
        int number = scan.nextInt();

        try{

            System.out.println("the value of array index entered is : " +marks[a]);
            System.out.println("the value of array value/ number is : " +marks[a]/number);



        }catch (ArrayIndexOutOfBoundsException e){       //  }catch (Exception e){System.out.println(e);}
            System.out.println(e);

        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
