import java.util.ArrayList;

/**
 * Created by bilalsay on 18/02/2017.
 */
public class Operation {

    public static void main(String args[]) {

        ArrayList<Soldier> soldiers = new ArrayList<>();
        OperationAssistant operationAssistant = new OperationAssistant();
        Soldier mb5 = new MaroonBeret("mb5");
        Soldier mb6 = new MaroonBeret("mb6");
        Soldier mb8 = new MaroonBeret("mb8");

        soldiers.add(mb5);
        soldiers.add(mb6);
        soldiers.add(mb8);

        EnemyGroup enemyGroup = new EnemyGroup();
        Drone drone = new Drone(soldiers, enemyGroup);
        operationAssistant.setHelper(drone);

        for (Soldier soldier: soldiers)
            operationAssistant.registerObserver(soldier.getDisplayElement());



        mb8
                .move(3, 5)
                .move(6, 10)
                .move(12, 40)
                .bamm()
                .bamm()
                .changeSarsur(new Sarsur(500))
                .bamm()
                .move(12, 45)
                .bamm()
                .move(12, 98)
                .bamm()
                .changeSarsur(new Sarsur(20))
                .bamm();

        enemyGroup
                .move(12, 100);

        mb5
                .move(12, 30)
                .move(20, 70)
                .bamm();

        enemyGroup
                .move(12, 120);

        mb5
                .changeSarsur(new Sarsur(1000))
                .move(24, 88)
                .bamm();


        while (true) {
            for (Soldier soldier : soldiers)
                operationAssistant.notifyObserver(soldier.getDisplayElement());

        }

    }
}
