import java.util.ArrayList;

/**
 * Created by bilalsay on 22/04/2017.
 */
public class HTPanel implements Receiver {

    private int htPanelId;
    private ArrayList<PowerTransformer> powerTransformers;
    private boolean isOn;

    HTPanel(int htPanelId) {
        this.htPanelId = htPanelId;
        powerTransformers = new ArrayList<>();
        isOn = false;
    }

    public void on() {
        if (!isOn) {
            System.out.println("HT Panel with number " + getHtPanelId() + " was actived.");
            isOn = true;
            monitore();
        } else {
            monitore();
        }
    }

    public void off() {
        if (isOn) {
            System.out.println("HT Panel with number " + getHtPanelId() + " was cutted.");
            isOn = false;
            monitore();
        } else {
            monitore();
        }
    }

    public void monitore() {
        System.out.println("HT Panel with number " + getHtPanelId() + " is monitring: " +(isOn == true ? " Active " : "InActive"));
    }

    public void connectPowerTransformer(PowerTransformer powerTransformer) {
        this.powerTransformers.add(powerTransformer);
    }

    public int getHtPanelId() {
        return htPanelId;
    }

    public PowerTransformer getPowerTransformer(int transformerId) {
        return powerTransformers.get(transformerId);
    }

    public ArrayList<PowerTransformer> getPowerAllTransformer() {
        return powerTransformers;
    }
}
