class Val {
    int x = 1;
    int y = 2;
    String sc = "Vale";

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println(sc);
    }

    public Val(String s, int x, int y) {
        this.sc = s;
        this.x = x;
        this.y = y;
    }

    public int add() {
        int a = x + y;
        return a;
    }


}

public class PracByOwn {
    public static void main(String[] args) {
        Val v = new Val("valen", 1, 2);
        v.print();
        v.setX(5);
        System.out.println("The Value Of Y Set By Constructor Which Is Displayed Using getY() method is : "+v.getY());
        System.out.println(v.add());
    }
}
