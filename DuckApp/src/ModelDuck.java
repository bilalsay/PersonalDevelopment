/**
 * Created by bilalsay on 13.02.2017.
 */
public class ModelDuck extends Duck {

    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a model duck");
    }
}
