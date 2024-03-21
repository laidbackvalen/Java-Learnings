package chapter14_practice_set;
class Patel extends Exception{
    @Override
    public String toString() {
        return "hello";
    }

    @Override
    public String getMessage() {
        return "hi";
    }
}
public class valen{
    public static int hoohoo(int a, int b) throws Patel{
        if(b==0){
            throw new Patel();
        }
        return a/b;
    }
    public static void main(String[] args) {
        int i = 1;
        int g = 0;


        try{
          hoohoo(2,0);


        }catch(Exception e){
            System.out.println(e);
        }
    }
}
