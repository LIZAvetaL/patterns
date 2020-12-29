package abstract_factory;

public class CakeFactory {

    public Cake getCake(String type) {
        Cake cake = null;
        switch (type) {
            case "CHOCOLATE":
                cake = new ChocolateCake();
                break;
            case "CARROT":
                cake = new CarrotCake();
                break;
        }
        return cake;
    }
}
