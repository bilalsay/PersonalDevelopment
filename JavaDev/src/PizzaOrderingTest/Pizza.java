package PizzaOrderingTest;

/**
 * Created by bilalsay on 17/04/2017.
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggie veggies[];
    Cheese cheese;
    Pepperoni peeperoni;
    Clam clam;

    abstract void prepare();

    void bake() {}

    void cut() {}

    void box() {}

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
