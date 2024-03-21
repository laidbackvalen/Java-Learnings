
package calc;
class Calculator {
    public void calculate(int x, int y) {
        System.out.println("the result is : " + (x + y) );
    }
}
class ScCalculator {
    public void calculate(int x, int y) {
        System.out.println("the result is : " + (x + y) );
    }
}
class HybridCalculator {
    public void calculate(int x, int y) {
        System.out.println("the result is : " + (x + y) );
    }
}

public class Question1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.calculate(5, 6);

    }

}
