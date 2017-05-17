/**
 * Created by bilalsay on 22/04/2017.
 */
public class PowerTransformer implements Receiver {

    private int transformerId;
    private Inverter inverter;
    private boolean isOn;

    PowerTransformer(int transformerId) {
        this.transformerId = transformerId;
        isOn = false;
    }

    public void on() {
        if (!isOn) {
            System.out.println("Power Transformer with number " + getTransformerId() + " was actived.");
            isOn = true;
            monitore();
        } else {
            monitore();
        }

    }

    public void off() {
        if (isOn) {
            System.out.println("Power Transformer with number " + getTransformerId() + " was cutted.");
            isOn = false;
            monitore();
        } else {
            monitore();
        }
    }

    public void monitore() {
        System.out.println("Power Transformer with number " + getTransformerId() + " is monitring: " + (isOn == true ? " Active " : "InActive"));
    }

    public int getTransformerId() {
        return transformerId;
    }

    public void connectInverter(Inverter inverter) {
        this.inverter = inverter;
    }

    public Inverter getInverter() {
        return inverter;
    }
}
