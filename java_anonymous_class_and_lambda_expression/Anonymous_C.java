package java_anonymous_class_and_lambda_expression;
@FunctionalInterface
interface DemoAnonymous {
    void meth1();

//    void meth2();

}
@FunctionalInterface
interface DemoAnonymous2 {
    void meth1(int a);

//    void meth2();

}

//class Anonymous_Class implements DemoAnonymous {
//
//    @Override
//    public void meth1() {
//        System.out.println("I am Method1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am Method2");
//    }
//}

public class Anonymous_C {
    public static void main(String[] args) {
//        Anonymous_Class ac = new Anonymous_Class();
//
//
//        ac.meth1();

        DemoAnonymous da = new DemoAnonymous() { //Anonymous Class
            @Override
            public void meth1() {
                System.out.println("I am Method1");
            }

//            @Override
//            public void meth2() {
//                System.out.println("I am Method2");
//            }
        };

        da.meth1();

    }
}
