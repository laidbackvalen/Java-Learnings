class Base {      //parent // base// super class
                             //you cannot use any functions, methods or variables of derived class in/from base class
    int x;

    public void printMe() {
        System.out.println("printing function from base class");
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

}



class Derived extends Base {          //derived // child //sub class
                                      //you can use any functions, methods or variables of base class in/from derived class
    int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class Intro_inheritance {//extends Base
    public static void main(String[] args) {

        Base b = new Base();

        b.setX(10);
        System.out.println(b.getX());
        //b.setY(10);

        Derived d = new Derived();
        d.printMe();
        d.setX(20);
        System.out.println(d.getX());

//        Intro_inheritance inheritance = new Intro_inheritance();
//        inheritance.printMe();



    }
}
