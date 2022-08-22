package absrtact;

public abstract class AbstractDevice {
    public AbstractDevice() {
        powerOn();
    }

    String name;
    long serialNumber;
    public abstract void powerOn();
    public abstract void powerOff();

}
