package Smart_Home;

public class Main {
    public static void main(String[] args) {
        SmartVacuum smartVacuum=new SmartVacuum(1, "Roborock");
        smartVacuum.showDetails();

        System.out.println("");

        smartVacuum.connectToWiFi();
        smartVacuum.startCleaning();
        smartVacuum.disconnectFromWiFi();
        smartVacuum.stopCleaning();

    }
}
