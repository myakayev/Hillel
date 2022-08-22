package absrtact.phone;

import absrtact.AbstractDevice;

public abstract class Phone extends AbstractDevice {
    @Override
    public void powerOn() {
        System.out.println("Press the power button. The mobile phone starts up.");
    }

    @Override
    public void powerOff() {

    }

    abstract void call ();
}
