import java.util.ArrayList;

class Pracz{
    public int v(){
        System.out.println("Valen");
        return 1;
    }
    public Pracz(int a, int b){

    }
}

public class PracClasses {

    public static int r() {
        System.out.println("Rajubhai");
        return 1;
    }

    public static void main(String[] args) {
        //dynamic or non static
        int a = new Pracz(1, 2).v();

        //static
        PracClasses.r();


        //PRACTICING
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(new Pracz(1,2).v());


    }
}
