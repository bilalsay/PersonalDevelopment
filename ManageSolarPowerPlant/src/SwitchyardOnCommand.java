/**
 * Created by bilalsay on 23/04/2017.
 */
public class SwitchyardOnCommand implements Command {

    private Switchyard switchyard;

    SwitchyardOnCommand(Switchyard switchyard) {
        this.switchyard = switchyard;
    }

    public void execute() {
        PowerPlantStarterStopperAssistant assistant = new PowerPlantStarterStopperAssistant(switchyard);
        assistant.start();
    }
}

