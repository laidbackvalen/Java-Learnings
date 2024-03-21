//THERE ARE TWO DIFFERENT THROW VS THROWS PROGRAM CHECK BOTH
class NegativeRadiusException1 extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Harrys_Throws_Vs_Throws {

    public static double area(int r) throws NegativeRadiusException1{
        if (r<0){
            throw new NegativeRadiusException1();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) {
        // Made By Harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try{
//            int c = divide(6, 0);
//            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);

        }
        catch(Exception e){
            System.out.println("Exception");
        }

    }
}
