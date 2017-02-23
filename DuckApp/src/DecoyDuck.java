/**
 * Created by bilalsay on 12.02.2017.
 */
public class DecoyDuck extends Duck {

    DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("DecoyDuck display");
    }


}