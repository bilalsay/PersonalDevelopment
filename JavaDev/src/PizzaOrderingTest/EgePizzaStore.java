package PizzaOrderingTest;

/**
 * Created by bilalsay on 17/04/2017.
 */
public class EgePizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new EgePizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Ege style Cheese pizza");
        } else if (item.equals("veggie")) {

        } else if (item.equals("clam")) {

        } else if (item.equals("pepperoni")) {

        }

        return pizza;
    }
}
