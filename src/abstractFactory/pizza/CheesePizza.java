package abstractFactory.pizza;

import abstractFactory.Pizza;

public class CheesePizza implements Pizza {
    @Override
    public void paint() {
        System.out.println("You are cooking Cheese Pizza ");
    }
}
