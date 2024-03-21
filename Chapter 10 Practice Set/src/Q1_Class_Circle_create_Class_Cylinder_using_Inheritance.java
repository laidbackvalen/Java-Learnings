class Circle {
    public int radius;

    public Circle(int r) {   //in INHERITANCE
        // if we don't have a default constructor in the parent class we need to use super key in child class
        //by creating a constructor in child class
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }


}




class Cylinder extends Circle {

    public int height;

    public Cylinder(int r, int h) {   // public Cylinder(int h){
        super(r);                     // super(10);
        this.height = h;              // this.height = h;
                                     // }
    }


    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}





public class Q1_Class_Circle_create_Class_Cylinder_using_Inheritance {
    public static void main(String[] args) {

        //USING CONSTRUCTORS

        Circle cir = new Circle(10);
        cir.area();
        System.out.println("Area Of A Circle : " + cir.area());

        //USING CONSTRUCTORS

        Cylinder cylin = new Cylinder(100,1000);
        System.out.println("Volume Of A Cylinder is : " + cylin.volume());

    }
}
