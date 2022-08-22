package absrtact.multiCooker;

import absrtact.AbstractDevice;

public abstract class Multicooker extends AbstractDevice {
    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }
    protected abstract void cook();
}
