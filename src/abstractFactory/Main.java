package abstractFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("Cafe");
        Cake cake = abstractFactory.cookCake("Carrot");

        abstractFactory = FactoryProvider.getFactory("Restaurant");
        Pizza pizza =abstractFactory.cookPizza("Pepperoni");
    }
}
