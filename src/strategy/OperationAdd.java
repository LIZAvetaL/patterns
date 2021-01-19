package strategy;

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int numA, int numB) {
        return numA + numB;
    }
}
