
public class Try_Catch {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.print("We Failed To Execute Due To : ");
            System.out.println(e);
        }

    }
}
