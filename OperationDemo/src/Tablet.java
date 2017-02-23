/**
 * Created by bilalsay on 19/02/2017.
 */
public class Tablet implements DisplayElement {
    private Location soldierLocation;
    private Location enemyGroupLocation;

    public void update(Location soldierLocation, Location enemyGroupLocation) {
        this.soldierLocation = soldierLocation;
        this.enemyGroupLocation = enemyGroupLocation;
        display();
    }

    public void display() {
        System.out.println("Sizin: " + soldierLocation.getX() + "/"+ soldierLocation.getY() + " Düşmanın: " + enemyGroupLocation.getX() + "/" +enemyGroupLocation.getY());
    }
}
