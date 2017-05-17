/**
 * Created by bilalsay on 22/04/2017.
 */
public class InverterOffCommand implements Command {

    private Inverter inverter;

    InverterOffCommand(Inverter inverter) {
        this.inverter = inverter;
    }

    public void execute() {
        inverter.off();
    }
}
