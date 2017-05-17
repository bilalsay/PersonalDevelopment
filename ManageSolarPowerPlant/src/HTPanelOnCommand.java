/**
 * Created by bilalsay on 23/04/2017.
 */
public class HTPanelOnCommand implements Command {

    private HTPanel htPanel;

    HTPanelOnCommand(HTPanel htPanel) {
        this.htPanel = htPanel;
    }

    public void execute() {
        htPanel.on();
    }
}