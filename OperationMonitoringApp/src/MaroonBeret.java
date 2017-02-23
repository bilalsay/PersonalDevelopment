import java.util.Random;

/**
 * Created by bilalsay on 18/02/2017.
 */
public class MaroonBeret extends Soldier {

    MaroonBeret(String name) {
        super.name = name;
        location = new Location(0,0);
        displayElement = new Watch(new OperationAssistant());
        displayElement.setOvnerOfDisplay(this);
        gun = new Rovelver(new Sarsur(300));
    }

    public Soldier move(int x, int y) {
        location.setXY(x, y);
        System.out.println("MaroonBeret " + name + " fark edilmeden hareket ediyor...");
        return this;
    }
}
