class Cylinder {
    private int radius;
    private int height;


    //USING CONSTRUCTOR
//    public Cylinder(int r, int h){
//        this.radius = r;
//        this.height = h;
//
//    }
    //
    public void setRadius(int radius) {      //a method to set radius value
        this.radius = radius;
    }

    public int getRadius() {                 //a method to have radius value which is set by set method //get
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public double surfaceArea(double radius, double height) {
        double surfacearea = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;  //formula for surface area of cylinder
        return surfacearea;

    }

    public double volume(double radius, double height) {
        return 3.14159265359 * radius * radius * height;
    }
}

public class Q1_Prac_Class_cylinder_getter_setter_radius_height {
    public static void main(String[] args) {

//        Cylinder c = new Cylinder(1,2);
        //System.out.println((c.height)*(c.radius));

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(10);              //setter method being called
        cylinder.setRadius(20);


        int d = cylinder.getHeight();
        int e = cylinder.getRadius();
//        System.out.println(c.getRadius());
//        System.out.println(c.getHeight());

        System.out.println(d);
        System.out.println(e);
        System.out.println(cylinder.surfaceArea(10, 20));
        System.out.println(cylinder.volume(20,30));

    }
}
