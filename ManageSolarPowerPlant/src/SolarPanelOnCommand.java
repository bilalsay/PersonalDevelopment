/**
 * Created by bilalsay on 23/04/2017.
 */
public class SolarPanelOnCommand implements Command {

    private SolarPanel solarPanel;

    SolarPanelOnCommand(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    public void execute() {
        solarPanel.on();
    }
}