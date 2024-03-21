package annotations_in_java;

@FunctionalInterface               //Functional interface annotation
interface Myfunctional_Interface{
    void interfacemethod();

//    void interfacemethod2();    //you can have only 1 Method in Functional Interface

}
class Ex extends Example_Class{
@Override
    public void example(){
    System.out.println("overidden method in Ex class");
}
@Deprecated
public int sum(int a, int b){
    return a+b;
}
}

public class Annotation_In_Java {
    @SuppressWarnings("Deprecated")
    public static void main(String[] args) {
    Ex e = new Ex();
        e.example();
        System.out.println(e.sum(10,20));
    }
}
