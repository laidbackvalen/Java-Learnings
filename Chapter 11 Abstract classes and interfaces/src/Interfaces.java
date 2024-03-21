//JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE DIRECTLY BUT THE SIMILAR CONCEPT CAN BE ACHIEVED USING INTERFACES
// java doesn't support multiple inheritance, with the use of interfaces multiple inheritance is possible

interface Bicycle {  //Interface

    //you can create properties in interface

    //interface method are public by default // you don't have to declare public

    int b = 46;  //you cannot modify the properties in interfces as they are final

    public void applyBrake(int increment);   //interface methods
                                            // interface method are public by default
                                           //  you don't have to declare public

  void speedUp(int decrement);   //interface methods //interface method are public by default // you don't have to declare public


}
interface BlowHorn{  //interface
           void blowHornDDLJ();                 //interface method are public by default // you don't have to declare public
    public void blowHornK3G();

    default void hi(){
        System.out.println("valen");
    }
}

class AvonCycle implements Bicycle, BlowHorn{
    public void applyBrake(int increment) {
        System.out.println("Applying Break");
    }

    public void speedUp(int decrement) {
        System.out.println("Increasing Speed");
    }
    public void blowHornDDLJ(){
        System.out.println("Dilwale Dulhaniya Le Jayenge Pee Pee Pee");
    }
    public void blowHornK3G(){
        System.out.println("Kabhi Khushi Kabhi Gham Poo Poo Poo");
    }

}

public class Interfaces {
    public static void main(String[] args) {

        //you can create the reference of interfaces but not the object
        //Bicycle b = new Bicycle(); // you cannot create object
        Bicycle b = new AvonCycle();  //you can create reference of interfaces

        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        cycle.speedUp(2);
        cycle.blowHornDDLJ();
        cycle.blowHornK3G();
        System.out.println(cycle.b);

    }
}
