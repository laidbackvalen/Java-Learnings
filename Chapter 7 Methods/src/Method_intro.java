public class Method_intro {
//    static{
//        System.out.println("valen");
//
//    }

     static int check(int x, int y) {   //method   //we use static keyword when we don't create object
                                                  //static methods in a class is shared by all the objects

        int z;
        if (x < y) {
            z = x + y;
        } else {
            z = (x + y) * 10;
        }
        return z;
    }
//    public int abc(){
//        return check(1,2);
//    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int c;
        c = check(a, b);

        int d = 200;
        int e = 100;

        int f;
        f = check(d, e);
        System.out.println("valen");

//        System.out.println(c);
//        System.out.println(f);
        System.out.println("patel");
//        System.out.println(abc()+"");


    }
}
