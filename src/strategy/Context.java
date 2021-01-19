package strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int numA, int numB){
        return strategy.doOperation(numA, numB);
    }
}