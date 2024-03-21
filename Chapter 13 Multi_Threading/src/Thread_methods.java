class Threading extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("VALEN");
            i++;
        }
    }
}

class Threading2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Patel");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

public class Thread_methods {
    public static void main(String[] args) {
        Threading t = new Threading();
        Threading2 t2 = new Threading2();

        t.start();
//
//        try {
//            t.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }

        t2.start();


    }
}
