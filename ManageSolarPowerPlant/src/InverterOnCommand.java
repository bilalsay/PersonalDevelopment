/**
 * Created by bilalsay on 23/04/2017.
 */
public class InverterOnCommand implements Command {

    private Inverter inverter;

    InverterOnCommand(Inverter inverter) {
        this.inverter = inverter;
    }

    public void execute() {
        inverter.on();
    }
}

