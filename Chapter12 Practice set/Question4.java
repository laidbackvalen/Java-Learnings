package questionfour;

class Raj {
    protected int proInt = 4;
    int defInt = 44;
}

class Val {
    public void printMe() {
        System.out.println("Class VAL;");
    }
}

class Tainsa extends Raj {
    public void print(String s) {
        System.out.println(s);

    }
}

public class Question4 {
    public static void main(String[] args) {
        Tainsa t = new Tainsa();
        t.print("valen");
    }

}
