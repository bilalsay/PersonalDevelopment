import java.util.ArrayList;

/**
 * Created by bilalsay on 18/02/2017.
 */
public class OperationAssistant implements Observable {

    private ArrayList<Observer> observerList;
    private Drone drone;

    OperationAssistant() {
        observerList = new ArrayList<>();
    }

    public void setHelper(Drone drone) {
        this.drone = drone;
    }

    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver(Observer observer) {
        observer.update(drone.getSoldierLocation(((DisplayElement)observer).getOvnerOfDisplayElement()), drone.getEnemyLocation());
    }

    public Drone getDrone() {
        return drone;
    }
}
