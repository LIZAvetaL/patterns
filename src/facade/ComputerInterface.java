package facade;

public class ComputerInterface {

    private ComputerPower power = new ComputerPower();
    private Download download = new Download();

    public void start() {
        power.powerOn();
        download.downloadInfo();
    }

    public void stop() {
        power.powerOff();
    }
}
