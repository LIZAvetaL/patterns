package factoryMethod;

public class Main {
    public static void main(String[] args) {
        FoodFactory cakeFactory = new CakeFactory();
        FoodFactory pizzaFactory = new PizzaFactory();

        Food cake = cakeFactory.createFood();
        Food pizza = pizzaFactory.createFood();

        cake.paint();
        pizza.paint();
    }
}
