/**
 * Created by bilalsay on 18/02/2017.
 */
public abstract class DisplayElement implements Observer {

    protected Observable operationAssistant;
    protected Location soldierLocation;
    protected Location enemyGroupLocation;
    private Soldier ovner;

    public abstract void display();

    public void setOvnerOfDisplay(Soldier ovner) {
        this.ovner = ovner;
    }

    public Soldier getOvnerOfDisplayElement() {
        return this.ovner;
    }
}
