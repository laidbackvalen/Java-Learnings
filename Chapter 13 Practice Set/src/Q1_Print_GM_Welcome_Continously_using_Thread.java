import java.sql.SQLOutput;

class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Good Morning, Jai Shree Krsn");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

    }
}

class Thread2 extends Thread {
    @Override
    public void run() {

        int i = 0;
        while (i < 50) {

            System.out.println("WELCOME");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
        }
    }
}

public class Q1_Print_GM_Welcome_Continously_using_Thread {
    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread2 t2 = new Thread2();

        t.start();
        t2.start();
    }
}
