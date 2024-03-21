// package shape;

class Square {
    int side;

    public int area(int side) {
        this.side = side;
        int a = side * side;
        return a;
    }
}

class Rectangle {
int length;
int breadth;

public int getLength(){
    return this.length;
}

public int getBreadth(){
    return this.breadth;
}

public void setLength(int length){
    this.length=length;
}

public void setBreadth(int breadth){
    this.breadth=breadth;
}

public int areaOfRec(){
    int a = 2*(length*breadth);
    return a;
}
}

class Cylinder {

}

class Circle {

}

public class Prac {
    public static void main(String[] args) {
Rectangle rc = new Rectangle();
rc.setBreadth(10);
rc.setLength(20);
System.out.println(rc.areaOfRec());
    }
}
