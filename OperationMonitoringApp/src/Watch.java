/**
 * Created by bilalsay on 18/02/2017.
 */
public class Watch extends DisplayElement {

    Watch(Observable operationAssistant) {
        super.operationAssistant = operationAssistant;
        operationAssistant.registerObserver(this);
    }

    public void update(Location soldierLocation, Location enemyGroupLocation) {
        super.soldierLocation = soldierLocation;
        super.enemyGroupLocation = enemyGroupLocation;
        display();
    }

    public void display() {
        System.out.println( getOvnerOfDisplayElement().getName() + ", şuanki konumunuz: " + soldierLocation.getX() + "/" + soldierLocation.getY() + " ----- Düşman gurubunun konumu: " + enemyGroupLocation.getX() + "/" +enemyGroupLocation.getY());
    }
}
