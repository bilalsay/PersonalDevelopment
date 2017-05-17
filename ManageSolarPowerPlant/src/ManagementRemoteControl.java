/**
 * Created by bilalsay on 22/04/2017.
 */
public class ManagementRemoteControl implements Invoker {

    Command[] onCommands;
    Command[] offCommands;

    ManagementRemoteControl() {
        onCommands = new Command[27];
        offCommands = new Command[27];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = null;
            offCommands[i] = null;
        }

    }

    public void powerPlantStart() {

        // dfds
    }

    public void setOnCommand(int display, Command onCommand, Command offCommand) {
        onCommands[display] = onCommand;
        offCommands[display] = offCommand;
    }

    public void onWasTouched(int display) {
        onCommands[display].execute();
    }

    public void offWasTouched(int display) {
        offCommands[display].execute();
    }
}
