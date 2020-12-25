package facade;

public class Example {
    public static void main(String[] args) {
        ComputerInterface computer = new ComputerInterface();
        computer.start();
        computer.stop();
    }
}
