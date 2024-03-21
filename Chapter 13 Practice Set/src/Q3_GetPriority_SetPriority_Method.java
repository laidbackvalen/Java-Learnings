class Valen extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("VALEN");
            i++;
        }
    }
}

class Tainsa extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("Tainsa");
            i++;
        }
    }
}

class Kavi extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("KAVI");
            i++;
        }
    }
}

public class Q3_GetPriority_SetPriority_Method {
    public static void main(String[] args) {
        Valen v = new Valen();
        Tainsa t = new Tainsa();
        Kavi k = new Kavi();

//        v.setPriority(Thread.MAX_PRIORITY);
//        t.setPriority(Thread.MIN_PRIORITY);
//        k.setPriority(Thread.NORM_PRIORITY);

        v.setPriority(5);     //normal priority
        t.setPriority(1);    //min priority
        k.setPriority(10);  //max priority

        System.out.println(v.getPriority());
        System.out.println(t.getPriority());
        System.out.println(k.getPriority());


        System.out.println(v.getState());
        System.out.println(t.getState());
        System.out.println(k.getState());

        System.out.println(Thread.currentThread().getState());

//        v.start();
//        t.start();
//        k.start();

    }
}
