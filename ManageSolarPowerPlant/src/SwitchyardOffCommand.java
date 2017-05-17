/**
 * Created by bilalsay on 23/04/2017.
 */
public class SwitchyardOffCommand implements Command {

    private Switchyard switchyard;

    SwitchyardOffCommand(Switchyard switchyard) {
        this.switchyard = switchyard;
    }

    public void execute() {
        PowerPlantStarterStopperAssistant assistant = new PowerPlantStarterStopperAssistant(switchyard);
        assistant.stop();
    }
}
