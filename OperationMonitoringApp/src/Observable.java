/**
 * Created by bilalsay on 18/02/2017.
 */
public interface Observable {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(Observer observer);
}
