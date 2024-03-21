
public class Q_average_using_methods_and_their_arguments {
    static int average(int x, int y, int z) {
        int avg = (x + y + z) / 3;
        return avg;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;                                                                   //OR,
        System.out.print("The Average Of Your Numbers Is : "+average(a, b, c));     //int d = average(a,b,c);
                                                                                    // System.out.println(d);
    }
}

