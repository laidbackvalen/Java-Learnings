package practice_java;
class Tainsa{
int a;
    public Tainsa(int a) {
        this.a = a;

    }
}
class Rajubhai {
    public Rajubhai(String str, Boolean b){}
}
class Amita extends Rajubhai{

    public void m(){
        System.out.println("Valen Rajubhai Patel");
    }
    public Amita(String str, Boolean b) {
        super(str, b);
    }


}
public class Valen extends Rajubhai {

    public Valen(String str, Boolean b) {
        super(str, b);
    }

    public static void main(String[] args) {
        Rajubhai a = new Valen("a", false);
    }
}
