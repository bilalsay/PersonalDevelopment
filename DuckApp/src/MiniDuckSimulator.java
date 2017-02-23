/**
 * Created by bilalsay on 13.02.2017.
 */
public class MiniDuckSimulator {

    public static void main(String args[]) {
        Duck duck = new DecoyDuck();
        duck.performFly();
        duck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();
    }
}
