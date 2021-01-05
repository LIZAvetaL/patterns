package factoryMethod;

public class CakeFactory extends FoodFactory {
    public Food createFood(){
        return new Cake();
    }
}
