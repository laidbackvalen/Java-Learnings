package Advance_JAVA_Prac_Last;

class MyDeprecated{
    @Deprecated
    public void meth1(){
        System.out.println("Meth1");
    }
}
public class Q2_Deprecated_Annottion {
    public static void main(String[] args) {
        @SuppressWarnings("Deprecated")
        MyDeprecated md = new MyDeprecated();

        md.meth1();
    }
}
