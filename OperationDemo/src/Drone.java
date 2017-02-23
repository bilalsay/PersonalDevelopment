import java.util.ArrayList;

/**
 * Created by bilalsay on 19/02/2017.
 */
public class Drone implements Observable, SingularObserver {

    ArrayList<Observer> observerList;
    Location soldierLocation;
    Location enemyGroupLocation;

    Drone() {
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

    public void update(Location location) {
        if (location.getOvner() instanceof Soldier) {
            soldierLocation = location;
            if (enemyGroupLocation == null)
                enemyGroupLocation = new Location(0, 0);
        } else if (location.getOvner() instanceof EnemyGroup) {
            if (soldierLocation == null)
                soldierLocation = new Location(0, 0);
            enemyGroupLocation = location;
        }

        for (Observer observer : observerList)
            notifyObserver(observer);



    }



}
