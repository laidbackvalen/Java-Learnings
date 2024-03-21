class Thread3 extends Thread{

    @Override
    public void run() {

        int i = 0;
        while(i<50){
            System.out.println("VALEN");
            i++;
        }

    }
}
class Thread4 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<50){
            System.out.println("p");
            i++;
        }

    }
}
class Not_A_Thread{
    public void notAThread1() {

        int i = 0;
        while(i<50){
            System.out.println("TAINSA");
            i++;
        }

    }
}
class Not_A_Thread2{
    public void notAThread2() {

        int i = 0;
        while(i<50){
            System.out.println("PATEL");
            i++;
        }

    }
}
public class Thread_Prac_ByOwn {
    public static void main(String[] args) {

        Thread3 t3 = new Thread3();
        t3.start();

        Thread4 t4 = new Thread4();
        t4.start();

        //

//        Not_A_Thread nt = new Not_A_Thread();
//        Not_A_Thread2 nt2 = new Not_A_Thread2();
//
//        nt.notAThread1();
//        nt2.notAThread2();
    }
}
