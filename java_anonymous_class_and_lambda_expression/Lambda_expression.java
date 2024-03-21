package java_anonymous_class_and_lambda_expression;

public class Lambda_expression {
    public static void main(String[] args) {
        DemoAnonymous2 da = (a)->{System.out.println("I am MethodONE : " +a); };
        da.meth1(1);
    }
}
