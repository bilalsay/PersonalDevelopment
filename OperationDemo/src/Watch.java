/**
 * Created by bilalsay on 18/02/2017.
 */
public class Watch extends DisplayElement {

    public void update(Location soldierLocation, Location enemyGroupLocation) {
        this.soldierLocation = soldierLocation;
        this.enemyGroupLocation = enemyGroupLocation;
        display();
    }

    public void display() {
        System.out.println("Sizin: " + soldierLocation.getX() + "/"+ soldierLocation.getY() + " Düşmanın: " + enemyGroupLocation.getX() + "/" +enemyGroupLocation.getY());
    }
}
