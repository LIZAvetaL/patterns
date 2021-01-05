package abstractFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Cafe".equals(choice)){
            return new CafeFactory();
        }
        else if("Restaurant".equals(choice)){
            return new RestaurantFactory();
        }

        return null;
    }
}
