import java.util.ArrayList;

/**
 * Created by bilalsay on 19/02/2017.
 */
public class Drone {

    private ArrayList<Soldier> monitoredSoldiers;
    private EnemyGroup monitoredEnemyGroup;

    Drone(ArrayList<Soldier> monitoredSoldiers, EnemyGroup monitoredEnemyGroup) {
        this.monitoredSoldiers = monitoredSoldiers;
        this.monitoredEnemyGroup = monitoredEnemyGroup;
    }
    public Location getEnemyLocation() {
        return this.monitoredEnemyGroup.location;
    }

    public Location getSoldierLocation(Soldier soldier) {
        return this.monitoredSoldiers.get(this.monitoredSoldiers.indexOf(soldier)).location;
    }

}
