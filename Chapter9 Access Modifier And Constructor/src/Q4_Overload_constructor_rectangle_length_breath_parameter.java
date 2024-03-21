class Rectangle {
    int length;
    int breath;

    public Rectangle() {
        this.length = 4;
        this.breath = 5;
    }

    public Rectangle(int length, int breath) {  //Constructor overloading
        this.length = length;
        this.breath = breath;
    }
    public int area(){
        return 2*(length+breath);
    }
}


public class Q4_Overload_constructor_rectangle_length_breath_parameter {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();

//        rec.length = 12;
//        rec.breath = 14;

        System.out.println("area of rect1 is : "+rec.area());;

        Rectangle rec2 = new Rectangle(10,20);
        System.out.println("area of rect2 is : "+rec2.area());;
    }
}
