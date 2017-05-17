import java.util.ArrayList;

/**
 * Created by bilalsay on 22/04/2017.
 */
public class Switchyard implements Receiver {

    private int switchyardId;
    private ArrayList<HTPanel> htPanels;
    private boolean isOn;

    Switchyard(int switchyardId) {
        this.switchyardId = switchyardId;
        htPanels = new ArrayList<>();
        isOn = false;
    }

    public void on() {
        if (!isOn) {
            System.out.println("Switchyard with number " + getSwitchyardId() + " was actived.");
            isOn = true;
            monitore();
        } else {
            monitore();
        }
    }

    public void off() {
        if (isOn) {
            System.out.println("Switchyard with number " + getSwitchyardId() + " was cutted.");
            isOn = false;
            monitore();
        } else {
            monitore();
        }
    }

    public void monitore() {
        System.out.println("Switchyard with number " + getSwitchyardId() + " is monitring: " + (isOn == true ? " Active " : "InActive"));
    }

    public int getSwitchyardId() {
        return switchyardId;
    }

    public void connectHTPanel(HTPanel htPanel) {
        this.htPanels.add(htPanel);
    }

    public ArrayList<HTPanel> getAllHtPanels() {
        return htPanels;
    }
}
