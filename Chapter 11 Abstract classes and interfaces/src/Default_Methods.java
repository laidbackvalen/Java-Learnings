import java.net.NetPermission;
import java.net.NetworkInterface;
import java.util.Arrays;

interface Camera {
    void takeSnap();          //public by default
                              //it is not necessary to implement default and private methods but public methods needs to be implemented
    void recordVideo();  //methods cannot have implementation in interfaces but declaring it private and default we can  do it as below

    private void greet() {
        System.out.println("hey there?, Hope You Are Doing Well \n");
    }

    default void recording4kVideo() {                            // Default methods are methods that can have a body.
        System.out.println("Recording 4K Video");               // it is not necessary to implement this method in class implementing this interface
                                                               // it Is Introduced To Ensure Backward Compatibility while updating an Interface
                                                         //it is not necessary to implement default and private methods but public methods needs to be implemented
        greet();  //private greet method
    }
}

interface Wifi {
    String[] networkList();

    void connectToNetwork(String Network);

    void disconnect();

}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("\nCalling Number : " + phoneNumber);
    }

    void pickCallNumber(int phoneNumber) {
        System.out.println("Picking Call of This Number : " + phoneNumber);
    }

}


class SmartPhone extends MyCellPhone implements Wifi, Camera, Bicycle {

//    @Override
//    public void recording4kVideo() {
//        System.out.println("Starting Recording 4K Video.....");
//    }

    @Override
    public String[] networkList() {

//        String[] networkList = {"vivo1919","AndroidAP","Kavilen_5","Bholes_Role_Point"};
//        return networkList;
        // OR
        return new String[]{"vivo1919", "AndroidAP", "Kavilen_5", "Bholes_Role_Point"};
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting To Wifi Network : " + network);
    }

    @Override
    public void disconnect() {

    }

    @Override
    public void applyBrake(int increment) {

    }

    @Override
    public void speedUp(int decrement) {

    }

    public void takeSnap() {
        System.out.println("Taking Picture");
    }

    public void recordVideo() {
        System.out.println("Recording Video");
    }
}


public class Default_Methods {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();
        phone.callNumber(717770046);
        phone.pickCallNumber(5886969);
        phone.recordVideo();
        phone.applyBrake(1);
        phone.disconnect();
        phone.connectToNetwork("valen");
        phone.recording4kVideo();

        System.out.println("Showing Networks : " + Arrays.toString(phone.networkList()));
        //OR
        String[] networkList = phone.networkList();
        for (String item : networkList) {    //for item in array
            System.out.println();
            System.out.println(item);   //print item
        }
    }
}
