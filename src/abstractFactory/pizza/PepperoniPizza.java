package abstractFactory.pizza;

import abstractFactory.Pizza;

public class PepperoniPizza implements Pizza {
    @Override
    public void paint() {
        System.out.println("You are cooking Pepperoni Pizza");
    }
}
