public class Void_Array_reference_Methods {
    static void greetings() {
        System.out.println("Good Morning! Have A Nice Day");
    }

    static void arr(int a) {
        a = 98;
    }

    static int array(int[] a) { //this is how you can replace a value in arrays
      a[0] = a[5];
        return a[0];
    }


    public static void main(String[] args) {


        greetings();   //void method

        int[] arrays = {2, 10, 15, 20, 25, 30, 35};
        int x = 100;
        arr(x);
        array(arrays);
        System.out.println(x);
        System.out.println("\nValue Of array[0] Becomes : " + arrays[0]);

        System.out.println("\nObjects In Array After Upadtion \n");

        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

    }
}
