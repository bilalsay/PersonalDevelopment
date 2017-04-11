/**
 * Created by bilalsay on 18/02/2017.
 */
public abstract class DisplayElement implements DoubleObserver {

    protected Location soldierLocation;
    protected Location enemyGroupLocation;

    public abstract void display();
    public abstract void update(Location location1, Location location2);
}
