class    T extends Thread {
    public T(String name) {
        super(name);
    }


    @Override
    public void run() {
        int i = 0;
        while(i<300){
            System.out.println("I am Thread Of T");
            i++;
        }

    }
}

class T2 extends Thread {
    public T2(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while(i<400){
            System.out.println("T2");
            i++;
        }
    }
}

public class Constructors_in_Threads {
    public static void main(String[] args) {
        T t = new T("valen");
        T2 t2 = new T2("Patel");


        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t2.getName());
        System.out.println(t2.getId());
        t.start();
        t2.start();

    }
}
