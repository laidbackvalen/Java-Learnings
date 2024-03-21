public class Finally_Block {

    public static int func() {

        int a, b;
        a = 50;
        b = 2;

        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This Needs To Be Executed!!!!");
        }
        return -1;
    }



    public static void main(String[] args) {

        System.out.println(func());
        System.out.println();

//-------------------------------------------------------------------------
        int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("The Value Of B is : " + b);
            }
            b--;
        }

        //---------------------------------------------------------------------
        try{
            int e =50;
            int f = 0;
            System.out.println(e/f);
        }finally {
            System.out.println("This Is Finally Block");
        }
    }
}
