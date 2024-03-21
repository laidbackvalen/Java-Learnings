public class Q4_pattern_using_methods {
//    static void pattern() {
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//
//    }

    static void pattern(){
        for (int i = 1; i < 5; i++){
            for(int j = 1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern();
    }
}
