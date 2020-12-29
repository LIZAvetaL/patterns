package abstract_factory;

public class Main {

    public static void main(String[] args) {
        CakeFactory factory = new CakeFactory();

        Cake chocolate = factory.getCake("CHOCOLATE");
        Cake carrot = factory.getCake("CARROT");

        chocolate.cook();
        carrot.cook();
    }
}
