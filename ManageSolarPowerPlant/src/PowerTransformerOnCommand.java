/**
 * Created by bilalsay on 23/04/2017.
 */
public class PowerTransformerOnCommand implements Command {

    private PowerTransformer powerTransformer;

    PowerTransformerOnCommand(PowerTransformer powerTransformer) {
        this.powerTransformer = powerTransformer;
    }

    public void execute() {
        powerTransformer.on();
    }
}