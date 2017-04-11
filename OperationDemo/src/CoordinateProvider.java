import java.util.ArrayList;

/**
 * Created by bilalsay on 18/02/2017.
 */
public class CoordinateProvider implements Observable, DoubleObserver {

    ArrayList<Observer> observerList;
    Location soldierLocation;
    Location enemyGroupLocation;

    CoordinateProvider() {
        observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer) {

        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {

        observerList.remove(observer);
    }

    public void notifyObserver(Observer observer) {

        ((DoubleObserver)observer).update(soldierLocation, enemyGroupLocation);
    }

    public void update(Location soldierLocation, Location enemyGroupLocation) {
        this.soldierLocation = soldierLocation;
        this.enemyGroupLocation = enemyGroupLocation;
        for (Observer observer: observerList)
            notifyObserver(observer);

    }
}
