class Superclass {
    int a;

    public Superclass(int b) {
        this.a = b;
        System.out.println(a);
        System.out.println("Valen");
    }

    public int getA() {
        return a;
    }

}

class Subclass extends Superclass {
    public Subclass(int c) {
//        super(21346);
        super(c);
        System.out.println("I am A Constructor of Subclass : " + c);

    }
}

public class This_Super_Keyword {
    public static void main(String[] args) {
//        Superclass supc = new Superclass(1);
//        System.out.println(sc.getA());

        Subclass subc = new Subclass(2);


    }
}
