package abstractFactory;

public interface AbstractFactory {
    Cake cookCake(String type);
    Pizza cookPizza(String type);
}
