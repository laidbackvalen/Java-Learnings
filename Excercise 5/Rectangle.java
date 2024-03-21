package vrp;
public class Rectangle extends Shape {
Rectangle(int dim1, int dim2){
    super(dim1, dim2);

}
public int areaofRectangle(){
    int a;
    a = 2*(this.dim1+this.dim2);
    return a;
}
public static void main(String[] args) {
    Rectangle r = new Rectangle(1,2);
  System.out.println("Area Of A Your Rectangle Is : "+r.areaofRectangle()); 
} 
}
