abstract class Pen {   //Question 1 + 2 //read question

    public void showOff() {
        System.out.println("This Is My Pen");
    }

    abstract void refill();

    abstract void write();
}

class FountainPen extends Pen { //abstract class FountainPen extends Pen

    // OR

    @Override
    void refill() {
        System.out.println("refilling");
    }

    @Override
    void write() {
        System.out.println("writing");
    }

    public void changeNib() {
        System.out.println("Changing The Nib");
    }
}

public class Q1_Create_Abstract_Class_with_Abstract_Method {
    public static void main(String[] args) {
        FountainPen p = new FountainPen();
        p.showOff();
    }
}
