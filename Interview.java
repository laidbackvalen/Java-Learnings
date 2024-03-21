public class Interview {
    static int a = 14;  //static variable
    int b = 46; // non static variable
    String c = "rossi"; // non static variable

    static void getA() {      //static method printing static variable
        System.out.println(a);
    }

    void getC() {  //non static method printing non static variable
        System.out.println(c);
    }

    public int add(int f, int y) {
        int c = f + y;
        return c;
    }


    public static void main(String[] args) {
        Interview tine = new Interview();
        String a = "valen";
        a.length();
        int d = Interview.a;  //static
        System.out.println(d);

        int e = new Interview().b; //using object
        System.out.println(e);

        Interview.getA();

        new Interview().getC(); //non static method


    }
}
