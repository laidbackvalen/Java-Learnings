package access_modifiers_chapter12;

class Valen { //class
    public int w = 1;
    protected int x = 2;
    int y = 3;
    private int z = 4;

    public void meth1() {
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
class amita extends Valen{
public void meth2(){
    System.out.println(y);
}
}

public class AccessModifiers {


    public static void main(String[] args) {
        Valen ac = new Valen();

        ac.meth1();  //same class mai access ho raha hai, yeh class valen a meth1 hai joh saare variable print krwa raha hai

        System.out.println("\n \n");


        System.out.println(ac.w);
        System.out.println(ac.x);
        System.out.println(ac.y);

//            System.out.println(ac.z);    //as it's private it cannot be accessed in this class

    }
}

