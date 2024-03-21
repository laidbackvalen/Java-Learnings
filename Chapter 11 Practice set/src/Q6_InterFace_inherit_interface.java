interface TvRemote {
    void onTv();

    void OffTv();
}

interface smartTvRemote extends TvRemote {
    void connectToAlexa();

    void connectToWifi();
}

class Tv implements TvRemote, smartTvRemote {

    @Override
    public void onTv() {
        System.out.println("Turning On Tv...");
    }

    @Override
    public void OffTv() {
        System.out.println("Turning Off Tv...");
    }

    @Override
    public void connectToAlexa() {
        System.out.println("Connecting With Alexa...");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connecting to Wifi...");
    }
}

public class Q6_InterFace_inherit_interface {
    public static void main(String[] args) {
        Tv sony = new Tv();
        sony.connectToAlexa();

        smartTvRemote samsung = new Tv();
        samsung.OffTv();
    }
}
