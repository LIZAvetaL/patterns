package strategy;

public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int numA, int numB) {
        return numA - numB;
    }
}