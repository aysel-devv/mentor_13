package Smart_Home;

public class SmartVacuum extends Appliance implements Cleanable, Connectable{
    public SmartVacuum(int id, String name) {
        super(id, name);
    }


    @Override
    public void startCleaning() {
        System.out.println(name+" start cleaning!");
    }

    @Override
    public void stopCleaning() {
        System.out.println(name+" stop cleaning!");
    }

    @Override
    public void connectToWiFi() {
        System.out.println(name+ " connected to WiFi!");
    }

    @Override
    public void disconnectFromWiFi() {
        System.out.println("Disconnected!");
    }
}
