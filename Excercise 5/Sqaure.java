package vrp;
public class Sqaure extends Shape{

    Sqaure(int dim1, int dim2) {
        super(dim1, -1);    
        //TODO Auto-generated constructor stub
    }
    public int areaOfSquaree(){
        int a;
        a = this.dim1*this.dim1;
        return a;
    }
    public static void main(String[] args) {
        Sqaure s = new Sqaure(10, 0);

        System.out.println(s.areaOfSquaree());

    }

}
