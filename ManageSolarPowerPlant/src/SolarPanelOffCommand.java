/**
 * Created by bilalsay on 23/04/2017.
 */
public class SolarPanelOffCommand implements Command {

    private SolarPanel solarPanel;

    SolarPanelOffCommand(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    public void execute() {
        solarPanel.off();
    }
}