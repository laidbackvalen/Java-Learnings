abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartPhone extends Telephone {

    @Override
    void ring() {
        System.out.println("Phone Ringing....");
    }

    @Override
    void lift() {
        System.out.println("Picking Call...");
    }

    @Override
    void disconnect() {
        System.out.println("disconnect call...");
    }
}

public class Q4_Class_Telephone_with_Abstract_Class_methods_Polymorphism {
    public static void main(String[] args) {
        Telephone vivo = new SmartPhone();   //Same As //SmartPhone vivo = new SmartPhone();
        vivo.ring();
    }
}
