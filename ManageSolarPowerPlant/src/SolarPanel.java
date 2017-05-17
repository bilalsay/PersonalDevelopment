/**
 * Created by bilalsay on 22/04/2017.
 */
public class SolarPanel implements Receiver {

    private int whichConnectedInverter;
    private int solarPanelId;
    private int influency;
    private int heat;
    private double rateOfPolluty;
    private boolean isOn;

    SolarPanel(int solarPanelId) {
        //this.whichConnectedInverter = whichConnectedInverter;
        this.solarPanelId = solarPanelId;
        influency = 0;
        heat = 0;
        rateOfPolluty = 0.0;
        isOn = false;
    }

    public void on() {
        if (!isOn) {
            System.out.println("Solar Panel with number " + getSolarPanelId() + " was actived.");
            isOn = true;
            monitore();
        } else {
            monitore();
        }
    }

    public void off() {
        if (isOn) {
            System.out.println("Solar Panel with number " + getSolarPanelId() + " was cutted.");
            isOn = false;
            monitore();
        } else {
            monitore();
        }
    }

    public void monitore() {
        if (isOn) {
            System.out.println("Solar Panel with number " + getSolarPanelId() + " is monitring: \n"
                    + "influencey: " + getInfluency() + "\n"
                    + "heat: " + getHeat() + "\n"
                    + "pollutiy: " + getRateOfPolluty()

            );
        } else {
            System.out.println("Solar Panel with number " + getSolarPanelId() + " is monitring: InActive");
        }
    }

    public int getInfluency() {
        return influency;
    }

    public int getHeat() {
        return heat;
    }

    public double getRateOfPolluty() {
        return rateOfPolluty;
    }

    public void invokeCleaner() {
        rateOfPolluty = 0.0;
        System.out.println("");
    }

    public int getSolarPanelId() {
        return solarPanelId;
    }
}
