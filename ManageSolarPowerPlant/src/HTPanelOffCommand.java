/**
 * Created by bilalsay on 23/04/2017.
 */
public class HTPanelOffCommand implements Command {

    private HTPanel htPanel;

    HTPanelOffCommand(HTPanel htPanel) {
        this.htPanel = htPanel;
    }

    public void execute() {
        htPanel.off();
    }
}