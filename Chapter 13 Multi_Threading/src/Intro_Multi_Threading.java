class Thread1 extends Thread{

  public int i = 3;
    private int x = 4;
    @Override
    public void run() {
        int i = 0;
        while(i<300){
            System.out.println("I am Cooking From Thread 1" );
            System.out.println("I am valen" );
            i++;
        }
    }
}
class Thread2 extends Thread implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<300){
            System.out.println("I am Chating From 2" );
            System.out.println("I am Tainsa" );
            i++;
        }
    }
}
public class Intro_Multi_Threading {
    public static void main(String[] args) {
Thread1 t1 = new Thread1();
Thread2 t2 = new Thread2();

t1.start();
t2.start();
    }
}
