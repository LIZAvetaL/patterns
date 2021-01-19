package strategy;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int numA, int numB) {
        return numA * numB;
    }
}