interface rajubhai {

    void pitaajiOfValen();

    void pitaajiOfTainsa();

    private void headofTheFamily() {
        System.out.println("Rajubhai Is The Head Of The Family");
    }

    default void husbandOfAmitaben() {
        System.out.println("Rajubhai Is The Husband Of Amitaben");
        headofTheFamily();
    }
}

interface valen extends rajubhai {           //you can do inheritance in interfaces
    void beteOfRajubhai();

    void brotherOfTainsa();
}

class ValenRajubhaiPatel implements valen {

    @Override
    public void pitaajiOfValen() {
        System.out.println("I'm the Father Of Valen");
    }

    @Override
    public void pitaajiOfTainsa() {
        System.out.println("I'm the Father Of Tainsa");
    }

    public void beteOfRajubhai() {
        System.out.println("I'm The Proud Son Of Rajubhai");
    }

    @Override
    public void brotherOfTainsa() {
        System.out.println("I'm The Brother Of Tainsa");
    }
}

class Tainsa extends ValenRajubhaiPatel {

    public void problem() {
        System.out.println("I Think I'm The Danger");
    }
    Tainsa tainsa = new Tainsa();
}

public class Inheritance_in_Interfaces {
    public static void main(String[] args) {

        ValenRajubhaiPatel shantiBen_Parivaar = new ValenRajubhaiPatel();

        shantiBen_Parivaar.pitaajiOfValen();
        shantiBen_Parivaar.brotherOfTainsa();
        shantiBen_Parivaar.husbandOfAmitaben();

        ValenRajubhaiPatel vale = new Tainsa();
        vale.pitaajiOfTainsa();

        System.out.print(" " + 7 + 2 + " ");

    }


}
