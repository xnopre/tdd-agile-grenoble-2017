package xnopre;

public class Driver {
    private Connector connector;

    public Driver(Connector connector) {
        this.connector = connector;
    }

    public void openGate(String gateNumber) {
        try {
            connector.transmit("OG"+gateNumber);
        } catch (Exception e) {
            throw new DriverException();
        }
    }
}
