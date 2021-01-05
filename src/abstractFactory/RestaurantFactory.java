package abstractFactory;

import abstractFactory.cake.CarrotCake;
import abstractFactory.cake.ChocolateCake;
import abstractFactory.pizza.CheesePizza;
import abstractFactory.pizza.PepperoniPizza;

public class RestaurantFactory implements AbstractFactory {
    @Override
    public Cake cookCake(String type) {
        if ("Carrot".equals(type)) {
            return new CarrotCake();
        } else if ("Chocolate".equals(type)) {
            return new ChocolateCake();
        }

        return null;
    }

    @Override
    public Pizza cookPizza(String type) {
        if ("Cheese".equals(type)) {
            return new CheesePizza();
        } else if ("Pepperoni".equals(type)) {
            return new PepperoniPizza();
        }

        return null;
    }
}
