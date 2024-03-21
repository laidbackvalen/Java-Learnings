package Advance_JAVA_Prac_Last;

interface Dis{
    void display();
}
public class Q3_Create_interface_craete_Instance_from_it {
    public static void main(String[] args) {
        Dis d =() -> System.out.println("i am display");   //(parameter1) -> { code block }
        d.display();


    }
}

