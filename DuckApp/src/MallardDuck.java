/**
 * Created by bilalsay on 12.02.2017.
 */
public class MallardDuck extends Duck {
    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squack();
    }

    public void display() {
        System.out.println("MallarDuck display");
    }


}
