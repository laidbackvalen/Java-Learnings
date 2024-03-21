class Square{
    int side;
    public int area_square(int s){
        int res = s*s;
      return res;
    }
    public int perimeter_square(int s){
        return 4*s;
    }

}
class Rectangle{
    int length;
    int breath;
    public int area_rectangle(int l, int b){
       int a = l*b;
       return a;
    }
    public void bbbarea_rectangle(int l, int b) {
        this.length = l;
        this.breath = b;

        int a = l * b;
        System.out.println("The Area Of A Rectangle using public void bbbarea_rectangle : "+a);
    }
    public int perimeter_rectangle(int l, int b){
        int a = 2*(l+b);
        return a;
    }
}
public class Q3_square_area_perimeter {
    public static void main(String[] args) {

        Square figure = new Square();
        figure.side = 10;
        int a = figure.area_square(10); //OR, int a = figure.area_square(figure.side);
        System.out.println("The Area Of Your Square is : " +a);

        int p = figure.perimeter_square(figure.side);  //or 10 as a argument
        System.out.println("The Perimeter Of The Square Is : "+p);


        Rectangle fig = new Rectangle();
        fig.length = 10;
        fig.breath = 20;

        int pr = fig.perimeter_rectangle(10,20);
        System.out.println("The Perimeter Of A Rectangle is : "+pr);

        int ar = fig.area_rectangle(10,20);
        System.out.println("The Area Of A Rectangle is : "+ar);
fig.bbbarea_rectangle(10,20);
    }
}
