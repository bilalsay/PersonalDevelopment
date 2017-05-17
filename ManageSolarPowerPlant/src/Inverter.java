import java.util.ArrayList;

/**
 * Created by bilalsay on 22/04/2017.
 */
public class Inverter implements Receiver {

    private int inverterId;
    private ArrayList<SolarPanel> solarPanels;
    private boolean isOn;

    Inverter(int inverterId) {
        this.inverterId = inverterId;
        solarPanels = new ArrayList<>();
        isOn = false;

    }

    public void on() {
        if (!isOn) {
            System.out.println("Inverter with number " + getInverterId() + " was started.");
            isOn = true;
            monitore();
        } else {
            monitore();
        }
    }

    public void off() {
        if (isOn) {
            System.out.println("Inverter with number " + getInverterId() + " was stopped.");
            isOn = false;
            monitore();
        } else {
            monitore();
        }
    }

    public void monitore() {
        System.out.println("Inverter with number " + getInverterId() + " is monitring: " +(isOn == true ? " Active " : "InActive"));
    }

    public void connectSolarPanel(SolarPanel solarPanel) {
        this.solarPanels.add(solarPanel);
    }

    public int getInverterId() {
        return inverterId;
    }

    public SolarPanel getSolarPanel(int solarPanelId) {
        return solarPanels.get(solarPanelId);
    }

    public ArrayList<SolarPanel> getAllSolarPanels() {
        return solarPanels;
    }

}
