package access_modifiers_chapter12;
class Rajuhai extends Valen{

    public void rajuBahiKaBeta(){
        System.out.println("i'm valen");

    }
        }
public class Patel extends Valen {
    public static void main(String[] args) {
        Rajuhai m = new Rajuhai();
        m.rajuBahiKaBeta();
        m.meth1();
        System.out.println(m.x);
//        System.out.println(m.z);   //private


    }
}
