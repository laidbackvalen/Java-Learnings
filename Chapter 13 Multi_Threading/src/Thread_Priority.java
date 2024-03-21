class Threadd extends Thread {
    public Threadd(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println(getName());
            i++;
        }
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        Threadd t1 = new Threadd("VALEN");
        Threadd t2 = new Threadd("Kumar");
        Threadd t3 = new Threadd("Raju");
        Threadd t4 = new Threadd("Bhai");
        Threadd t5 = new Threadd("PATEL");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
