import java.util.ArrayList;

/**
 * Created by bilalsay on 19/02/2017.
 */
public class EnemyGroup implements Observable {

    private ArrayList<Observer> observerList;
    private Location location;
    private Gun gun;

    EnemyGroup() {
        location = new Location(0, 0);
        location.addOvner(this);
        observerList = new ArrayList<Observer>();
        stateNotify();
    }

    public EnemyGroup move(int x, int y) {
        location.setXY(x, y);
        System.out.println("Düşman hareket ediyor...");
        stateNotify();
        return this;
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver(Observer observer) {

        ((SingularObserver)observer).update(location);
    }

    public void stateNotify() {
        for (Observer observer  : observerList)
            notifyObserver(observer);
    }
}
