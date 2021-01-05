package abstractFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("Cafe");
        Cake toy = abstractFactory.cookCake("Cafe");

        abstractFactory = FactoryProvider.getFactory("Restaurant");
        Pizza color =abstractFactory.cookPizza("Restaurant");
    }
}
