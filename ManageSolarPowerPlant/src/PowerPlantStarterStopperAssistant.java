import java.util.ArrayList;

/**
 * Created by bilalsay on 23/04/2017.
 */
public class PowerPlantStarterStopperAssistant {

    private Switchyard switchyard;

    PowerPlantStarterStopperAssistant(Switchyard switchyard) {
        this.switchyard = switchyard;
    }

    public void start() {
        switchyard.on();
        for (HTPanel htPanel: switchyard.getAllHtPanels()) {
            htPanel.on();
            for (PowerTransformer powerTransformer: htPanel.getPowerAllTransformer()) {
                powerTransformer.on();
                Inverter inverter = powerTransformer.getInverter();
                inverter.on();
                for (SolarPanel solarPanel: inverter.getAllSolarPanels()) {
                    solarPanel.on();
                }
            }
        }
    }

    public void stop() {
        for (HTPanel htPanel: switchyard.getAllHtPanels()) {
            for (PowerTransformer powerTransformer: htPanel.getPowerAllTransformer()) {
                Inverter inverter = powerTransformer.getInverter();
                for (SolarPanel solarPanel: inverter.getAllSolarPanels()) {
                    solarPanel.off();
                }
                inverter.off();
                powerTransformer.off();
            }
            htPanel.off();
        }
        switchyard.off();
    }

}
