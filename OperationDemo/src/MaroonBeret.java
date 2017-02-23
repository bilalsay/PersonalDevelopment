import java.util.ArrayList;
import java.util.Random;

/**
 * Created by bilalsay on 18/02/2017.
 */
public class MaroonBeret extends Soldier {

    MaroonBeret(String name) {
        observerList = new ArrayList<>();
        super.name = name;
        location = new Location(0,0);
        location.addOvner(this);
        displayElement = new Watch();
        gun = new Rovelver(new Sarsur(300));

        stateNotify();
    }

    public Soldier move(int x, int y) {
        location.setXY(x, y);
        System.out.println("MaroonBeret " + name + " fark edilmeden hareket ediyor...");
        stateNotify();
        return this;
    }

    public void stateNotify() {
        for (Observer observer  : observerList)
            notifyObserver(observer);
    }
}
