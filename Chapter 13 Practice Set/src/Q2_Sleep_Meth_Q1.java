class Thread3 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning, Jai Shree Krsn");
            i++;
        }

    }
}

class Thread4 extends Thread {
    @Override
    public void run() {

        int i = 0;
        while (i < 50) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("WELCOME");

            i++;
        }
    }
}

public class Q2_Sleep_Meth_Q1 {
    public static void main(String[] args) {
        Thread3 t = new Thread3();
        Thread4 t2 = new Thread4();

        t.start();
        t2.start();
    }
}

