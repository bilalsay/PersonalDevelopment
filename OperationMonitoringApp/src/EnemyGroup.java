import java.util.Random;

/**
 * Created by bilalsay on 19/02/2017.
 */
public class EnemyGroup {

    public Location location;

    EnemyGroup() {
        location = new Location(0, 0);
    }

    public EnemyGroup move(int x, int y) {
        location.setXY(x, y);
        System.out.println("Düşman hareket ediyor...");
        return this;
    }


}
