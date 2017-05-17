/**
 * Created by bilalsay on 23/04/2017.
 */
public class PowerTransformerOffCommand implements Command {

    private PowerTransformer powerTransformer;

    PowerTransformerOffCommand(PowerTransformer powerTransformer) {
        this.powerTransformer = powerTransformer;
    }

    public void execute() {
        powerTransformer.off();
    }
}